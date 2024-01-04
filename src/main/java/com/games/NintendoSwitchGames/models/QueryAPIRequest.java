package com.games.NintendoSwitchGames.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class QueryAPIRequest implements Serializable {
    public QueryAPIRequest() {
        QueryRequestAttributes attributes = new QueryRequestAttributes();

        requests = new ArrayList<QueryRequestAttributes>();
        requests.add(attributes);
    }

    public QueryAPIRequest(String search) {
        QueryRequestAttributes attributes = new QueryRequestAttributes();
        attributes.query = search;

        requests = new ArrayList<QueryRequestAttributes>();
        requests.add(attributes);
    }

    @Getter
    @Setter
    public List<QueryRequestAttributes> requests;
}
