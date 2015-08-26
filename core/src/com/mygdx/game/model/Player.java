package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Player extends Unit{

    ArrayList<Bullet> shotsFired;
    private Rectangle body;



    public Player(int posX, int posY, Texture skinIdle, ArrayList<Texture> skinMove) {
        super(posX, posY, skinIdle, skinMove);
        shotsFired = new ArrayList<>();
        body = new Rectangle();
        body.setHeight(100);
        body.setWidth(40);
        body.setX(posX);
        body.setY(posY);
    }

    public Rectangle getBody() {
        return body;
    }


    private void shoot() {
        Bullet b = new Bullet(this.getPosX(),this.getPosY(), this.getDirection(), this);

    }
}
