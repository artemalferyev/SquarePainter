package org.academiadecodigo.bootcamp77.Controller;
import org.academiadecodigo.bootcamp77.Grid.MySquare;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboard implements KeyboardHandler {

    private final MySquare mySquare;

    public MyKeyboard(MySquare mySquare) {
        this.mySquare = mySquare;
    }

    public void init(){

        Keyboard keyboard = new Keyboard(this);

        int[] keys = new int[]{
                KeyboardEvent.KEY_D,
                KeyboardEvent.KEY_A,
                KeyboardEvent.KEY_S,
                KeyboardEvent.KEY_W,
                KeyboardEvent.KEY_SPACE
        };

        for (int key : keys) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            event.setKey(key);
            keyboard.addEventListener(event);
        }
    }

        @Override
        public void keyPressed (KeyboardEvent keyboardEvent){

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_A:
                    mySquare.moveLeft();
                    break;
                case KeyboardEvent.KEY_D:
                    mySquare.moveRight();
                    break;
                case KeyboardEvent.KEY_W:
                    mySquare.moveUp();
                    break;
                case KeyboardEvent.KEY_S:
                    mySquare.moveDown();
                    break;
                case KeyboardEvent.KEY_SPACE:
                    mySquare.paint();
                    break;
            }
        }

        @Override
        public void keyReleased (KeyboardEvent keyboardEvent){

        }
    }


