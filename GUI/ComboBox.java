import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;								// Necessary Imports

public class ComboBox extends JFrame implements ActionListener {			// Extends JFrame and Implement ActionListener
	
JComboBox comboBox;									// Declared in the global scope.
	

	@SuppressWarnings("unchecked")
	ComboBox() {									// Class constructor
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"cow", "sheep", "ox"};				// Has to be reference data type like strings. Primitives like int won't work
		comboBox = new JComboBox(animals);					// Initialized in the constructor.
		comboBox.addActionListener(this);					// Can pass "this" as the class impelements actionListener.
		
		
		this.add(comboBox);
		this.pack();
		this.setSize(500, 500);
		this.setVisible(true);							// Setting up the JFrame.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println("You have selected: " + comboBox.getSelectedItem());		// Action Listener
		}
	}
	
}
