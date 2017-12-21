package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.KeyboardListener;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(this.width/2, this.height/2, Direction.DOWN);
        setRandomApple();

        addActionListener(this);
        setInitialDelay(2000);

    }

    public Worm getWorm(){
        return this.worm;
    }

    public void setWorm(Worm worm){
        this.worm = worm;
    }

    public Apple getApple(){
        return this.apple;
    }

    public void setApple(Apple apple){
        this.apple = apple;
    }

    public void setRandomApple(){
        while(true){
            Apple apple = new Apple((int)(Math.random()*this.width), (int)(Math.random()*this.height));
            if(!this.worm.runsInto(apple)) {
                this.apple = apple;
                break;
            }
        }
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        this.worm.move();
        if(this.worm.runsInto(this.apple)){
            this.worm.grow();
            setRandomApple();
        }
        if(this.worm.runsIntoItself()){
            this.continues = false;
        }
        Piece firstPiece = this.worm.getPieces().get(this.worm.getPieces().size()-1);
        if(firstPiece.getX() >= getWidth() || firstPiece.getX() < 0 || firstPiece.getY() >= getHeight() || firstPiece.getY() < 0){
            this.continues = false;
        }
        updatable.update();
        setDelay(1000 / this.worm.getLength());
    }

}
