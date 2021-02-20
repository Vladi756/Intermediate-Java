import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;						// Necessary Imports

public class Button extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	
	Button() {
		
		ImageIcon pic = new ImageIcon("Dice.png");		// "Dice.png" saved in the same directory as the project.
		
		label = new JLabel();
		label.setIcon(pic);
		label.setBounds(150 ,250, 150, 150);
		label.setVisible(false);
		
		JButton button = new JButton();
		button.setBounds(100, 100, 200, 50);
		button.addActionListener(e->  { System.out.println("Hey!"); label.setVisible(true); });		// Makes the button print hey and show the imageIcon.
		
		button.setText("I'm a button!");
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		button.setForeground(Color.white);
		button.setBackground(Color.black);
		button.setBorder(BorderFactory.createEtchedBorder());
	
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(600, 600);
		this.setVisible(true);
		this.add(button);
		this.add(label);							// Adds button and label to the frame.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
