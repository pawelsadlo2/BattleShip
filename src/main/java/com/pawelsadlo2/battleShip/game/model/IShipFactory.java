package com.pawelsadlo2.battleShip.game.model;

public interface IShipFactory {

    IShip getShip(int size);

    Integer shipsLeft(int size);

    Integer shipsLeft();
}
