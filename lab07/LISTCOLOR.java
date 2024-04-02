// Implement a GUI application which consists of one List Box and one button. The list box will have four different color names. When the user will select a color from the list box and click on the button, the panel color will be changed to that color.

package lab07;

import javax.swing.*;

import java.awt.*;

class LISTCOLOR {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button");
        JButton button = new JButton("Change Color");//creating instance of JButton
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JList<String> list = new JList<>(colors);
        list.setBounds(130, 100, 100, 80);//x axis, y axis, width, height
        button.setBounds(130, 180, 100, 40);//x axis, y axis, width, height

        frame.add(list);//adding button in JFrame
        frame.add(button);//adding button in JFrame

        button.addActionListener(e -> {
            String color = list.getSelectedValue();
            switch (color) {
                case "Red":
                    frame.getContentPane().setBackground(Color.RED);
                    break;
                case "Green":
                    frame.getContentPane().setBackground(Color.GREEN);
                    break;
                case "Blue":
                    frame.getContentPane().setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    frame.getContentPane().setBackground(Color.YELLOW);
                    break;
            }
        });

        frame.setSize(400, 500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
    }
}