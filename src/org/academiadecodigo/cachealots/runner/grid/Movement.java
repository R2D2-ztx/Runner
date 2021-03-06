package org.academiadecodigo.cachealots.runner.grid;

import org.academiadecodigo.cachealots.runner.Game;
import org.academiadecodigo.cachealots.runner.blocks.Block;
import org.academiadecodigo.cachealots.runner.character.Character;
import org.academiadecodigo.cachealots.runner.movingGFX.Cloud;
import org.academiadecodigo.cachealots.runner.movingGFX.CloudBackground;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static java.lang.Thread.sleep;


public class Movement {


    private Grid grid;
    private Game game;
    private Block block;
    private Character character;
    private Cloud cloud;
    private CloudBackground cloudBackground;
    

    public Movement(Grid grid, Character character) {
        this.grid = grid;
        this.character = character;
    }

    public Movement(Grid grid, Block block) {
        this.grid = grid;
        this.block = block;
    }

    public Movement(Grid grid, Cloud cloud) {
        this.grid = grid;
        this.cloud = cloud;
    }

    public Movement(Grid grid, CloudBackground cloudBackground) {
        this.grid = grid;
        this.cloudBackground = cloudBackground;
    }


    public void moveBlock(Direction dir) {
        block.getSprite().translate(-5, 0);
    }

    public void moveCloud(Direction dir) {
        cloud.getSprite().translate(-2, 0);
    }

    public void moveCloudBackground(Direction dir) {
        cloudBackground.getSprite().translate(-1, 0);
    }

    public void move(Direction dir) {
        switch (dir) {
            case UP:
                character.getSprite().translate(0, -5);
                break;

            case DOWN:
                int currentPosition = character.getSprite().getY();

                if (currentPosition < character.getInitialPos()) {
                    character.getSprite().translate(0, 5);
                    break;
                }
                break;


            case NONE:
                break;
        }

    }

    public void moveUp(int distance){
        character.getSprite().translate(0, -distance);
    }

    public void moveDown(int distance){
        character.getSprite().translate(0, distance);
    }

    public void moveRight(int distance){
        character.getSprite().translate(distance, 0);
    }

    public void moveLeft(int distance){
        character.getSprite().translate(-distance, 0);

    }

}
