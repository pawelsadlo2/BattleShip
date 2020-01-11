package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.userInteraction.verification.CoordinatesVerifier;
import org.springframework.stereotype.Component;

@Component
public interface ICoordinates {

/*    static boolean isLegal(String coordinates) {
        return CoordinatesVerifier.isLegal(coordinates);
    }*/

    public int getFirstCoord();

    public int getSecondCoord();


}

