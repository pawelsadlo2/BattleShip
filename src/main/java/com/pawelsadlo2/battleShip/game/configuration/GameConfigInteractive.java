package com.pawelsadlo2.battleShip.game.configuration;

import com.pawelsadlo2.battleShip.game.userInteraction.IGameConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class GameConfigInteractive implements IGameConfig {

    private int playersNumber;
    private int[] boardSize;
    private Map<Integer, Integer> shipSizeCountMap = new HashMap<>();

    @Autowired
    public GameConfigInteractive(IGameConfigurator configurator) {
        configurator.fillConfig(this);
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    public int[] getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int[] boardSize) {
        this.boardSize = boardSize;
    }

    public void setShipSizeCountMap(Map<Integer, Integer> map) {
        shipSizeCountMap = map;
    }

    public Map<Integer, Integer> getShipSizeCountMap() {
        return shipSizeCountMap;
    }


}
