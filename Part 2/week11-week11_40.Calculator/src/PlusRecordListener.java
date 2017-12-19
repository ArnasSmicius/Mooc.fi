import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arnas on 2017.03.16.
 */
public class PlusRecordListener implements ActionListener {
    private CalculatorLogic calculator;

    public PlusRecordListener(CalculatorLogic calculator){
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.plus();
    }
}
