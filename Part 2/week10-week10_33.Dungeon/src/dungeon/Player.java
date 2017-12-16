package dungeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.09.
 */
public class Player {
    private int x;
    private int y;
    private Area area;
    private Characters characters;

    public Player(Area area, Characters characters){
        this.x = 0;
        this.y = 0;
        this.area = area;
        this.characters = characters;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void goUp(){
        if(this.x - 1 >= 0) {
            this.area.removePlace(getX(), getY());
            this.x--;
            if (!this.area.isEmptyAt(getX(), getY())) {
                this.characters.removeVampireAt(getX(), getY());
            }
            this.area.setPlace(getX(), getY(), '@');
        }
    }

    public void goDown(){
        if(this.x + 1 < this.area.getX()) {
            this.area.removePlace(getX(), getY());
            this.x++;
            if (!this.area.isEmptyAt(getX(), getY())) {
                this.characters.removeVampireAt(getX(), getY());
            }
            this.area.setPlace(getX(), getY(), '@');
        }
    }

    public void goLeft(){
        if(this.y - 1 >= 0) {
            this.area.removePlace(getX(), getY());
            this.y--;
            if (!this.area.isEmptyAt(getX(), getY())) {
                this.characters.removeVampireAt(getX(), getY());
            }
            this.area.setPlace(getX(), getY(), '@');
        }
    }

    public void goRight(){
        if(this.y + 1 < this.area.getY()) {
            this.area.removePlace(getX(), getY());
            this.y++;
            if (!this.area.isEmptyAt(getX(), getY())) {
                this.characters.removeVampireAt(getX(), getY());
            }
            this.area.setPlace(getX(), getY(), '@');
        }
    }
}
