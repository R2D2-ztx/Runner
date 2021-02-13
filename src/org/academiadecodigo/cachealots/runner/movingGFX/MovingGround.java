package org.academiadecodigo.cachealots.runner.movingGFX;

import org.academiadecodigo.cachealots.runner.grid.Grid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

public class MovingGround {

    private Picture groundTile = new Picture(0, 0, "resources/ground_frames/cell_0.png");
    private Grid grid;
    private Picture tile1;
    private String[] frames;

    private int frameCounter;


    public MovingGround(Grid grid) {

        this.grid = grid;
        final int GROUND_X = grid.getWidth() - 2 * grid.CELL_SIZE;
        final int GROUND_Y = grid.GROUND_Y;

        frames = new String[]{
                "resources/ground_frames/ground_frame1.png",
                "resources/ground_frames/ground_frame2.png",
                "resources/ground_frames/ground_frame3.png",
        };

        tile1 = new Picture(grid.PADDING, GROUND_Y, "resources/ground_frames/ground_frame1.png");
    }


    public void drawGround() throws InterruptedException {

        if (frameCounter == 3) frameCounter = 0;

        tile1.load(frames[frameCounter]);
        tile1.draw();

        frameCounter++;


    }
}