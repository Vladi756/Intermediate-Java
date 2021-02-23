import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	MyFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("rocket.png");		// Image saved on my PC.
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);		// Manually set position because layout manager = 0;
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);						
	}
	
	
	// ---------- UNIMPLEMENTED METHODS OF KEY LISTENER -------------- // 
	@Override
	public void keyTyped(KeyEvent e) {
		// Invoked when a key is typed. Char output.
		
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX() - 10 ,label.getY());
				break;
			case 's': label.setLocation(label.getX(),label.getY() + 10);
				break;
			case 'd': label.setLocation(label.getX() + 10 ,label.getY());
				break;
			case 'w': label.setLocation(label.getX(),label.getY() - 10);	// Moves the label from current position to a specified direction
				break;							// direction depends on what access has a number added/subtracted to it.
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Invoked when a physical key is pressed down. Int output.
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Invoked whenever a button is released.
	}
}
