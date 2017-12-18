package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import javax.swing.border.Border;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(){
        this.calculator = new PersonalCalculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout(2,1);
        this.frame.setLayout(layout);

        JLabel counter = new JLabel("0");
        JButton button = new JButton("Click!");
        ClickListener listener = new ClickListener(this.calculator, counter);
        button.addActionListener(listener);

        container.add(counter, BorderLayout.CENTER);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
