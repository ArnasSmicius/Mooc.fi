
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private CalculatorLogic logic;

    public GraphicCalculator(){
        this.logic = new CalculatorLogic();
    }

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300, 150));

        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField upperBlock = new JTextField("0");
        upperBlock.setEnabled(false);

        JTextField middleBlock = new JTextField("0");

        this.logic.setTextField(middleBlock, upperBlock);

        GridLayout buttonsLayout = new GridLayout(1,3);
        JPanel buttons = new JPanel(buttonsLayout);

        JButton plus = new JButton("+");
        PlusRecordListener plusAction = new PlusRecordListener(this.logic);
        plus.addActionListener(plusAction);
        buttons.add(plus);

        JButton minus = new JButton("-");
        MinusActionListener minusAction = new MinusActionListener(this.logic);
        minus.addActionListener(minusAction);
        buttons.add(minus);

        JButton z = new JButton("Z");
        this.logic.setZButton(z);
        ZActionListener reset = new ZActionListener(this.logic);
        z.addActionListener(reset);
        buttons.add(z);


        container.add(upperBlock);
        container.add(middleBlock);
        container.add(buttons);

    }

    public JFrame getFrame() {
        return frame;
    }
}