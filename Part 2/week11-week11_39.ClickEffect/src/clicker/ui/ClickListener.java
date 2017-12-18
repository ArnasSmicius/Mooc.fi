package clicker.ui;

import clicker.applicationlogic.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arnas on 2017.03.15.
 */
public class ClickListener implements ActionListener {
    private Calculator calculator;
    private JLabel text;

    public ClickListener(Calculator calculator, JLabel text){
        this.calculator = calculator;
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.text.setText(String.valueOf(calculator.giveValue()));
    }
}
