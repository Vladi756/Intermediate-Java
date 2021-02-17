import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;							// Neccessary imports

public class Layered_Panes {
	public static void main(String[] args) {
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(90, 90, 200, 200);					// Creating 5 JLabels of different colors
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.BLUE);
		label2.setBounds(120, 120, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.YELLOW);
		label3.setBounds(150, 150, 200, 200);

		JLabel label4 = new JLabel();
		label4.setOpaque(true);
		label4.setBackground(Color.MAGENTA);
		label4.setBounds(180, 180, 200, 200);
		
		JLabel label5 = new JLabel();
		label5.setOpaque(true);
		label5.setBackground(Color.CYAN);
		label5.setBounds(210, 210, 200, 200);
		
		JLayeredPane pane = new JLayeredPane();
		pane.setBounds(0, 0, 500, 500);						  // The panes layer over each other because they are in a JLayeredPane
		
		pane.add(label1, Integer.valueOf(0));
		pane.add(label2, Integer.valueOf(1));
		pane.add(label3, Integer.valueOf(2));
		pane.add(label4, Integer.valueOf(3));
		pane.add(label5, Integer.valueOf(4));
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.add(pane);							  // Add everything to the frame
	
		
		frame.setVisible(true);							  // Once everything is added, make it visisble
	}
}
