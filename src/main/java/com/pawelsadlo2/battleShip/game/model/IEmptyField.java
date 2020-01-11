package com.pawelsadlo2.battleShip.game.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
@Qualifier("emptyField")
interface IEmptyField extends IField {

}

