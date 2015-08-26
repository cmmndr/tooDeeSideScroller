package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class Enemy extends Unit {

    public Enemy(Texture skinIdle, ArrayList<Texture> skinMove) {
        super(skinIdle, skinMove);
    }
}

