package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.TooDeeSidescrollerMainApp;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Bullet {

    private Texture bulletTexture;
    private int speed;
    private int posX;
    private int posY;
    private int direction;
    private boolean hit;
    private Unit owner;

    public Bullet(int x, int y, int direction, Unit owner) {
        this.posX = x;
        this.posY = y;
        this.direction = direction;
        this.owner = owner;

        bulletTexture = TooDeeSidescrollerMainApp.getBulletTexture();
    }


    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void move() {
        if (direction == 1) {
            posX++;
        } else {
            posX--;
        }
    }

}
