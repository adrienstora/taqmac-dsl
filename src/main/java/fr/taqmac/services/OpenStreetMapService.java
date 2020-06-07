package fr.taqmac.services;

import fr.taqmac.utils.ResponseHttpUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class OpenStreetMapService {

    public static final String getBaseURL = "https://nominatim.openstreetmap.org/";


    public static ResponseEntity<String> search(String localisation) throws IOException {

        ResponseHttpUtils response = HTTPService.call(getBaseURL + "/search/" + localisation + "?format=json", HTTPService.GET);
        String detailLocalisation = response.getResultContent();
        if (response.getResultCode() == HttpStatus.OK.value())
            return HTTPService.createResponse(detailLocalisation, HttpStatus.OK);
        else
            return HTTPService.createResponse("", HttpStatus.INTERNAL_SERVER_ERROR);
    }


    public static ResponseEntity<String> getArrival() throws IOException {

        String adress = "17 Avenue Didier Daurat, Blagnac, France";
        ResponseEntity<String> arrival = OpenRouteService.autocomplete(adress);
        System.out.println(arrival.getBody());
        return HTTPService.createResponse(arrival.getBody(),HttpStatus.OK);
    }



}
