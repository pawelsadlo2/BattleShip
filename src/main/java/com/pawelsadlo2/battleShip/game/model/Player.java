package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.userInteraction.ICoordinatesQuerier;
import com.pawelsadlo2.battleShip.game.userInteraction.IMessenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope("prototype")
@Primary
public class Player implements IPlayer {
    private int no;
    private IBoard board;
    @Autowired
    private IPlayers players;
    @Autowired
    IMessenger messenger;
    @Autowired
    ApplicationContext context;

    @Autowired
    private ICoordinatesQuerier querier;

    @Autowired
    public void setBoard(IBoard board) {
        this.board = board;
    }

    public int getNo() {
        return this.no;
    }

    public Player(int no) {
        this.no = no;
    }

    public String toString() {
        return "Player " + no;
    }


    public IBoard getBoard() {
        return board;
    }


    public void makeMove() {
        String shootCoordinates = querier.queryCoordinates("input target coordinates");
        IPlayer oponent = players.getNext();
        oponent.getBoard().getFieldsContainer().getField(context.getBean(ICoordinates.class,shootCoordinates)).shoot();
    }
}
