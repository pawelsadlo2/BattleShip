package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import com.pawelsadlo2.battleShip.game.userInteraction.verification.CoordinatesVerifier;
import com.pawelsadlo2.battleShip.game.userInteraction.verification.ICoordinatesVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CoordinatesConverter implements ICoordinatesConverter {
    private static final String alphabet = "_ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String toCoordinatesString(int[] coordinates) {
        return String.format("%c%d", alphabet.charAt(coordinates[0]), coordinates[1]);
    }


    public int[] toCoordinatesArray(String coordinates) {

        return new int[]{alphabet.indexOf(coordinates.toUpperCase().charAt(0)), Integer.parseInt(coordinates.toUpperCase().substring(1))};
    }


}
