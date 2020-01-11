package com.pawelsadlo2.battleShip.game.model;

import com.pawelsadlo2.battleShip.game.configuration.IGameConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@Scope("prototype")
public class FieldsContainer implements IFieldsContainer {

    private IField[][] fields = new IField[10][10];
    private ApplicationContext context;

    @Autowired
    public FieldsContainer(ApplicationContext context, IGameConfig config) {
        this.context = context;
        /*        initKeys(config.getBoardSize()[0], config.getBoardSize()[1]);*/
    }

    public IField getField(ICoordinates coordinates) {
        return fields[coordinates.getFirstCoord() - 1][coordinates.getSecondCoord() - 1];
    }

    public void addField(IField field) {
        fields[field.getCoordinates().getFirstCoord() - 1][field.getCoordinates().getSecondCoord() - 1] = field;
    }

    public boolean canPlaceShip(ICoordinates coordinates) {
        return true;
    }

    private void initKeys(Integer horizontalSize, Integer verticalSize) {

        for (int i = 0; i < horizontalSize; i++) {
            for (int j = 0; j < verticalSize; j++) {
                fields[i][j] = null;
            }
        }
    }

}
