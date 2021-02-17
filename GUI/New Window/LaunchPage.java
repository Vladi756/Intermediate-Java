import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;						// Necessary imports.

public class LaunchPage implements ActionListener{
		
	JFrame frame =  new JFrame();
	JButton button = new JButton("New Window");			// Creates new JFrame.
	
	LaunchPage() {
		button.setBounds(100, 160, 200, 50);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}							// Causes the button to open a new window called myWindow.
		
	}
}
