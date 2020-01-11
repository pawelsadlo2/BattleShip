package com.pawelsadlo2.battleShip.game.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Scope("prototype")
public interface IFieldsContainer {
    IField getField(ICoordinates coordinates);

    void addField(IField field);

    boolean canPlaceShip(ICoordinates coordinates);

}
