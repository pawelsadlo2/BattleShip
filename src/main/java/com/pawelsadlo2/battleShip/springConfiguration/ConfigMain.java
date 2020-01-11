package com.pawelsadlo2.battleShip.springConfiguration;

import com.pawelsadlo2.battleShip.game.configuration.GameConfigInteractive;
import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import com.pawelsadlo2.battleShip.game.model.*;
import com.pawelsadlo2.battleShip.game.userInteraction.IGameConfigurator;
import com.pawelsadlo2.battleShip.game.userInteraction.verification.ICoordinatesVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.pawelsadlo2.battleShip.game",})
public class ConfigMain extends ConfigCommon implements ISpringConfig {

    private ApplicationContext context;
    private ICoordinatesConverter coordinatesConverter;
    private ICoordinatesVerifier coordinatesVerifier;

    @Bean
    @Scope("prototype")
    public IFieldsContainer fieldsContainerArbitrary() {
        return new FieldsContainer(context, context.getBean(IGameConfig.class));

    }

    @Bean
    @Primary
    public IGameConfig iGameConfigInteractive(@Autowired IGameConfigurator configurator) {
        return new GameConfigInteractive(configurator);
    }


}