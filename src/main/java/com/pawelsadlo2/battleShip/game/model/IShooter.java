package com.pawelsadlo2.battleShip.game.model;

public interface IShooter {
 void shoot(IField field);
 void shoot(IShip ship);
/* IShotResult shoot(String coordinates);*/
}
