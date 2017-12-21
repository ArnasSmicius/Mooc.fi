package wormgame.domain;

import wormgame.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.26.
 */
public class Worm {
    private Direction direction;
    private List<Piece> wormPieces;
    private boolean growOrNot;

    public Worm(int originalX, int originalY, Direction originalDirection){
        this.direction = originalDirection;
        this.wormPieces = new ArrayList<Piece>();
        this.wormPieces.add(new Piece(originalX, originalY));
        this.growOrNot = false;
    }

    public Direction getDirection(){
        return this.direction;
    }

    public void setDirection(Direction dir){
        this.direction = dir;
    }

    public int getLength(){
        return this.wormPieces.size();
    }

    public List<Piece> getPieces(){
        return this.wormPieces;
    }

    public void move(){
        if(wormPieces.size() < 3){
            grow();
        }
        Piece oldPiece = new Piece(wormPieces.get(wormPieces.size()-1).getX(), wormPieces.get(wormPieces.size()-1).getY());
        oldPiece.move(direction);
        this.wormPieces.add(oldPiece);
        if(!this.growOrNot){
            wormPieces.remove(0);
        }
        else{
            this.growOrNot = false;
        }
    }

    public void grow(){
        this.growOrNot = true;
    }

    public boolean runsInto(Piece piece){
        for(Piece pieces : this.wormPieces){
            if(pieces.getX() == piece.getX() && pieces.getY() == piece.getY()){
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself(){
        for(Piece p : this.wormPieces){
            for(Piece c : this.wormPieces){
                if(p == c){
                    continue;
                }
                if(p.getX() == c.getX() && p.getY() == c.getY()){
                    return true;
                }
            }
        }
        return false;
    }

}
