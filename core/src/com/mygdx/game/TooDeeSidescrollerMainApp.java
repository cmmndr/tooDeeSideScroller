package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.mygdx.game.logic.GameLogic;
import com.mygdx.game.model.Player;

import java.util.ArrayList;
import java.util.LinkedList;

public class TooDeeSidescrollerMainApp extends ApplicationAdapter {

	private OrthographicCamera camera;
	private Stage stage;
	static SpriteBatch batch;
	static Player player;

	//Lists
	static LinkedList<Rectangle> groundList;
	static LinkedList<Texture> skyList;
	static Rectangle ground;

	//Textures
	static Texture groundText;
	static Texture sky;
	static String dir = "core/assets/";
	static Texture bulletText;
	static Texture playerText;



	@Override
	public void create () {
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		stage = new Stage(new FitViewport(w,h), batch);
		playerInit();

		Gdx.input.setInputProcessor(stage);
		GameLogic logic = new GameLogic();
		logic.initiate();

		worldInit();


	}

	private void playerInit() {
		int playerStartx = 0;
		int playerStarty = 30;
		ArrayList<Texture> movingList = new ArrayList<>();
		playerText = new Texture(dir + "bodyIdle.png");
		player = new Player(playerStartx, playerStarty, playerText, movingList);
		Texture right = new Texture(dir + "movingR.png");
		Texture left = new Texture(dir + "movingL.png");


		movingList.add(0,left);
		movingList.add(1, right);
		stage.addActor(player);
		Gdx.input.setInputProcessor(stage);
		player.addListener(new InputListener() {

			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				System.out.println("hitler");
				return super.keyDown(event, keycode);
			}
		});




	}

	@Override
	public void render() {


		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act();

		stage.draw();
		collisionDetect();
		batch.begin();
		drawGround();
		drawSky();
		drawPlayer();

		batch.end();
	}




	private void collisionDetect() {

	}

	public void drawPlayer(){
		//if(player.)

		batch.draw(player.getSkinIdle(), player.getPosX(), player.getPosY());
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

			batch.draw(t,x, y);
			x+=562;

		}



	}

	public void worldInit(){
		groundText = new Texture(dir + "worldtile.png");
		groundList = new LinkedList<>();
		ground = new Rectangle();
		ground.setX(0);
		ground.setY(0);
		ground.setWidth(800);
		ground.setHeight(30);
		skyList = new LinkedList<>();
		sky = new Texture(dir + "sky.png");


	}

	public void dispose(){
		stage.dispose();

	}

	public static Texture getBulletTexture() {
		return bulletText;
	}


}
