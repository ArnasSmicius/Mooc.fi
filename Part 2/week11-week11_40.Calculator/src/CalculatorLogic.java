import javax.swing.*;

/**
 * Created by Arnas on 2017.03.16.
 */
public class CalculatorLogic {
    private JButton zButton;
    private JTextField input;
    private JTextField output;

    public void plus() {
        checkInvalidInput();
        int num1 = Integer.parseInt(this.output.getText());
        int num2 = Integer.parseInt(this.input.getText());
        int answer = num1 + num2;
        this.output.setText(Integer.toString(answer));
        checkZEnable();
        clearInput();
    }

    public void minus() {
        checkInvalidInput();
        int num1 = Integer.parseInt(this.output.getText());
        int num2 = Integer.parseInt(this.input.getText());
        int answer = num1 - num2;
        this.output.setText(Integer.toString(answer));
        checkZEnable();
        clearInput();
    }

    public void reset(){
        this.output.setText("0");
        checkZEnable();
        clearInput();
    }

    public void setZButton(JButton zButton){
        this.zButton = zButton;
        this.zButton.setEnabled(false);
    }

    public void setTextField(JTextField input, JTextField output){
        this.input = input;
        this.output = output;
    }

    private void checkZEnable(){
        if (this.output.getText().equals("0")){
            this.zButton.setEnabled(false);
        }
        else {
            this.zButton.setEnabled(true);
        }
    }

    private void clearInput(){
        this.input.setText("");
    }

    private void checkInvalidInput(){
        try {
            int i = Integer.parseInt(this.input.getText());
        }
        catch (Exception e){
            this.input.setText("0");
        }
    }
}
