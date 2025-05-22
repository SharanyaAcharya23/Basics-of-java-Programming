
//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
//pressed” depending upon the JButton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener().
package prgm4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonPress4b extends JFrame implements ActionListener {
 private JButton btnSrilanka, btnIndia;
 private JLabel messageLabel;

 public CountryButtonPress4b() {
     setTitle("Country Button Press");
     setLayout(new FlowLayout());

     btnSrilanka = new JButton("Srilanka");
     btnIndia = new JButton("India");

     btnSrilanka.addActionListener(this);
     btnIndia.addActionListener(this);

     messageLabel = new JLabel("Press a button");
     messageLabel.setFont(new Font("Arial", Font.BOLD, 16));

     add(btnSrilanka);
     add(btnIndia);
     add(messageLabel);

     setSize(300, 150);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
 }

 @Override
 public void actionPerformed(ActionEvent e) {
     if (e.getSource() == btnSrilanka) {
         messageLabel.setText("Srilanka is pressed");
     } else if (e.getSource() == btnIndia) {
         messageLabel.setText("India is pressed");
     }
 }

 public static void main(String[] args) {
     SwingUtilities.invokeLater(() -> {
         new CountryButtonPress4b().setVisible(true);
     });
 }
}
