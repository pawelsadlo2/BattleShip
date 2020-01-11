package com.pawelsadlo2.battleShip.game.model;

public interface IShipPlacer {
    IShip isLegal(String startField, Integer shipSize, Direction direction, IBoard board);
}
