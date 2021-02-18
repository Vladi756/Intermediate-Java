import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;										// Necessary imports

public class MyFrame extends JFrame implements ActionListener{						// Extends JFrame and implement Action Listener.
	
	JButton button;
	JTextField textField;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());							// Layout manager and close operation
		
		button = new JButton("Submit");
		button.addActionListener(this);								// MyFrame implements ActionListener - so "this" can be passed
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 60));
		textField.setFont(new Font("Consolas", Font.PLAIN, 20));
		textField.setForeground(Color.RED);							
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.RED);							// Vanity
		
		
		this.add(textField);
		this.add(button);
		
		this.pack();										// Adjusts to fit all components
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Welcome " + textField.getText());				// getText gets the text from where is specified
			button.setEnabled(false);
			textField.setEditable(false);							// Disables button and can't edit the text field afterwards
		}
	}	
}
