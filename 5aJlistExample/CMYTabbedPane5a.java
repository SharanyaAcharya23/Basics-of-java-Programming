
//5d. Develop a Swing program in Java to create a Tabbed Pane of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pane.

package prgm5;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Font;


public class CMYTabbedPane5a {

	    public static void main(String[] args) {
	        // Create the JFrame window
	        JFrame frame = new JFrame("Country Selection");

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark", 
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Create the JList for countries
	        JList<String> countryList = new JList<>(countries);
	        countryList.setFont(new Font("Serif", Font.PLAIN, 20));
	        countryList.setVisibleRowCount(10);

	        // Add scroll pane for the JList
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        scrollPane.setBounds(50, 50, 300, 300);

	        // Add selection listener to print selected countries to console
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    for (String country : countryList.getSelectedValuesList()) {
	                        System.out.println(country + " is selected");
	                    }
	                }
	            }
	        });

	        // Add components to the frame
	        frame.add(scrollPane);

	        // Frame settings
	        frame.setSize(400, 450);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);  // Center the frame
	        frame.setVisible(true);
	    }
	}
