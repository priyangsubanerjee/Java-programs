// Design a GUI application which consists of three Label named as Red, Green and blue, three combo boxes which will consist the value from 0 to 255 and one button named as show output. The user will select different values from three combo boxes. When the user clicks on the button, the panel background will be changed accordingly as per the value passed in RGB format

package lab07;

import javax.swing.*;

import java.awt.*;


class RGB {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button");
        JButton button = new JButton("Change Color");//creating instance of JButton
        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> red = new JComboBox<>(getValues());
        JComboBox<String> green = new JComboBox<>(getValues());
        JComboBox<String> blue = new JComboBox<>(getValues());
        red.setBounds(130, 100, 100, 80);//x axis, y axis, width, height
        green.setBounds(130, 150, 100, 80);//x axis, y axis, width, height
        blue.setBounds(130, 200, 100, 80);//x axis, y axis, width, height
        button.setBounds(130, 280, 100, 40);//x axis, y axis, width, height

        frame.add(red);//adding button in JFrame
        frame.add(green);//adding button in JFrame
        frame.add(blue);//adding button in JFrame
        frame.add(button);//adding button in JFrame

        button.addActionListener(e -> {
            int r = Integer.parseInt((String) red.getSelectedItem());
            int g = Integer.parseInt((String) green.getSelectedItem());
            int b = Integer.parseInt((String) blue.getSelectedItem());
            frame.getContentPane().setBackground(new Color(r, g, b));
        });

        frame.setSize(400, 500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }

    private static String[] getValues() {
        String[] values = new String[256];
        for (int i = 0; i < 256; i++) {
            values[i] = String.valueOf(i);
        }
        return values;
    }
}