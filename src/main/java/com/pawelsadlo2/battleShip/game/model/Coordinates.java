package com.pawelsadlo2.battleShip.game.model;


import com.pawelsadlo2.battleShip.game.userInteraction.verification.ICoordinatesVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coordinates implements ICoordinates {
    private String coordinatesAsString;
    private int firstCoord;
    private int secondCoord;
    private ICoordinatesVerifier coordinatesVerifier;
    private ICoordinatesConverter coordinatesConverter;

    public String toString() {
        return coordinatesAsString;
    }


    public Coordinates(String coordinates,ICoordinatesConverter coordinatesConverter) {
        this.coordinatesConverter = coordinatesConverter;
        this.coordinatesAsString = coordinates;
        int[] array = coordinatesConverter.toCoordinatesArray(coordinates);
        this.firstCoord = array[0];
        this.secondCoord = array[1];
    }

    public Coordinates(int[] coordinates,ICoordinatesConverter coordinatesConverter) {
        this.coordinatesConverter = coordinatesConverter;
        firstCoord = coordinates[0];
        secondCoord = coordinates[1];
        coordinatesConverter.toCoordinatesString(coordinates);
    }

    public int getFirstCoord() {
        return firstCoord;
    }

    public int getSecondCoord() {
        return secondCoord;
    }
}
