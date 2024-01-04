package com.games.NintendoSwitchGames.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class APIHits {
    public APIHits() { }

    @Getter
    @Setter
    public List<GameDetails> hits;
}
