package fr.taqmac.services;

import fr.taqmac.utils.ResponseHttpUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


public class OpenRouteService {

    public static final String getBaseURL = "https://api.openrouteservice.org";
    public static final String getKey = "5b3ce3597851110001cf6248c3e0f4ea0c98469b87828a7ec113cc29";

    public static ResponseEntity<String> autocomplete(String text) throws IOException {

        ResponseHttpUtils response = HTTPService.call(getBaseURL + "/geocode/autocomplete?text=" + text +
                "&api_key=" + getKey + "&boundary.country=FR", HTTPService.GET);
        String listAutoComplete = response.getResultContent();
        System.out.println(listAutoComplete);
        JSONObject listAutoCompleteJson = new JSONObject(listAutoComplete);
        JSONArray listAutoCompleteArray = listAutoCompleteJson.getJSONArray("features");
        JSONArray resultListAutoComplete = new JSONArray();
        for (int i = 0 ; i < listAutoCompleteArray.length(); i++) {
            JSONObject element = listAutoCompleteArray.getJSONObject(i);
            JSONObject resultJo = new JSONObject();
            JSONArray coordonnees = element.getJSONObject("geometry").getJSONArray("coordinates");
            resultJo.put("x",coordonnees.getFloat(0));
            resultJo.put("y",coordonnees.getFloat(1));
            resultJo.put("label",element.getJSONObject("properties").getString("label"));
            resultListAutoComplete.put(resultJo);
        }


        if (response.getResultCode() == HttpStatus.OK.value())
            return HTTPService.createResponse(resultListAutoComplete.toString(), HttpStatus.OK);
        else
            return HTTPService.createResponse("", HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
