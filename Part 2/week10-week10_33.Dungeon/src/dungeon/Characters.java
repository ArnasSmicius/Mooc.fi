package dungeon;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnas on 2017.03.09.
 */
public class Characters {
    private ArrayList<Vampire> vampires;
    private Player player;
    private Area area;

    public Characters(Area area){
        this.vampires = new ArrayList<Vampire>();
        this.player = new Player(area, this);
        this.area = area;
    }

    public Player getPlayer(){
        return this.player;
    }

    public List<Vampire> getVampires(){
        return this.vampires;
    }

    public void addVampire(int x, int y){
        this.vampires.add(new Vampire(x, y, this.area, this));
    }

    public void removeVampireAt (int x, int y){
        for (Vampire vampire : this.vampires){
            if (vampire.getX() == x && vampire.getY() == y) {
                this.vampires.remove(vampire);
                this.vampires.trimToSize();
                break;
            }
        }
    }

    public void moveVampires(){
        for(Vampire vampire : this.vampires){
            vampire.moveVampire();
        }
    }
}
