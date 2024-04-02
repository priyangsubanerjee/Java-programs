package swing;

// Implement a GUI application which consists of one List Box and one button. The list box will have four different color names. When the user will select a color from the list box and click on the button, the panel color will be changed to that colo

import javax.swing.*;
import java.awt.*;

class ButtonColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button");
        JButton red = new JButton("Red");//creating instance of JButton  
        JButton green = new JButton("Green");//creating instance of JButton  
        JButton blue = new JButton("Blue");//creating instance of JButton  
        
        red.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
        green.setBounds(130, 150, 100, 40);//x axis, y axis, width, height
        blue.setBounds(130, 200, 100, 40);//x axis, y axis, width, height

        frame.add(red);//adding button in JFrame
        frame.add(green);//adding button in JFrame
        frame.add(blue);//adding button in JFrame


        red.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.RED);
        });

        blue.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.BLUE);
        });

        green.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.GREEN);
        });

        frame.setSize(400, 500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }
}