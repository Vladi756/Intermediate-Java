import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progress_Bar {		
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	Progress_Bar() {
		
		bar.setValue(0);
		bar.setBounds(5, 15, 470, 60);
		bar.setStringPainted(true);						// Adds Percentage to progress bar.
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.RED);
		bar.setBackground(Color.BLACK);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		while(counter <= 100) {
		bar.setValue(counter);
			try {
				Thread.sleep(50);								// Pauses program for 50 milliseconds after each iteration of our while loop
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 		
			counter += 1;    									// Increase at 10 percent a second.
		}
		bar.setString("Completed!");
	}
}