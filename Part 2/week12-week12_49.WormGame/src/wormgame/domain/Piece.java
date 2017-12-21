package wormgame.domain;

import wormgame.Direction;

/**
 * Created by Arnas on 2017.03.26.
 */
public class Piece {
    private int x;
    private int y;

    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void move(Direction direction ){
        switch(direction){
            case RIGHT:{
                this.x++;
                break;
            }
            case LEFT:{
                this.x--;
                break;
            }
            case UP:{
                this.y--;
                break;
            }
            case DOWN:{
                this.y++;
                break;
            }
        }
    }

    public boolean runsInto(Piece piece){
        if(piece.getX() == this.getX() && piece.getY() == this.getY()){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
}
