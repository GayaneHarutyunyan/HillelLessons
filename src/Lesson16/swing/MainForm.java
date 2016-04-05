package Lesson16.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainForm extends JFrame {
    private JPanel panel;
    private JButton closeBtn;
    private JButton anotherCloseBtn;

    public MainForm() {
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //разместить форму  центре экранна
        setLocationRelativeTo(null);
        //загаловк этого окна
        setTitle("My first form");
        //Подгоняет размер формы
        pack();
        //  CloseOperation closeOperation = new CloseOperation();


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        //тоже самое !!!   actionListener =  e -> System.exit(0);


        closeBtn.addActionListener(actionListener);
        anotherCloseBtn.addActionListener(actionListener);

    }

    public static void main(String[] args) {
        new MainForm();
    }
}
