package com.pawelsadlo2.battleShip.game.userInteraction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public interface IMessenger {
    void printMessage(String message);
    String getResponse();
    String printAndGetResponse(String message);
}
