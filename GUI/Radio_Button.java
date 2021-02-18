import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;										// Neccessary Imports.

public class Radio_Button extends JFrame implements ActionListener{		// Extends JFrame and implements the ActionListener. 
	
	JRadioButton pizza;
	JRadioButton burger;
	JRadioButton hotdog;					
	ImageIcon pizzaIcon;
	ImageIcon burgerIcon;
	ImageIcon hotdogIcon;
													
	Radio_Button() {													// Constructor for "Radio_Button" class.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);					
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("Checkmark.png");
		burgerIcon = new ImageIcon("Checkmark.png");
		hotdogIcon = new ImageIcon("Checkmark.png");					// Can pass name because file saved in same directory as project.
		
		pizza = new JRadioButton("Pizza");
		burger = new JRadioButton("Hamburger");
		hotdog = new JRadioButton("Hotdog");							// Creates new Radio Buttons.
		
		pizza.setIcon(pizzaIcon);
		burger.setIcon(burgerIcon);
		hotdog.setIcon(hotdogIcon);
		
		ButtonGroup group = new ButtonGroup();							// Creates button group.
		group.add(pizza);
		group.add(burger);
		group.add(hotdog);												// Adds buttons to group so only one can be selected at a time.
		
		pizza.addActionListener(this);
		burger.addActionListener(this);
		hotdog.addActionListener(this);
		
		this.add(pizza);
		this.add(burger);
		this.add(hotdog);												// Add buttons to the frame.
		
		this.pack();
		this.setVisible(true);											// Make frame visisble.
	}
	@Override
	public void actionPerformed(ActionEvent e) {						// Action listener for buttons. 
		if(e.getSource() == pizza) {
			System.out.println("One pizza, coming right up!");
		} 
		else if(e.getSource() == burger) {
			System.out.println("One hamburger, coming right up!");
		} 
		else if(e.getSource() == hotdog) {
			System.out.println("One hotdog, coming right up!");
		}  
	}	
}