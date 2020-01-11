package com.pawelsadlo2.battleShip.game.userInteraction;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Messenger implements IMessenger {

    private Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }


    public String getResponse() {
        return scanner.nextLine();
    }


    public String printAndGetResponse(String message) {
        this.printMessage(message);
        return this.getResponse();
    }

}
