package dungeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.09.
 */
public class Logic {
    private Area area;
    private Characters characters;

    public Logic(int length, int height, int vampires){
        this.area = new Area(length, height);
        this.characters = new Characters(this.area);
        initializeCharacters(vampires);
    }

    public Player getPlayer(){
        return this.characters.getPlayer();
    }

    public List<Vampire> getVampires(){
        return this.characters.getVampires();
    }

    public char[][] getArea(){
        return this.area.getTable();
    }

    public void makeMove(char direction, boolean vampiresMovable){
        if(vampiresMovable == false){                                    //Vampires don't move
            movePlayer(direction);
        }
        else {
            movePlayer(direction);
            this.characters.moveVampires();
        }
    }

    private void movePlayer(char direction){
        switch (direction) {
            case 's': {
                this.characters.getPlayer().goDown();
                break;
            }
            case 'w': {
                this.characters.getPlayer().goUp();
                break;
            }
            case 'a': {
                this.characters.getPlayer().goLeft();
                break;
            }
            case 'd': {
                this.characters.getPlayer().goRight();
                break;
            }
        }
    }

    private void initializeCharacters(int amountOfVampires){
        this.area.initializePlayer();
        for(int i = 0 ; i < amountOfVampires ; i++){
            while(true){
                int x = (int) (Math.random() * this.area.getX());
                int y = (int) (Math.random() * this.area.getY());
                if(this.area.isEmptyAt(x, y)){
                    this.characters.addVampire(x, y);
                    this.area.setPlace(x, y, 'v');
                    break;
                }
            }
        }
    }


}
