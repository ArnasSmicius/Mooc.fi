package movingfigure;

import java.awt.*;

/**
 * Created by Arnas on 2017.03.20.
 */
public class Circle extends Figure {
    private int diameter;

    public Circle(int x, int y, int diameter){
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(super.getX(), super.getY(), this.diameter, this.diameter);
    }
}
