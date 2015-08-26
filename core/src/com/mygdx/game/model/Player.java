package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Player extends Unit{

    ArrayList<Bullet> shotsFired;



    public Player(int posX, int posY, Texture skinIdle, ArrayList<Texture> skinMove) {
        super(posX, posY, skinIdle, skinMove);
        shotsFired = new ArrayList<>();
    }




    private void shoot() {
        Bullet b = new Bullet(this.getPosX(),this.getPosY(), this.getDirection(), this);

    }
}
