package movingfigure;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Arnas on 2017.03.20.
 */
public class KeyboardListener implements KeyListener {
    private Component component;
    private Figure figure;

    public KeyboardListener (Component component, Figure figure){
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            this.figure.move(0, -1);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            this.figure.move(0, 1);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            this.figure.move(-1, 0);
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.figure.move(1, 0);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
