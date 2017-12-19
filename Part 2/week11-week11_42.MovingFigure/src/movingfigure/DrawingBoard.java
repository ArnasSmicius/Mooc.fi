package movingfigure;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Arnas on 2017.03.20.
 */
public class DrawingBoard extends JPanel {
    private Figure figure;

    public DrawingBoard (Figure figure){
        this.figure = figure;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.figure.draw(g);
    }
}
