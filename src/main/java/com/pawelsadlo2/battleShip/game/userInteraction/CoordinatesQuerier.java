package com.pawelsadlo2.battleShip.game.userInteraction;


import com.pawelsadlo2.battleShip.game.userInteraction.verification.ICoordinatesVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoordinatesQuerier implements ICoordinatesQuerier {
    private IMessenger messenger;
    private ICoordinatesVerifier coordinatesVerifier;

    @Autowired
    public CoordinatesQuerier(IMessenger messenger, ICoordinatesVerifier coordinatesVerifier) {
        this.messenger = messenger;
        this.coordinatesVerifier = coordinatesVerifier;
    }

    public String queryCoordinates(String message) {

        String gotCoordinates = this.messenger.printAndGetResponse(message);

        if (coordinatesVerifier.isLegal(gotCoordinates)) {
            return gotCoordinates;
        } else {
            messenger.printMessage("wrong coordinates");
            return queryCoordinates(message);
        }


    }
}
