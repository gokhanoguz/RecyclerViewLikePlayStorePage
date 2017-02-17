package com.javatar.recyclerviewlikeplaystorepage.model;

import java.util.List;

/**
 * Created by gokhan on 17-Feb-17.
 */

public class GameGroupModel {

    private String groupTitle;
    private List<GameModel> gameModelList;

    public GameGroupModel() {
    }

    public GameGroupModel(String groupTitle, List<GameModel> gameModelList) {
        this.groupTitle = groupTitle;
        this.gameModelList = gameModelList;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public List<GameModel> getGameModelList() {
        return gameModelList;
    }

    public void setGameModelList(List<GameModel> gameModelList) {
        this.gameModelList = gameModelList;
    }
}