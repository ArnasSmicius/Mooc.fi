package movingfigure;

import java.awt.*;

/**
 * Created by Arnas on 2017.03.20.
 */
public class Square extends Figure{
    private int sideLenght;

    public Square(int x, int y, int sideLength){
        super(x, y);
        this.sideLenght = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), this.sideLenght, this.sideLenght);
    }
}
