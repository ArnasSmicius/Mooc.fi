package game;

import gameoflife.GameOfLifeBoard;

/**
 * Created by Arnas on 2017.03.21.
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height){
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probability) {
        for(int i = 0 ; i < getHeight() ; i++){
            for (int j = 0 ; j < getWidth() ; j++){
                if(Math.random() < probability){
                    getBoard()[j][i] = true;
                }
                else {
                    getBoard()[j][i] = false;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if(getHeight() > y && getWidth() > x && x >= 0 && y >= 0){
            return getBoard()[x][y];
        }
        else {
            return false;
        }
    }

    @Override
    public void turnToLiving(int x, int y) {
        if(getHeight() > y && getWidth() > x && x >= 0 && y >= 0) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if(getHeight() > y && getWidth() > x && x >= 0 && y >= 0) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int neighbourCount = 0;

        for(int i = -1; i < 2 ; i++){
            if (isAlive(x + i, y - 1 )){
                neighbourCount++;
            }
        }

        if(isAlive(x - 1, y)){
            neighbourCount++;
        }

        if(isAlive(x + 1, y)){
            neighbourCount++;
        }

        for(int i = -1; i < 2 ; i++){
            if (isAlive(x + i, y + 1 )){
                neighbourCount++;
            }
        }
        return neighbourCount;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(!isAlive(x, y) && getNumberOfLivingNeighbours(x, y) == 3){
            turnToLiving(x, y);
            return;
        }
        if(isAlive(x, y)){
            if(getNumberOfLivingNeighbours(x, y) < 2){
                turnToDead(x, y);
                return;
            }
            if(getNumberOfLivingNeighbours(x, y) > 3){
                turnToDead(x, y);
                return;
            }
        }
    }
}
