package com.pawelsadlo2.battleShip.game.model;

import org.springframework.stereotype.Component;

@Component
public
interface IPlayer {
    String toString();

    public IBoard getBoard();

    public void makeMove();

    public int getNo();

}
