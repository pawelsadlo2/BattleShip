package com.pawelsadlo2.battleShip.game.userInteraction;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameConfiguratorInteractive implements IGameConfigurator {
    private IMessenger messenger;

    @Autowired
    public GameConfiguratorInteractive(IMessenger messenger) {
        this.messenger = messenger;
    }

    public void fillConfig(IGameConfig gameConfig) {
        gameConfig.setPlayersNumber(Integer.parseInt(messenger.printAndGetResponse("choose number of players")));
        int nrRows = Integer.parseInt(messenger.printAndGetResponse("choose number of rows"));
        int nrCols = Integer.parseInt(messenger.printAndGetResponse("choose number of columns"));
        gameConfig.setBoardSize(new int[]{nrRows, nrCols});
    }



}
