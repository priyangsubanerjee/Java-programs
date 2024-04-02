// Design a registration form using Swing with following components on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image.

package lab07;

import javax.swing.*;
import java.awt.*;

public class REGBOX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 400);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(5, 20);
        JCheckBox agreeBox = new JCheckBox("I agree to the terms and conditions");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();

        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JButton submitButton = new JButton("Submit");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(addressLabel);
        frame.add(addressArea);
        frame.add(agreeBox);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(submitButton);

        frame.setSize(400, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
