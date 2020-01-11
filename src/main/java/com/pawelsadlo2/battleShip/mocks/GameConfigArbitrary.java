package com.pawelsadlo2.battleShip.mocks;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import com.pawelsadlo2.battleShip.game.userInteraction.IGameConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class GameConfigArbitrary implements IGameConfig {

    private int playersNumber = 2;
    private int[] boardSize = {10, 10};
    static private Map<Integer, Integer> shipSizeCountMap = new HashMap<>();

    static {
        shipSizeCountMap.put(1, 5);
        shipSizeCountMap.put(2, 4);
        shipSizeCountMap.put(3, 3);
        shipSizeCountMap.put(4, 5);
        shipSizeCountMap.put(5, 1);
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
