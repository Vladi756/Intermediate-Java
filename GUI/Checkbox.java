import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;													// Necessary Imports

public class Checkbox extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;													// Declaring in the global scope so every class has access to them

	Checkbox(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("X.png");
		checkIcon = new ImageIcon("Checkmark.png");
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("Are you a robot?");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);								// When selected, the Image Icon chagnes.
		
		this.add(checkBox);
		this.add(button);
		this.pack();
		this.setVisible(true);										// Adding everything to frame, making it visisble.
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());						// Outputs to console whether it's selected or not
		}
	}	
}


/* To test this code copy and paste this in your main folder:
 * 
 * public class Main {
	public static void main(String[] args) {
		
		// JCheckBox = a GUI componenet that can be selected or deselected. 
		
		new MyFrame();		// Creates an instance of MyFrame.
	}
} */	
