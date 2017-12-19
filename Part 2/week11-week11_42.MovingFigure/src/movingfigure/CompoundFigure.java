package movingfigure;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Arnas on 2017.03.20.
 */
public class CompoundFigure extends Figure {
    private ArrayList<Figure> figures;

    public CompoundFigure(){
        super(0,0);
        this.figures = new ArrayList<>();
    }

    public void add(Figure f){
        this.figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : this.figures){
            figure.draw(graphics);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure figure : this.figures){
            figure.move(dx, dy);
        }
    }
}
