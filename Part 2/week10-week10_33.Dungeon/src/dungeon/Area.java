package dungeon;

/**
 * Created by Arnas on 2017.03.09.
 */
public class Area {
    private int x;
    private int y;
    private char[][] table;

    public Area(int x, int y){
        this.x = x;
        this.y = y;
        this.table = new char[x][y];
        initializeTable();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public char[][] getTable(){
        return this.table;
    }

    public char getCharAt(int x, int y){
        return this.table[x][y];
    }

    public void initializeTable(){
        for(int i = 0 ; i < getY() ; i++){
            for(int j = 0 ; j < getX() ; j++){
                this.table[j][i] = '.';
            }
        }
    }

    public void initializePlayer(){
        this.table[0][0] = '@';
    }

    public boolean isEmptyAt(int x, int y){
        try {
            if (this.table[x][y] == '.') {
                return true;
            } else {
                return false;
            }
        }
        catch (Exception e) {
            return false;
        }
    }

    public void setPlace(int x, int y, char sign){
        this.table[x][y] = sign;
    }

    public void removePlace(int x, int y){
        this.table[x][y] = '.';
    }
}
