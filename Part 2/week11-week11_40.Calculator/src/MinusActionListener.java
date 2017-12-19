import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arnas on 2017.03.19.
 */
public class MinusActionListener implements ActionListener {
    private CalculatorLogic calculator;

    public MinusActionListener(CalculatorLogic calculator){
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.minus();
    }
}
