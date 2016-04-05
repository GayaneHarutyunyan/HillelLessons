package Lesson16.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 05.04.2016.
 */
public class Calculator extends JFrame {
    private JPanel panel1;
    private JTextField input;
    private JButton a9Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton plusButton1;
    private JButton a0Button;
    private JButton equalButton;

    public Calculator() {
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setTitle("Calculator");

        ActionListener listener = new ActionListener() {
            private int value;

            @Override
            public void actionPerformed(ActionEvent e) {

                String command = e.getActionCommand();
                switch (command) {
                    case "+":
                        //преобразовать
                        value = Integer.parseInt(input.getText());
                        input.setText("");
                        break;
                    case "=":
                        int secondValue = Integer.parseInt(input.getText());
                        input.setText(Integer.toString(value + secondValue));
                        break;
                    default:
                        //кантонектация
                        String text = input.getText();
                        //System.out.println("button " + command + " persons");

                        //Для того чтобы отобразилос на экранне
                        input.setText(text + command);
                }
            }
        };


        a9Button.addActionListener(listener);
        a7Button.addActionListener(listener);
        a8Button.addActionListener(listener);
        a5Button.addActionListener(listener);
        a6Button.addActionListener(listener);
        a4Button.addActionListener(listener);
        a3Button.addActionListener(listener);
        a1Button.addActionListener(listener);
        a2Button.addActionListener(listener);
        plusButton1.addActionListener(listener);
        a0Button.addActionListener(listener);
        equalButton.addActionListener(listener);

        a9Button.setActionCommand("9");
        a7Button.setActionCommand("7");
        a8Button.setActionCommand("8");
        a5Button.setActionCommand("5");
        a6Button.setActionCommand("6");
        a4Button.setActionCommand("4");
        a3Button.setActionCommand("3");
        a1Button.setActionCommand("1");
        a2Button.setActionCommand("2");
        a0Button.setActionCommand("0");
        input.setEnabled(false);

        //input.setText("0");
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
