package com.games.NintendoSwitchGames.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class APIResponse {
    public APIResponse() { }

    @Getter
    @Setter
    public List<APIHits> results;
}
