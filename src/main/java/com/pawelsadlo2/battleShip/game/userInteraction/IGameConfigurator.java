package com.pawelsadlo2.battleShip.game.userInteraction;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import org.springframework.stereotype.Component;

@Component
public interface IGameConfigurator {
    void fillConfig(IGameConfig gameConfig);
}


