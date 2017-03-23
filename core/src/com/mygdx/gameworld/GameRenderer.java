package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

/**
 * Created by nv46 on 23/03/2017.
 */

public class GameRenderer implements Screen {

    private GameWorld gameWorld;

    public GameRenderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public void render() {
        Gdx.app.log("GameRenderer", "render");
    }
}
