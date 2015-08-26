package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.logic.GameLogic;
import com.mygdx.game.model.Player;

import java.util.ArrayList;
import java.util.LinkedList;

public class TooDeeSidescrollerMainApp extends ApplicationAdapter {

	private OrthographicCamera camera;
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
		camera = new OrthographicCamera(30, 30 * (h / w));
		camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
		camera.update();
		GameLogic logic = new GameLogic();
		logic.initiate();
		playerInit();
		worldInit();


	}

	private void playerInit() {
		Texture right = new Texture(dir + "movingR.png");
		Texture left = new Texture(dir + "movingL.png");
		ArrayList<Texture> movingList = new ArrayList<>();

		int playerStartx = 0;
		int playerStarty = 30;
		playerText = new Texture(dir + "bodyIdle.png");
		player = new Player(playerStartx, playerStarty, playerText, null);
	}

	@Override
	public void render() {
		handleInput();
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



		batch.begin();
		drawGround();
		drawSky();
		drawPlayer();
		collisionDetect();
		batch.end();
	}

	private void handleInput() {
		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			camera.zoom += 0.2;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.Q)) {
			camera.zoom -= 0.2;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			camera.translate(-3, 0, 0);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			camera.translate(3, 0, 0);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			camera.translate(0, -3, 0);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			camera.translate(0, 3, 0);
		}
	}


	private void collisionDetect() {

	}

	public void drawPlayer(){
		if(player.get)

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
		skyList = new LinkedList<Texture>();
		sky = new Texture(dir + "sky.png");


	}


	public static Texture getBulletTexture() {
		return bulletText;
	}


}
