package movingfigure;

import java.awt.*;

/**
 * Created by Arnas on 2017.03.20.
 */
public class Box extends Figure {
    private int width;
    private int height;

    public Box(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), this.width, this.height);
    }
}
