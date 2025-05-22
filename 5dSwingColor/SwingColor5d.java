// 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display them on console whenever the countries are selected on the list.

package prgm5;
import javax.swing.*;
import java.awt.*;

public class SwingColor5d{

 public static void main(String[] args) {
     // Create the main JFrame
     JFrame frame = new JFrame("Tabbed Pane Colors - CMY");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400, 300);
     frame.setLocationRelativeTo(null);

     // Create a JTabbedPane
     JTabbedPane tabbedPane = new JTabbedPane();

     // Create panels with different background colors
     JPanel cyanPanel = new JPanel();
     cyanPanel.setBackground(Color.CYAN);

     JPanel magentaPanel = new JPanel();
     magentaPanel.setBackground(Color.MAGENTA);

     JPanel yellowPanel = new JPanel();
     yellowPanel.setBackground(Color.YELLOW);

     // Add the panels as tabs
     tabbedPane.addTab("Cyan", cyanPanel);
     tabbedPane.addTab("Magenta", magentaPanel);
     tabbedPane.addTab("Yellow", yellowPanel);

     // Add the tabbedPane to the frame
     frame.add(tabbedPane);

     // Make the frame visible
     frame.setVisible(true);
 }
}