package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Unit {

    private Texture skinIdle;
    private ArrayList<Texture> skinMove;
    private int speed;
    private int life;


public Unit(Texture skinIdle, ArrayList<Texture> skinMove){
    this.skinIdle = skinIdle;
    this.skinMove = skinMove;
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
}
