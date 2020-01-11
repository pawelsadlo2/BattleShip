package com.pawelsadlo2.battleShip.game.model;

import org.springframework.stereotype.Component;

@Component
public interface IBoard {

    IFieldsContainer getFieldsContainer();

    //IShipContainer getShipContainer();

    int getVerticalSize();

    int getHorizontalSize();

    boolean placeShip(IShip ship, ICoordinates startCoordinates, Direction direction);
}
