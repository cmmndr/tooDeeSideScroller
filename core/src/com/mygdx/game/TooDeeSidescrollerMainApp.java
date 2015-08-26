package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Shape;
import com.mygdx.game.logic.GameLogic;

import java.util.LinkedList;

public class TooDeeSidescrollerMainApp extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	LinkedList<Texture> skyList;
	Shape ground;
	Texture groundText;
	Texture sky;
	String dir = "core/assets/";

	@Override
	public void create () {
		batch = new SpriteBatch();
		GameLogic logic = new GameLogic();
		logic.initiate();
		skyList = new LinkedList<Texture>();
		sky = new Texture(dir + "sky.png");
		groundText = new Texture(dir + "worldtile.png");

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		drawGround();
		drawSky();
		batch.end();
	}

	public void drawGround(){
		int xPos = 0;
		for(int i=0; i < 100; i++){

			batch.draw(groundText, xPos, 0);
			xPos+= 30;
		}

	}
	public void drawSky(){
		for(int i = 0; i < 20; i++){
			skyList.add(i,sky);
		}
		int x = 0;
		int y = 31;
		for(Texture t : skyList){

			batch.draw(sky,x, y);
			x+=562;

		}



	}


}
