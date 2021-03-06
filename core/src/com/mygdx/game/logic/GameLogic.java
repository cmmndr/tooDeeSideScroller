package com.mygdx.game.logic;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.model.Enemy;
import com.mygdx.game.model.Item;
import com.mygdx.game.model.Player;

import java.util.ArrayList;

/**
 * Created by Mythix on 26.08.2015.
 */
public class GameLogic {


    private ArrayList<Enemy> activeEnemies;
    private ArrayList<Item> visibleItems;

    private Player player;
    public GameLogic(){

    }

    public void initiate() {
    activeEnemies = new ArrayList<>();
    visibleItems = new ArrayList<>();

    }

    public ArrayList<Enemy> getActiveEnemies() {
        return activeEnemies;
    }

    public void setActiveEnemies(ArrayList<Enemy> activeEnemies) {
        this.activeEnemies = activeEnemies;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }




}
