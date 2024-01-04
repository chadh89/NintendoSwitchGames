package com.games.NintendoSwitchGames.models;

import lombok.Getter;
import lombok.Setter;

public class QueriedGameDetails {
    /**
     * Additional information returned by the API, it doesn't really serve any
     * purpose but documenting it anyway because it's there.
     */
    @Getter
    @Setter
    public int _distinctSeqID;

    /**
     * Additional information returned by the API, it doesn't really serve any
     * purpose but documenting it anyway because it's there.
     */
    @Getter
    @Setter
    public HighlightResult _highlightResult;

    /** Whether this game is available or not */
    @Getter
    @Setter
    public String[] availability;

    /**
     * The box art of the game, if any. Generally undefined for games that are yet
     * to release.
     */
    @Getter
    @Setter
    public String boxart;

    @Getter
    @Setter
    public String classindDescriptors;

    @Getter
    @Setter
    public String classindRating;

    @Getter
    @Setter
    public String collectionPriceRange;

    @Getter
    @Setter
    public String contentRatingCode;

    @Getter
    @Setter
    public String[] corePlatforms;

    @Getter
    @Setter
    public String createdAt;

    @Getter
    @Setter
    public String demoNsuid;

    @Getter
    @Setter
    public int depth;

    /** A description about this game */
    @Getter
    @Setter
    public String description;

    /** A list of companies that developed this game */
    @Getter
    @Setter
    public String[] developers;

    /** A list of {@link https://www.esrb.org/ratings-guide/ ESRB descriptors} */
    @Getter
    @Setter
    public String[] esrbDescriptors;

    /** The {@link https://www.esrb.org/ratings-guide/ ESRB Rating} */
    @Getter
    @Setter
    public String esrbRating;

    @Getter
    @Setter
    public boolean exclusive;

    /**
     * Whether this game is featured on the {@link https://www.nintendo.com
     * nintendo.com} homepage
     */
    @Getter
    @Setter
    public boolean featured;

    /**
     * Whether this game is featured on the {@link https://www.nintendo.com
     * nintendo.com} homepage
     */
    @Getter
    @Setter
    public boolean featuredProduct;

    /** The franchises this game is a part of */
    @Getter
    @Setter
    public String[] franchises;

    /** Whether this game is free to start */
    @Getter
    @Setter
    public boolean freeToStart;

    /**
     * A list of general filters that could potentially be searched on
     * {@link https://www.nintendo.com nintendo.com} to find this game with
     */
    @Getter
    @Setter
    public String[] generalFilters;

    /** A list of genres this game */
    @Getter
    @Setter
    public String[] genres;

    /** Whether this game has downloadable content or not */
    @Getter
    @Setter
    public boolean hasDlc;

    /** A large wide image such as a screenshot or artwork of the game, if any. */
    @Getter
    @Setter
    public String headerImage;

    /**
     * The asset slug of a large wide image such as a screenshot or artwork of the
     * game, if any.
     */
    @Getter
    @Setter
    public String horizontalHeaderImage;

    /**
     * A list of methods through which the game can be acquired, such as retail or
     * digital download.
     */
    @Getter
    @Setter
    public String[] howToShop;

    /**
     * A Unix timestamp in **milliseconds** indicating when the information on this
     * game was last modified
     */
    @Getter
    @Setter
    public int lastModified;

    /** The lowest price at which this game was ever sold */
    @Getter
    @Setter
    public int lowestPrice;

    /**
     * The {@link https://en.wikipedia.org/wiki/List_price manufacturer's suggested
     * retail price} for this game
     */
    @Getter
    @Setter
    public int msrp;

    /**
     * Features that added to this game when the player has a Nintendo Switch Online
     * subscription
     */
    @Getter
    @Setter
    public String[] nsoFeatures;

    /** The unique ID for this game. */
    @Getter
    @Setter
    public String nsuid;

    /** The amount of players that can simultaneously play this game */
    @Getter
    @Setter
    public String numOfPlayers;

    /**
     * A unique {@link https://en.wikipedia.org/wiki/Universally_unique_identifier
     * GUID} that represents this game's entry in the Nintendo API.
     */
    @Getter
    @Setter
    public String objectID;

    /** The platform this game released on */
    @Getter
    @Setter
    public String platform;

    /**
     * A unique identifier of the platform the game was released on
     * 
     * @example 'NINTENDO_SWITCH'
     */
    @Getter
    @Setter
    public String platformCode;

    @Getter
    @Setter
    public String platinumPoints;

    /**
     * The amount of players that can simultaniously play this game
     * 
     * @example 'Single Player'
     */
    @Getter
    @Setter
    public String playerCount;

    /**
     * A list of player filters that could potentially be searched on
     * {@link https://www.nintendo.com nintendo.com} to find this game with
     */
    @Getter
    @Setter
    public String[] playerFilters;

    /**
     * An array of ways this game can be played
     * 
     * @example ['TV mode', 'Tabletop mode', 'Handheld mode']
     */
    @Getter
    @Setter
    public String[] playModes;

    /** The price information for this game */
    @Getter
    @Setter
    public Price price;

    /**
     * A category price range that this game falls under. Can be used on
     * {https://www.nintendo.com nintendo.com} to find this game with
     */
    @Getter
    @Setter
    public String priceRange;

    @Getter
    @Setter
    public int priority;

    /** The slug to a product image of this game */
    @Getter
    @Setter
    public String productImage;

    /** The date this game was published */
    @Getter
    @Setter
    public String publishDate;

    /** A list of companies that published this game */
    @Getter
    @Setter
    public String[] publishers;

    /**
     * A display of the release of this game. Can be either an ISO timestamp or some
     * other representation of date.
     * Nintendo has a tendency to also have entries such as `Early 2022` or `Late
     * 2021` here. Normally these kinds of dates would not be parsed by JavaScript,
     * but NodeJS does parse these natural input types.
     */
    @Getter
    @Setter
    public String releaseDateDisplay;

    /** The price of this game if and when it is on sale */
    @Getter
    @Setter
    public int salePrice;

    /** the SKU ID for this game */
    @Getter
    @Setter
    public String sku;

    /**
     * A unique {@link https://en.wikipedia.org/wiki/Clean_URL#Slug slug} for this
     * game
     */
    @Getter
    @Setter
    public String slug;

    /**
     * The SMEC
     * ({@link https://en.wikipedia.org/wiki/Video_game_content_rating_system#Mexico
     * Sistema Mexicano de Equivalencias de Clasificación})
     * descriptors for this game
     */
    @Getter
    @Setter
    public String[] smecDescriptors;

    /**
     * The SMEC
     * ({@link https://en.wikipedia.org/wiki/Video_game_content_rating_system#Mexico
     * Sistema Mexicano de Equivalencias de Clasificación})
     * rating for this game
     */
    @Getter
    @Setter
    public String smecRating;

    /**
     * The developer of this game
     */
    @Getter
    @Setter
    public String softwareDeveloper;

    /**
     * The publisher of this game
     */
    @Getter
    @Setter
    public String softwarePublisher;

    /** The title of this game */
    @Getter
    @Setter
    public String title;

    /**
     * The top level category of this game
     * 
     * @example 'Games'
     */
    @Getter
    @Setter
    public String topLevelCategory;

    /**
     * The top level category code of this game
     * 
     * @example 'GAMES'
     */
    @Getter
    @Setter
    public String topLevelCategoryCode;

    /** The top level filters for this game */
    @Getter
    @Setter
    public String[] topLevelFilters;

    /**
     * The type of search result
     * 
     * @example 'game'
     */
    @Getter
    @Setter
    public String type;

    /**
     * An ISO timestamp of when this game was last updated
     */
    @Getter
    @Setter
    public String updatedAt;

    /**
     * A unique to the information about this game. Prefix it with
     * `https://www.nintendo.com` to have a valid URL.
     */
    @Getter
    @Setter
    public String url;

    /**
     * The key segment of the {@link QueriedGameUS.url}, often the last segment of
     * the URL
     */
    @Getter
    @Setter
    public String urlKey;

    /**
     * Whether this game is visible when searching for it on
     * https://www.nintendo.com
     */
    @Getter
    @Setter
    public boolean visibleInSearch;
}
