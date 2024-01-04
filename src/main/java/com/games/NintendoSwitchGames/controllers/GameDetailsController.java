package com.games.NintendoSwitchGames.controllers;

import com.games.NintendoSwitchGames.models.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GameDetailsController {
    private final Logger logger = LoggerFactory.getLogger(GameDetailsController.class);

    private final String uri = "https://U3B6GR4UA3-dsn.algolia.net/1/indexes/*/queries";
    private final String apiKey = "c4da8be7fd29f0f5bfa42920b0a99dc7";
    private final String queryApiKey = "a29c6927638bfd8cee23993e51e721c9";
    private final String apiId = "U3B6GR4UA3";

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");

        //modelAndView.addObject("gameList", getGameList());
        //modelAndView.addObject("gameList", getQueriedGameList(""));
        QueryRequestAttributes queryRequestAttributes = new QueryRequestAttributes();
        modelAndView.addObject("search", queryRequestAttributes);

        return modelAndView;
    }

    @PostMapping("/gameList")
    public GameDetails[] getGameList() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        APIRequest requests = new APIRequest();
        APIResponse response = new APIResponse();
        APIHits hits = new APIHits();
        
        // Set headers
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Algolia-API-Key", this.apiKey);
        headers.set("X-Algolia-Application-Id", this.apiId);

        // Create entity with APIRequest class and headers
        HttpEntity<APIRequest> httpEntity = new HttpEntity<>(requests, headers);

        // Make POST request
        try {
            ResponseEntity<APIResponse> results = restTemplate.postForEntity(this.uri, httpEntity, APIResponse.class);

            response = results.getBody();
            hits = response.getResults().get(0);
            GameDetails[] gameList = new GameDetails[hits.getHits().size()];
            hits.getHits().toArray(gameList);

            // Log and return results
            logger.info("Response: " + gameList);
            return gameList;
        } catch(HttpStatusCodeException e) {
            String error = e.getResponseBodyAsString();
            logger.error(error);

            return null;
        }
    }

    @PostMapping("/")
    public ModelAndView getQueriedGameList(@ModelAttribute("search") QueryRequestAttributes search) {
        logger.info("Search query: " + search.query);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        QueryAPIRequest requests = new QueryAPIRequest(search.query);
        QueriedAPIResponse response = new QueriedAPIResponse();
        QueriedAPIHits hits = new QueriedAPIHits();

        // Set headers
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Algolia-API-Key", this.queryApiKey);
        headers.set("X-Algolia-Application-Id", this.apiId);

        // Create entity with APIRequest class and headers
        HttpEntity<QueryAPIRequest> httpEntity = new HttpEntity<>(requests, headers);

        // ModelAndView for return to index
        ModelAndView modelAndView = this.index();
        modelAndView.addObject("search", search);

        // Make POST request
        try {
            ResponseEntity<QueriedAPIResponse> results = restTemplate.postForEntity(this.uri, httpEntity, QueriedAPIResponse.class);

            response = results.getBody();
            hits = response.getResults().get(0);
            QueriedGameDetails[] gameList = new QueriedGameDetails[hits.getHits().size()];
            hits.getHits().toArray(gameList);

            // Send results to view
            modelAndView.addObject("gameList", gameList);

            // Log results
            logger.info("Response: " + gameList);
        } catch(HttpStatusCodeException e) {
            // Log error
            String error = e.getResponseBodyAsString();
            logger.error(error);
        }

        return modelAndView;
    }
}
