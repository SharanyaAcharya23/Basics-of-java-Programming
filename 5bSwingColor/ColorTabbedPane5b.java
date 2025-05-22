

//5b. Develop a Swing program in Java to create a Tabbed Pane of RED, BLUE and GREEN and
//display the concerned color whenever the specific tab is selected in the Pane.

package prgm5;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class ColorTabbedPane5b{

 public static void main(String[] args) {
     // Create the main JFrame
     JFrame frame = new JFrame("Color Tabbed Pane");

     // Create the TabbedPane
     JTabbedPane tabbedPane = new JTabbedPane();

     // Create the RED panel
     JPanel redPanel = new JPanel();
     redPanel.setBackground(Color.RED);
     JLabel redLabel = new JLabel("RED");
     redLabel.setFont(new Font("Serif", Font.BOLD, 30));
     redLabel.setForeground(Color.WHITE);
     redPanel.add(redLabel);

     // Create the BLUE panel
     JPanel bluePanel = new JPanel();
     bluePanel.setBackground(Color.BLUE);
     JLabel blueLabel = new JLabel("BLUE");
     blueLabel.setFont(new Font("Serif", Font.BOLD, 30));
     blueLabel.setForeground(Color.WHITE);
     bluePanel.add(blueLabel);

     // Create the GREEN panel
     JPanel greenPanel = new JPanel();
     greenPanel.setBackground(Color.GREEN);
     JLabel greenLabel = new JLabel("GREEN");
     greenLabel.setFont(new Font("Serif", Font.BOLD, 30));
     greenLabel.setForeground(Color.WHITE);
     greenPanel.add(greenLabel);

     // Add panels to the TabbedPane
     tabbedPane.addTab("RED", redPanel);
     tabbedPane.addTab("BLUE", bluePanel);
     tabbedPane.addTab("GREEN", greenPanel);

     // Add TabbedPane to the frame
     frame.add(tabbedPane);

     // Frame settings
     frame.setSize(500, 400);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLocationRelativeTo(null);  // Center the frame
     frame.setVisible(true);
 }
}
