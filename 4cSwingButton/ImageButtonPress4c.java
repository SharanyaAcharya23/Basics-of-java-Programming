
//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
//Glass is pressed” depending upon the JButton with image either Digital Clock or Hour Glass
//is pressed by implementing the event handling mechanism with addActionListener().


	package prgm4;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class ImageButtonPress4c {

	    public static void main(String[] args) {
	        // Create the JFrame window
	        JFrame frame = new JFrame("Button Image Demo");

	        // Create the JLabel for the message
	        JLabel messageLabel = new JLabel("Press a button", JLabel.CENTER);
	        messageLabel.setFont(new Font("Serif", Font.PLAIN, 24));
	        messageLabel.setBounds(100, 50, 300, 50);

	        // Load images (ensure these images are in the prg4 directory)
	        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\Asus\\Desktop\\image\\digitalclock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\Asus\\Desktop\\image\\glassclock.png");

	        // Create the "Digital Clock" button
	        JButton digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
	        digitalClockButton.setBounds(50, 150, 200, 200);
	        digitalClockButton.setFont(new Font("Serif", Font.PLAIN, 18));

	        // Create the "Hour Glass" button
	        JButton hourGlassButton = new JButton("Hour Glass", hourGlassIcon);
	        hourGlassButton.setBounds(300, 150, 200, 200);
	        hourGlassButton.setFont(new Font("Serif", Font.PLAIN, 18));

	        // Add action listener for Digital Clock button
	        digitalClockButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        // Add action listener for Hour Glass button
	        hourGlassButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Add components to the frame
	        frame.add(messageLabel);
	        frame.add(digitalClockButton);
	        frame.add(hourGlassButton);

	        // Frame settings
	        frame.setSize(600, 400);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);  // Center the frame
	        frame.setVisible(true);
	    }
	}