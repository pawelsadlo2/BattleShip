package com.pawelsadlo2.battleShip.game.userInteraction.verification;

import org.springframework.stereotype.Component;

@Component
public interface ICoordinatesVerifier {
    public boolean isLegal(String coordinates);
    public boolean matchesRegex(String coordinates);
}
