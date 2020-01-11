package com.pawelsadlo2.battleShip.game.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Scope("prototype")
public interface IShipContainer {
    void addShip(IShip ship, IShipField... fields);
    Collection<IShip> allShips();
/*    Optional<IShip> getShip(String coordinates);
    Optional<IShip> getShip(IField field);*/
}
