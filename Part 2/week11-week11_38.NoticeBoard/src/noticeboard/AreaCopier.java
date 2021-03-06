package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arnas on 2017.03.15.
 */
public class AreaCopier implements ActionListener {
    private JTextField origin;
    private JLabel destination;

    public AreaCopier(JTextField origin, JLabel destination){
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
}
