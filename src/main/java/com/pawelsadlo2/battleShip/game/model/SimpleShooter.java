package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.userInteraction.IMessenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class SimpleShooter implements IShooter {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private IMessenger messenger;

    public boolean shoot(String coordinates, IPlayer player) {
        ICoordinates coords = context.getBean(ICoordinates.class, coordinates);
        player.getBoard().getFieldsContainer().getField(coords).shoot();
/*        IField field = fieldsContainer.getField(coordinates);
        field.shoot();
        if (shipContainer.allShips().parallelStream().allMatch(IShip::isFloated)) ;*/
        //if (ship.shoot()) System.out.println("shooted");
        return true;
    }

    @Override
    public void shoot(IField field) {

    }

    @Override
    public void shoot(IShip ship) {
        if (ship.getFields().parallelStream().allMatch(IShootable::isShooted)) {
            ship.floatShip();
            messenger.printMessage("floated!");
        }
        //return ship.isShooted();
    }
}
