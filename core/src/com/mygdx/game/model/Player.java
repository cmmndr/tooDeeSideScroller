package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.logic.GameLogic;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Player extends Unit{

    ArrayList<Bullet> shotsFired;



    public Player(Texture skinIdle, ArrayList<Texture> skinMove) {
        super(skinIdle, skinMove);
        shotsFired = new ArrayList<>();
    }




    private void shoot() {
        Bullet b = new Bullet(this.getPosX(),this.getPosY(), this.getDirection(), this);

    }
}
