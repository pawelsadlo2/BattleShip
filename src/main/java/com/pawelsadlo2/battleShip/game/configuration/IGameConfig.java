package com.pawelsadlo2.battleShip.game.configuration;


import com.pawelsadlo2.battleShip.game.userInteraction.IGameConfigurator;
import org.springframework.stereotype.Component;

import java.util.Map;


public interface IGameConfig extends IHasPlayersNumber {

    void setBoardSize(int[] boardSize);

    public int[] getBoardSize();

    public void setShipSizeCountMap(Map<Integer, Integer> map);

    public Map<Integer, Integer> getShipSizeCountMap();

}
