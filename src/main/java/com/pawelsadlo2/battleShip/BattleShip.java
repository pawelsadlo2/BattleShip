package com.pawelsadlo2.battleShip;

import com.pawelsadlo2.battleShip.game.model.*;
import com.pawelsadlo2.battleShip.springConfiguration.ConfigTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BattleShip {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        IGame game = context.getBean(IGame.class);
        game.run();

        int[] myNumbers = {1, 2};
        ICoordinates coords = context.getBean(ICoordinates.class, myNumbers);


        //IGameInitializer gameInit = context.getBean("gameInitializerSecond", IGameInitializer.class);
        //autowireTest aT = context.getBean("autowireTest",autowireTest.class);

/*        IShipContainer board = context.getBean(IShipContainer.class);
        IShip ship = context.getBean(SimpleShip.class);
        ICoordinates coords1 = context.getBean(Coordinates.class, "D1");
        ShipField field = context.getBean(ShipField.class, ship, coords);
        Set<ShipField> fieldsSet = new HashSet<>();
        fieldsSet.add(field);*/
        //board.addShip(ship, fieldsSet);
        //board.shootField("B1");
        String xx = "scontext";
        //IField field =new ShipField()
        //board.placeShip();
        //assertEquals("High Street", company.getAddress().getStreet());
        //assertEquals(1000, company.getAddress().getNumber());

    }

}