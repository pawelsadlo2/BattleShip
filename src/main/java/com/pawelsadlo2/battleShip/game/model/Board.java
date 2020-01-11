package com.pawelsadlo2.battleShip.game.model;


import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Board implements IBoard {
    private IShipContainer shipContainer;
    private IFieldsContainer fieldsContainer;
    private int verticalSize;
    private int horizontalSize;

    @Autowired
    public Board(IShipContainer shipContainer, IFieldsContainer fieldsContainer, IGameConfig config) {
        this.shipContainer = shipContainer;
        this.fieldsContainer = fieldsContainer;
        this.horizontalSize = config.getBoardSize()[0];
        this.verticalSize = config.getBoardSize()[1];
    }

    public int getVerticalSize() {
        return this.verticalSize;
    }

    public int getHorizontalSize() {
        return this.horizontalSize;
    }


    public IFieldsContainer getFieldsContainer() {
        return fieldsContainer;
    }
/*
    public IShipContainer getShipContainer() {
        return shipContainer;
    }*/

 /*   private generateFields(int length, Coordinates startCoordinates, Direction direction) {

    }*/



    public boolean placeShip(IShip ship, ICoordinates startCoordinates, Direction direction) {
        ship.getFields().size();
        switch (direction) {
            case LEFT:

            case RIGHT:

            case UP:

            case DOWN:

        }

        int shipLength = ship.getFields().size();

        return true;
    }


}
