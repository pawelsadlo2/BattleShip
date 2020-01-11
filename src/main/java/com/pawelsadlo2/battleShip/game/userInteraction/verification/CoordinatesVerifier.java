package com.pawelsadlo2.battleShip.game.userInteraction.verification;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import com.pawelsadlo2.battleShip.game.model.ICoordinatesConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoordinatesVerifier implements ICoordinatesVerifier {
    private IGameConfig gameConfig;
    private ICoordinatesConverter coordinatesConverter;

    @Autowired
    public CoordinatesVerifier(ICoordinatesConverter coordinatesConverter) {
        this.coordinatesConverter = coordinatesConverter;
    }

    @Autowired
    public void setGameConfig(IGameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }

    public boolean isLegal(String coordinates) {
        if (matchesRegex(coordinates)) {
            int first = coordinatesConverter.toCoordinatesArray(coordinates)[0];
            int second = coordinatesConverter.toCoordinatesArray(coordinates)[1];
            int[] boardSize = gameConfig.getBoardSize();
            boolean firstCheck = isBetweenInclusive(first, 1, boardSize[0]);
            boolean secondCheck = isBetweenInclusive(second, 1, boardSize[1]);
            return firstCheck && secondCheck;
        } else return false;

    }

    public boolean matchesRegex(String coordinates) {
        return coordinates.toUpperCase().matches("[A-Z][1-9][0-9]*");
    }

    private boolean isBetweenInclusive(int value, int lower, int upper) {
        return value >= lower && value <= upper;
    }


}
