// 4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
// Programming in Blue color plain font with font size of 32 using JFrame and JLabel
package prgm4;

import javax.swing.*;
import java.awt.*;

public class HelloSwing4a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);

        label.setForeground(Color.BLUE);
        label.setFont(new Font("Plain", Font.PLAIN, 32));

        frame.add(label);
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
