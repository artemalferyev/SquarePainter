package org.academiadecodigo.bootcamp77.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Squares {
    private static final int SQUARESIZE = 30;
    private final Rectangle square;

    public Squares(int col, int row){
        int col1 = col * SQUARESIZE;
        int row1 = row * SQUARESIZE;
        square = new Rectangle(col1 +10, row1 +10,SQUARESIZE,SQUARESIZE);
    }

    public void drawSquares(){
        square.draw();
    }

    public void setPainted(boolean painted){
    }

    public void paint(){
        square.fill();
    }
}
