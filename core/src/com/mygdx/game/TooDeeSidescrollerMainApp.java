package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.mygdx.game.logic.GameLogic;
import com.mygdx.game.model.Player;

import javax.xml.soap.Text;
import java.util.EventListener;
import java.util.LinkedList;

public class TooDeeSidescrollerMainApp extends ApplicationAdapter {


	static SpriteBatch batch;

	//Lists
	static LinkedList<Rectangle> groundList;
	static LinkedList<Texture> skyList;
	static Rectangle ground;

	//Textures
	static Texture groundText;
	static Texture sky;
	static String dir = "core/assets/";
	static Texture bullet;


	@Override
	public void create () {
		batch = new SpriteBatch();
		GameLogic logic = new GameLogic();
		logic.initiate();
		worldInit();


	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		drawGround();
		drawSky();
		collisionDetect();
		batch.end();
	}

	private void collisionDetect() {

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

	public void worldInit(){
		groundText = new Texture(dir + "worldtile.png");
		groundList = new LinkedList<Rectangle>();
		ground = new Rectangle();
		ground.setX(0);
		ground.setY(0);
		ground.setWidth(800);
		ground.setHeight(30);
		int i;
		skyList = new LinkedList<Texture>();
		sky = new Texture(dir + "sky.png");


	}

	public static Texture getBulletTexture(){
		return bullet;
	}


}
