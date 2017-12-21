package wormgame.gui;

import wormgame.Direction;
import wormgame.domain.Worm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Arnas on 2017.03.26.
 */
public class KeyboardListener implements KeyListener {
    private Worm worm;

    public KeyboardListener(Worm worm){
        this.worm = worm;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:{
                this.worm.setDirection(Direction.UP);
                break;
            }
            case KeyEvent.VK_DOWN:{
                this.worm.setDirection(Direction.DOWN);
                break;
            }
            case KeyEvent.VK_LEFT:{
                this.worm.setDirection(Direction.LEFT);
                break;
            }
            case KeyEvent.VK_RIGHT:{
                this.worm.setDirection(Direction.RIGHT);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
