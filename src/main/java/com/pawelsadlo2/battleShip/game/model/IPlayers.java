package com.pawelsadlo2.battleShip.game.model;

import org.springframework.stereotype.Component;

@Component
public
interface IPlayers {
    public IPlayer getPlayer(int no);
    public IPlayer getNext();
    public void addPlayer(IPlayer player);
    public IPlayer getCurrent();
}
