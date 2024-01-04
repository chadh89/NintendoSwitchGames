package com.games.NintendoSwitchGames.models;

import lombok.Getter;
import lombok.Setter;

public class HighlightResult {
    @Getter
    @Setter
    public Nsuid nsuid;

    @Getter
    @Setter
    public Nsuid[] publishers;

    @Getter
    @Setter
    public Nsuid title;
}
