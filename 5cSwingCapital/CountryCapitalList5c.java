
//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list.

package prgm5;


import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Font;
import java.util.HashMap;

public class CountryCapitalList5c {

 public static void main(String[] args) {
     // Create the JFrame window
     JFrame frame = new JFrame("Country Capital Selector");

     // List of countries
     String[] countries = {
         "USA", "India", "Vietnam", "Canada", "Denmark", 
         "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
     };

     // Map of country capitals
     HashMap<String, String> capitals = new HashMap<>();
     capitals.put("USA", "Washington, D.C.");
     capitals.put("India", "New Delhi");
     capitals.put("Vietnam", "Hanoi");
     capitals.put("Canada", "Ottawa");
     capitals.put("Denmark", "Copenhagen");
     capitals.put("France", "Paris");
     capitals.put("Great Britain", "London");
     capitals.put("Japan", "Tokyo");
     capitals.put("Africa", "Addis Ababa (Ethiopia)");  // Ethiopia as African Union HQ
     capitals.put("Greenland", "Nuuk");
     capitals.put("Singapore", "Singapore");

     // Create the JList for countries
     JList<String> countryList = new JList<>(countries);
     countryList.setFont(new Font("Serif", Font.PLAIN, 20));
     countryList.setVisibleRowCount(10);

     // Add scroll pane for the JList
     JScrollPane scrollPane = new JScrollPane(countryList);
     scrollPane.setBounds(50, 50, 300, 300);

     // Add selection listener to print capitals to console
     countryList.addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {
             if (!e.getValueIsAdjusting()) {
                 for (String country : countryList.getSelectedValuesList()) {
                     String capital = capitals.get(country);
                     System.out.println("Capital of " + country + " is " + capital);
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
