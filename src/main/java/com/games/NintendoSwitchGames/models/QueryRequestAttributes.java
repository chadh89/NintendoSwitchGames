package com.games.NintendoSwitchGames.models;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class QueryRequestAttributes implements Serializable {    
    public QueryRequestAttributes() {
        indexName = "store_game_en_us";
        query = ""; //The actual search value/string (i.e. "zelda")
        params = "filters=&hitsPerPage=10&analytics=true&facetingAfterDistinct=true&clickAnalytics=true&highlightPreTag=^*^^&highlightPostTag=^*&attributesToHighlight=[\"description\"]";
    }

    // public QueryRequestAttributes(String indexName, String query, String params) {
    //     this.indexName = indexName;
    //     this.query = query;
    //     this.params = params;
    // }
    // public QueryRequestAttributes(String query) {
    //     indexName = "store_game_en_us";
    //     this.query = query;
    //     params = "filters=&hitsPerPage=10&analytics=true&facetingAfterDistinct=true&clickAnalytics=true&highlightPreTag=^*^^&highlightPostTag=^*&attributesToHighlight=[\"description\"]";
    // }

    @Getter
    @Setter
    public String indexName;

    @Getter
    @Setter
    public String query;

    @Getter
    @Setter
    public String params;
}
