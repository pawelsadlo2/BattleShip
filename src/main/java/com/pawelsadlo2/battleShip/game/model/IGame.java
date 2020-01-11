package com.pawelsadlo2.battleShip.game.model;

import org.springframework.stereotype.Component;

@Component
public interface IGame {
    void initialize();

    public void start();
    public void run();
    public IPlayers getPlayers();
}

