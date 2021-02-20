import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;								// Neccessary Imports


public class Slider implements ChangeListener{		// Need to implement the ChangeListener library so the value at the label can constantly change.

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;									// Declaring everything in the global scope. 
	
	Slider() {
		
		frame = new JFrame("Slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);				// Initializing everything.
		
		slider.setPreferredSize(new Dimension(400, 400));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);				// Small ticks every 10 units.
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);				// Big ticks every 25 units.	
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("Times New Roman", Font.BOLD, 15));
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);						// Passing the change listener to the slider so the value updates.				
		
		label.setText("°C = " + slider.getValue());
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));	// Editing the label for vanity.
		
		panel.add(slider);
		panel.add(label);									// Adding the slider and label to the panel
		
		frame.add(panel);
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setVisible(true);								// Setting up the JFrame.
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + slider.getValue());					// ChangedListener constantly updates the text on the panel.
	}		
}