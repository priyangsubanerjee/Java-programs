// Write a GUI program in Java with three Labels – Enter the First Number, Enter the Second Number, Result, and three text fields for  - first number, second number and result and four buttons - Add, Sub, multiply and reset as shown below. On clicking of any of these buttons, the corresponding operation should be performed with input1 and input2 and the result should be displayed in the result box.

package lab07;

import java.awt.*;
import javax.swing.*;

public class CALC {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JLabel label1 = new JLabel("Enter the First Number");
        JLabel label2 = new JLabel("Enter the Second Number");
        JLabel label3 = new JLabel("Result");
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JTextField text3 = new JTextField();
        JButton add = new JButton("Add");
        JButton sub = new JButton("Sub");
        JButton mul = new JButton("Mul");
        JButton reset = new JButton("Reset");

        label1.setBounds(50, 50, 150, 30);
        label2.setBounds(50, 100, 150, 30);
        label3.setBounds(50, 150, 150, 30);
        text1.setBounds(200, 50, 150, 30);
        text2.setBounds(200, 100, 150, 30);
        text3.setBounds(200, 150, 150, 30);
        add.setBounds(50, 200, 100, 30);
        sub.setBounds(150, 200, 100, 30);
        mul.setBounds(250, 200, 100, 30);
        reset.setBounds(350, 200, 100, 30);

        add.addActionListener(e -> {
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            text3.setText(String.valueOf(num1 + num2));
        });

        sub.addActionListener(e -> {
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            text3.setText(String.valueOf(num1 - num2));
        });

        mul.addActionListener(e -> {
            int num1 = Integer.parseInt(text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            text3.setText(String.valueOf(num1 * num2));
        });

        reset.addActionListener(e -> {
            text1.setText("");
            text2.setText("");
            text3.setText("");
        });

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(reset);

        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
