package com.games.NintendoSwitchGames.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class APIRequest implements Serializable {
    public APIRequest() {
        RequestAttributes attributes = new RequestAttributes();

        requests = new ArrayList<RequestAttributes>();
        requests.add(attributes);
    }

    public APIRequest(RequestAttributes attributes) {
        requests = new ArrayList<RequestAttributes>();
        requests.add(attributes);
    }

    @Getter
    @Setter
    public List<RequestAttributes> requests;
}
