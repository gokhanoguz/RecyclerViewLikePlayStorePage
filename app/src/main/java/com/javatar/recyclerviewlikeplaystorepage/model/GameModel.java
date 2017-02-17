package com.javatar.recyclerviewlikeplaystorepage.model;

/**
 * Created by gokhan on 17-Feb-17.
 */

public class GameModel {

    private String gameName;
    private String gameUrl;
    private String gameDescription;

    public GameModel() {
    }

    public GameModel(String gameName, String gameUrl, String gameDescription) {
        this.gameName = gameName;
        this.gameUrl = gameUrl;
        this.gameDescription = gameDescription;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameUrl() {
        return gameUrl;
    }

    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }
}
