package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        
        // JFrame = a GUI window to which components can be added to 
        
        JFrame frame = new JFrame();                                // Creates an instance of a frame
        
        frame.setSize(450, 450);                                    // Sets x and y dimension (respectively)
        frame.setVisible(true);                                     // Make frame visible
        frame.setTitle("Gamez");                                    // Sets frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // Default - HIDE. Exits out of application
        frame.setResizable(false);                                  // Can't resize frame 
        
        // Basic GUI
    }
    
}
