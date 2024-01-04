package com.games.NintendoSwitchGames.models;

public class Price {
    /** The regular price for this game */
    public String regPrice;
    /**
     * The final price for this game,
     * which is {@link QueriedGameUS.price.salePrice} if the game is on sale or {@link QueriedGameUS.price.regPrice} if it is not.
     */
    public String finalPrice;
    /**
     * The sale price for this game, or `null` if the game has never been on sale.
     */
    public String salePrice;
}
