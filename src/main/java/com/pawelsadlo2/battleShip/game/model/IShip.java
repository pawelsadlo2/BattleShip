package com.pawelsadlo2.battleShip.game.model;

import java.util.Set;

public interface IShip extends IShootable, IFloatable {

    public void addFields(IShipField... fields);

    public Set<IShipField> getFields();

    public int getSize();

}

