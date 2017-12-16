package dungeon;

/**
 * Created by Arnas on 2017.03.09.
 */
public class Vampire {
    private int x;
    private int y;
    private Area area;
    private Characters characters;

    public Vampire(int x, int y, Area area, Characters characters){
        this.x = x;
        this.y = y;
        this.area = area;
        this.characters = characters;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void moveVampire(){
        int direction = (int)(Math.random() * 3 + 1);
        switch (direction){
            case 1: {
                goUp();
            }
            case 2: {
                goDown();
            }
            case 3: {
                goLeft();
            }
            case 4: {
                goRight();
            }
        }
    }

    public void goUp(){
        if(this.area.isEmptyAt(getX()-1, getY())) {
            this.area.removePlace(getX(), getY());
            this.x--;
            this.area.setPlace(getX(), getY(), 'V');
        }
        else {
            goRight();
        }
    }

    public void goDown(){
        if(this.area.isEmptyAt(getX()+1, getY())) {
            this.area.removePlace(getX(), getY());
            this.x++;
            this.area.setPlace(getX(), getY(), 'V');
        }
        else {
            goLeft();
        }
    }

    public void goLeft(){
        if(this.area.isEmptyAt(getX(), getY()-1)) {
            this.area.removePlace(getX(), getY());
            this.y--;
            this.area.setPlace(getX(), getY(), 'V');
        }
        else {
            goUp();
        }
    }

    public void goRight(){
        if(this.area.isEmptyAt(getX(), getY()+1)) {
            this.area.removePlace(getX(), getY());
            this.y++;
            this.area.setPlace(getX(), getY(), 'V');
        }
        else {
            goDown();
        }
    }
}
