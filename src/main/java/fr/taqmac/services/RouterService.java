package fr.taqmac.services;

import java.io.IOException;

import fr.taqmac.parser.OpenRouteServiceParser;
import fr.taqmac.parser.TisseoParser;
import fr.taqmac.utils.ResponseHttpUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouterService {

    // OpenRouteService
    @GetMapping(value = "/geocode/autocomplete/{text}")
    private ResponseEntity<String> autocomplete(@PathVariable String text) throws IOException {
        return OpenRouteService.autocomplete(text);
    }


    //OpenStreetMap
    @GetMapping(value = "/map/search/{localisation}")
    private ResponseEntity<String> searchOpenStreetmap(@PathVariable String localisation) throws IOException {
        return OpenStreetMapService.search(localisation);
    }

    @GetMapping(value = "/getArrival")
    private ResponseEntity<String> getArrival() throws IOException {
        String arrival = "Altran";
        return HTTPService.createResponse(arrival, HttpStatus.OK);
    }
    //TisseoApi

    @GetMapping(value = "/tisseo/search/{localisation}")
    private ResponseEntity<String> searchTisseo(@PathVariable String localisation) throws IOException {

        return TisseoApiParserService.search(localisation);
    }

    // Format : 1.43697,43.5849 par point
    // FORMAT TransportModeList: métro,bus,tramway,pied,voiture séparé par des virgules dans l'url.
    @GetMapping(value = "/listPoints/{localisationStart}/{localisationEnd}/{transportModeList}")
    private ResponseEntity<String> listPoints(@PathVariable String localisationStart,
                                              @PathVariable String localisationEnd,
                                              @PathVariable String[] transportModeList)
            throws IOException {

        String url = "";
        for (String modeTransport :transportModeList ) {


            switch (modeTransport) {
                case "voiture":
                    modeTransport = "driving-car";
                    url = OpenRouteServiceService.getUrl(localisationStart,localisationEnd,modeTransport);
                    break;
                case "bus":
                    modeTransport = "bus";
                    break;
                case "metro":
                    modeTransport = "métro";
                    break;
                default:

            }
        }
            ResponseHttpUtils response = HTTPService.call(url, HTTPService.GET);
            String journeys = response.getResultContent();

            System.out.printf(TisseoParser.getJourneysText(journeys).toString());

            if (response.getResultCode() == HttpStatus.OK.value())
                return HTTPService.createResponse(journeys, HttpStatus.OK);
            else
                return HTTPService.createResponse("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}