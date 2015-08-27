package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Unit extends Actor{

    private boolean idle;
    private int posX;
    private int posY;
    private Texture skinIdle;
    private ArrayList<Texture> skinMove;
    private int speed;
    private int life;
    private int gravity;
    private int damage;
    private int direction;


    public Unit(int posX, int posY, Texture skinIdle, ArrayList<Texture> skinMove) {
        this.skinIdle = skinIdle;
        this.skinMove = skinMove;
        this.posX = posX;
        this.posY = posY;
        this.idle = false;
    }


    public Texture getSkinIdle() {
        return skinIdle;
    }

    public void setSkinIdle(Texture skinIdle) {
        this.skinIdle = skinIdle;
    }

    public ArrayList<Texture> getSkinMove() {
        return skinMove;
    }

    public void setSkinMove(ArrayList<Texture> skinMove) {
        this.skinMove = skinMove;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


    public void moveLeft() {
        posX--;
    }

    public void moveRight() {
        posX++;
    }

    public void moveUp() {
        posY++;
    }

    public void moveDown() {
        posY--;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean idle() {
        return idle;
    }
}
