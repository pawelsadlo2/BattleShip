package com.pawelsadlo2.battleShip.game.model;

import org.springframework.stereotype.Component;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

@Component
public
class Players implements IPlayers {
    private Collection<IPlayer> players = new ArrayList<>();
    private int currentNo = -1;

    public IPlayer getPlayer(int no) {
        return players.stream().filter(p -> p.getNo() == no).findAny().get();
    }

    public void addPlayer(IPlayer player){
        players.add(player);
    }


    public IPlayer getCurrent(){
        return getPlayer(currentNo);
    }

    public IPlayer getNext() {
        currentNo++;
        if (currentNo < players.size()) {
            return getPlayer(currentNo);
        } else {
            currentNo = 0;
            return getPlayer(currentNo);
        }
    }
}
