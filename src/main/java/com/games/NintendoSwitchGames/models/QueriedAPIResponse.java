package com.games.NintendoSwitchGames.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class QueriedAPIResponse {
    public QueriedAPIResponse() { }

    @Getter
    @Setter
    public List<QueriedAPIHits> results;
}
