package com.games.NintendoSwitchGames.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class GameDetails {
    public GameDetails() {}

    @Getter
    @Setter
    public String lastModified;

    @Getter
    @Setter
    public String title;

    @Getter
    @Setter
    public String description;

    @Getter
    @Setter
    public String url;

    @Id
    @Getter
    @Setter
    public String nsuid;

    @Getter
    @Setter
    public String slug;

    @Getter
    @Setter
    public String boxart;

    @Getter
    @Setter
    public String horizontalHeaderImage;

    @Getter
    @Setter
    public String platform;

    @Getter
    @Setter
    public String releaseDateDisplay;

    @Getter
    @Setter
    public String esrbRating;

    @Getter
    @Setter
    public String numOfPlayers;

    @Getter
    @Setter
    public String featured;

    @Getter
    @Setter
    public String freeToStart;

    @Getter
    @Setter
    public String[] esrbDescriptors;

    @Getter
    @Setter
    public String[] franchises;

    @Getter
    @Setter
    public String[] genres;

    @Getter
    @Setter
    public String[] publishers;

    @Getter
    @Setter
    public String[] developers;

    @Getter
    @Setter
    public String[] generalFilters;

    @Getter
    @Setter
    public String[] howToShop;

    @Getter
    @Setter
    public String[] playerFilters;

    @Getter
    @Setter
    public String priceRange;

    @Getter
    @Setter
    public String msrp;

    @Getter
    @Setter
    public String salePrice;

    @Getter
    @Setter
    public String lowestPrice;

    @Getter
    @Setter
    public String[] availability;

    @Getter
    @Setter
    public String objectID;

    @Getter
    @Setter
    public String boxartIcon;
}
