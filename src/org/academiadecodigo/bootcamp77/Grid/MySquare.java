package org.academiadecodigo.bootcamp77.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MySquare {

    private static final int SQUARESIZE = 30;
    private static final int SPEED = 30;
    private int col;
    private int row;
    private Rectangle mySquare;
    private Rectangle squares;
    private boolean isPainted;

    public MySquare(int col, int row){
        this.col = col*10;
        this.row = row*10;
        mySquare = new Rectangle(this.col+30,this.row+30,SQUARESIZE,SQUARESIZE);
    }

    public void drawMySquare(){
        mySquare.draw();
        mySquare.setColor(Color.BLUE);
        mySquare.fill();
    }

    public void moveLeft(){
        mySquare.translate(-SPEED, 0);
    }

    public void moveRight(){
        mySquare.translate(SPEED, 0);
    }

    public void moveUp(){
        mySquare.translate(0, -SPEED);
    }

    public void moveDown(){
       mySquare.translate(0, SPEED);
    }

    public void paint(){

    }
}

