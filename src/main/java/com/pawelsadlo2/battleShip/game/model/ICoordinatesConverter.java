package com.pawelsadlo2.battleShip.game.model;

import org.springframework.stereotype.Component;

@Component
public interface ICoordinatesConverter {
    String toCoordinatesString(int[] coordinates);
    int[] toCoordinatesArray(String coordinates);
}
