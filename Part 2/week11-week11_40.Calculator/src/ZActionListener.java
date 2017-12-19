import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arnas on 2017.03.19.
 */
public class ZActionListener implements ActionListener {
    private CalculatorLogic calculator;

    public ZActionListener(CalculatorLogic calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.reset();
    }
}
