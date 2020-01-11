package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.userInteraction.IMessenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("prototype")
@Primary
public class SimpleShip implements IShip {
    private Set<IShipField> fields = new HashSet<>();
    private boolean floated = false;
    private boolean shooted = false;
    private int size = 0;

    @Autowired
    private IMessenger messenger;

    @Autowired
    private IShooter shooter;

    public SimpleShip(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void addFields(IShipField... fields) {
        this.fields.addAll(Arrays.asList(fields));
    }

    public Set<IShipField> getFields() {
        return fields;
    }

    public void floatShip() {
        this.floated = true;
    }

    public boolean isShooted() {
        return this.shooted;
    }

    public void shoot() {
         shooter.shoot(this);
    }


    public boolean isFloated() {
        return floated;
    }
}

