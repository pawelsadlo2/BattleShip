package com.pawelsadlo2.battleShip.springConfiguration;

import com.pawelsadlo2.battleShip.game.configuration.GameConfigInteractive;
import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import com.pawelsadlo2.battleShip.game.model.*;
import com.pawelsadlo2.battleShip.game.userInteraction.IGameConfigurator;
import com.pawelsadlo2.battleShip.game.userInteraction.verification.ICoordinatesVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class ConfigCommon implements ISpringConfig {

    @Autowired
    private ICoordinatesConverter coordinatesConverter;
    @Autowired
    private ICoordinatesVerifier coordinatesVerifier;

    @Bean
    @Primary
    @Scope("prototype")
    ICoordinates coordinates(String coordinates) {
        return new Coordinates(coordinates, coordinatesConverter);
    }

    @Bean
    @Primary
    @Scope("prototype")
    ICoordinates coordinates(int[] coordinates) {
        return new Coordinates(coordinates, coordinatesConverter);
    }

}