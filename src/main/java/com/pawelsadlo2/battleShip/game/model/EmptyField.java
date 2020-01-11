package com.pawelsadlo2.battleShip.game.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
class EmptyField implements IEmptyField {
    private boolean shooted = false;
    private ICoordinates coordinates;
    private IPlayer player;
    @Autowired
    private IPlayers players;

    public EmptyField(ICoordinates coordinates, IPlayer player) {
        this.coordinates = coordinates;
        this.player = player;
    }

    public void shoot() {
        this.shooted = true;
        players.getNext().makeMove();
        //return isShooted();
    }

    public boolean isShooted() {
        return this.shooted;
    }

    public ICoordinates getCoordinates() {
        return coordinates;
    }
}
