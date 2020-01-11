package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.userInteraction.IMessenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
public class ShipField implements IShipField, IShootable {
    private ICoordinates coordinates;
    private IPlayer player;
    private boolean shooted = false;
    private IShip ship;
    @Autowired
    private IMessenger messenger;
    @Autowired
    private IPlayers players;


    public ShipField(IShip ship, ICoordinates coordinates,IPlayer player) {
        this.ship = ship;
        this.coordinates = coordinates;
        this.player =player;
    }

    public void shoot() {
        if (this.isShooted()) {
            messenger.printMessage("already shooted");
            players.getNext().makeMove();
        } else {
            this.shooted = true;
            messenger.printMessage("shooted");
            this.ship.shoot();
            players.getCurrent().makeMove();
        }
    }

    public boolean isShooted() {
        return this.shooted;
    }

    public ICoordinates getCoordinates() {
        return coordinates;
    }
}
