package org.academiadecodigo.bootcamp77.Grid;
import org.academiadecodigo.bootcamp77.Controller.MyKeyboard;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import java.util.ArrayList;


public class SquarePainter {
    private final int cols;
    private final int rows;
    private final Rectangle mainGrid;
    public SquarePainter(int cols, int rows) {
        int PADDING = 10;
        mainGrid = new Rectangle(PADDING, PADDING,300,300);
        this.cols = cols;
        this.rows = rows;
    }

    public void start() {
        Squares[][] squaresList =  new Squares[cols][rows];
        MySquare mySquare = new MySquare(cols/2,rows/2);
        MyKeyboard keyboard = new MyKeyboard(mySquare);
        keyboard.init();
        mainGrid.draw();
        mySquare.drawMySquare();
        for(int column = 0; column < cols; column++){
            for(int row = 0; row < rows; row++){
                squaresList[column][row] = new Squares(column, row);
                squaresList[column][row].drawSquares();
                }
            }
        }
    }

