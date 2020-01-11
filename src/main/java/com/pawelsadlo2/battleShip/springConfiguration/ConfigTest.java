package com.pawelsadlo2.battleShip.springConfiguration;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import com.pawelsadlo2.battleShip.game.model.*;
import com.pawelsadlo2.battleShip.mocks.GameConfigArbitrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.pawelsadlo2.battleShip.game", "com.pawelsadlo2.battleShip.mocks"})
public class ConfigTest extends ConfigCommon implements ISpringConfig {
    @Autowired
    private ApplicationContext context;


    @Bean
    @Primary
    public IGameConfig GameConfigArbitrary() {
        return new GameConfigArbitrary();
    }


    @Bean
    @Primary
    public IPlayers players() {
        IPlayers players = new Players();
        for (int i = 0; i < GameConfigArbitrary().getPlayersNumber(); i++) {
            players.addPlayer(context.getBean(IPlayer.class, i));
        }
        return players;
    }

    @Bean
    @Primary
    @Scope("prototype")
    public IFieldsContainer fieldsContainerArbitrary() {
        IFieldsContainer container = new FieldsContainer(context, GameConfigArbitrary());
        IShip ship = context.getBean(IShip.class, 5);

        for (int i = 1; i <= 5; i++) {
            int[] newCoords = {1, i};
            ICoordinates coordinatesObj = context.getBean(ICoordinates.class, newCoords);
            IShipField f = new ShipField(ship, coordinatesObj,players().getPlayer(1));
            container.addField(f);
            ship.addFields(f);
        }


        return container;
    }


}