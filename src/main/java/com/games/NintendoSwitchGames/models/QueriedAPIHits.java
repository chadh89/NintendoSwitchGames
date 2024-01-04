package com.games.NintendoSwitchGames.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class QueriedAPIHits {
    public QueriedAPIHits() { }

    @Getter
    @Setter
    public List<QueriedGameDetails> hits;
}
