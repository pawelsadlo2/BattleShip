package com.pawelsadlo2.battleShip.game.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Primary
public class ShipsContainer implements IShipContainer {
    private Collection<IShip> ships = new HashSet<>();

    public void addShip(IShip ship, IShipField... fields) {
        this.ships.add(ship);
        //this.fields.putAll(fields.stream().collect(Collectors.toMap(x->x.getCoordinates().toString(), x -> x)));
        ship.addFields(fields);
    }

    public Collection<IShip> allShips() {
        return this.ships;
    }


/*    public Optional<IShip> getShip(String coordinates) {
        return ships.stream()
                .filter(ship -> ship.getFields().parallelStream()
                        .anyMatch(field -> field.getCoordinates().toString().equals(coordinates)))
                .findAny();
    }*/


/*    public Optional<IShip> getShip(IField field) {
        return ships.stream()
                .filter(ship -> ship.getFields().parallelStream()
                        .anyMatch(f -> f.equals(field)))
                .findAny();
    }*/

}
