package fr.taqmac.services;

import fr.taqmac.parser.TisseoParser;
import fr.taqmac.utils.ResponseHttpUtils;
import org.apache.tomcat.util.buf.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;


@RestController
public class TisseoApiParserService {

	public static final String getBaseURL = "https://api.tisseo.fr/v1";
	public static final String getKey = "6c4a04f8-06db-405e-a5fd-58c89937b44f";


	@GetMapping(value = "/tisseo/search/{localisation}")
	private ResponseEntity<String> search(@PathVariable String localisation) throws IOException {

		ResponseHttpUtils response = HTTPService.call(getBaseURL + "/places.json?term=" + localisation + "&key=" + getKey, HTTPService.GET);
		String detailLocalisation = response.getResultContent();
		if (response.getResultCode() == HttpStatus.OK.value())
			return HTTPService.createResponse(detailLocalisation, HttpStatus.OK);
		else
			return HTTPService.createResponse("", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	// Format : 1.43697,43.5849 par point
	// FORMAT TransportModeList: métro,bus,tramway séparé par des virgules dans l'url.
	@GetMapping(value = "/tisseo/listPoints/{localisationStart}/{localisationEnd}/{transportModeList}")
	private ResponseEntity<String> listPoints(@PathVariable String localisationStart,
											  @PathVariable String localisationEnd,
											  @PathVariable String[] transportModeList)
			throws IOException {

		String rollingStocksURL = getBaseURL + "/rolling_stocks.json";
		ResponseHttpUtils responseRollingStocksURL = HTTPService.call(rollingStocksURL, HTTPService.GET);
		JSONObject rollingStocksObject = new JSONObject(responseRollingStocksURL.getResultContent());
		JSONArray rollingStocks = rollingStocksObject.getJSONArray("rollingStocks");

		System.out.println(rollingStocks);

		String url = getBaseURL + "/journeys.json?departurePlaceXY=" + localisationStart
				+ "&arrivalPlaceXY=" + localisationEnd + "&displayWording=1&key=" + getKey + "&rollingStockList=";

		ArrayList<String> listId = new ArrayList<>();
		for(String t : transportModeList) {
			for (int i = 0 ; i < rollingStocks.length(); i++) {
				JSONObject obj = rollingStocks.getJSONObject(i);
				String name = obj.getString("name");
				String id = obj.getString("id");
				System.out.println(id);
				if (name.equals(t)){
					listId.add(id);
					//url += id + ",";
				}
			}
		}
		url += StringUtils.join(listId, ',');
		System.out.println(url);

		ResponseHttpUtils response = HTTPService.call(url, HTTPService.GET);
		String journeys = response.getResultContent();

		System.out.printf(TisseoParser.getJourneysText(journeys).toString());

		if (response.getResultCode() == HttpStatus.OK.value())
			return HTTPService.createResponse(journeys, HttpStatus.OK);
		else
			return HTTPService.createResponse("", HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
