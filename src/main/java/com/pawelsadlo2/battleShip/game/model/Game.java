package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Game implements IGame {
    private ApplicationContext context;
    private IPlayers players;
    private IGameConfig config;
    private int currentPlayer = 1;

    @Autowired
    public Game(ApplicationContext context, IGameConfig config) {
        this.context = context;
        this.config = config;
    }

    public IPlayers getPlayers() {
        return players;
    }

    public void run() {
        initialize();
        start();
    }

    public void initialize() {
        //ceatePlayers();
        //placeShips - make in parallel

    }

    public void start() {
        getPlayers().getNext().makeMove();
    }

}
