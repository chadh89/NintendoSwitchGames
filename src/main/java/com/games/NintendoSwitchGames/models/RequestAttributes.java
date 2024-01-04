package com.games.NintendoSwitchGames.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class RequestAttributes implements Serializable {
    public RequestAttributes() {
        indexName = "ncom_game_en_us_title_asc";
        hitsPerPage = 40;
        page = 0;
        analytics = false;
        facets = new String[]{"generalFilters", "platform:Nintendo Switch", "availability", "genres", "howToShop", "virtualConsole", "franchises", "priceRange", "esrbRating", "playerFilters"};
        facetFilters = new String[]{"platform:Nintendo Switch"};
    }

    public RequestAttributes(String indexName, int hitsPerPage, int page, boolean analytics, String[] facets, String[] facetFilters) {
        this.indexName = indexName;
        this.hitsPerPage = hitsPerPage;
        this.page = page;
        this.analytics = analytics;
        this.facets = facets;
        this.facetFilters = facetFilters;
    }

    @Getter
    @Setter
    public String indexName;
    
    @Getter
    @Setter
    public int hitsPerPage;

    @Getter
    @Setter
    public int page;

    @Getter
    @Setter
    public boolean analytics;

    @Getter
    @Setter
    public String[] facets;

    @Getter
    @Setter
    public String[] facetFilters;
}
