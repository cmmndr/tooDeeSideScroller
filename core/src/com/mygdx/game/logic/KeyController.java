package com.mygdx.game.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.mygdx.game.model.Unit;

/**
 * Created by Mythix on 26.08.2015.
 */
public class KeyController {

    Unit unit;

    public KeyController(Unit unit){
        this.unit = unit;
    }

public InputListener iL = new InputListener(){

    @Override
    public boolean keyTyped(InputEvent event, char character) {
        System.out.println("ILTypned");
        return super.keyTyped(event, character);
    }
};

   public  InputProcessor iP = new InputProcessor() {
       @Override
       public boolean keyDown(int keycode) {
           if (keycode == 21) {
               unit.moveLeft();
               System.out.println("left and right");
           }
           return true;
       }

       @Override
       public boolean keyUp(int keycode) {
           if (keycode == 21 || keycode == 22) {
               unit.idle();

               System.out.println("up and down");
           }
           return true;
       }

        @Override
        public boolean keyTyped(char character) {
            return false;
        }

        @Override
        public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchUp(int screenX, int screenY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchDragged(int screenX, int screenY, int pointer) {
            return false;
        }

        @Override
        public boolean mouseMoved(int screenX, int screenY) {
            return false;
        }

        @Override
        public boolean scrolled(int amount) {
            return false;
        }
    };

 //

//
}
