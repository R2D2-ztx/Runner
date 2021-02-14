package org.academiadecodigo.cachealots.runner;

import org.academiadecodigo.cachealots.runner.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu {

    public boolean tryAgain=false;
    public final int PADDING = 10;
    public Picture startBox = new Picture(0, 0, "resources/pixil-frame-0.png");
    private Grid grid;
    private Text pressSpaceToBegin;



    public Menu(Grid grid) {
        this.grid = grid;

//        startBox.translate((double) grid.getWidth()/2 - (double) startBox.getWidth()/2, (double) grid.getHeight()/2 + (double) startBox.getHeight());
        pressSpaceToBegin = new Text(0, 0, "Press SPACE to begin!");
        pressSpaceToBegin.translate((double) grid.getWidth()/2 - (double) pressSpaceToBegin.getWidth()/2, (double) grid.getHeight()/2 + (double) pressSpaceToBegin.getHeight() * 2);

    }
    public void init(){
        //startBox.draw();
        pressSpaceToBegin.draw();


    }

    public void hideStart(){
     //   startBox.delete();
        pressSpaceToBegin.delete();
    }
}