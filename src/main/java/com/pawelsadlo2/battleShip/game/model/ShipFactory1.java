package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;

import java.util.NoSuchElementException;

public class ShipFactory1 implements IShipFactory {
    private IGameConfig gameConfig;

    public ShipFactory1(IGameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }

    public Integer shipsLeft(int size) {
        return gameConfig.getShipSizeCountMap().get(size);
    }

    public Integer shipsLeft() {
        return gameConfig.getShipSizeCountMap().values().stream().mapToInt(x -> x).sum();
    }

    public IShip getShip(int size) {
        if (shipsLeft(size) > 0) {
            gameConfig.getShipSizeCountMap().replace(size, shipsLeft(size) - 1);
            return new SimpleShip(size);
        } else throw new NoSuchElementException("No ships of specified size left");
    }

}
