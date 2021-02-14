package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Basic_Panels {
    public static void main(String[] args) {
        
        // JFrame = a GUI window to which components can be added to. 
        // JPanel = a GUI component that functions as a container to hold other components.
        
        JPanel bluePanel = new JPanel();                            // Create a panel 
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 0, 250, 250);                        // Dimensions and location of panel
        
        JPanel redPanel = new JPanel();                             // Same process repeated 4 times 
        redPanel.setBackground(Color.red);
        redPanel.setBounds(250, 0, 250, 250);

        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 250, 250);
        
        
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(250, 250, 250, 250);
                
        JFrame frame = new JFrame();                            // Create a frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Makes it so the program stops running when the window (frame) is closed.
        frame.setVisible(true);
        frame.setSize(600, 600);

        frame.setLayout(null);
        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(yellowPanel);                                 // Add all the panels to the frame.

        
    }
    
}
