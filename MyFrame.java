import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;				// Neccesary imports

public class MyFrame extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem exitItem;	
	JMenuItem saveItem;
	JMenuItem loadItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;						// Declaring everything in global scope
	
	MyFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setResizable(false);				// Creating a basic frame
		
		loadIcon = new ImageIcon("Checkmark.png");
		saveIcon = new ImageIcon("Checkmark.png");
		exitIcon = new ImageIcon("Checkmark.png");		// I have these in my computer, so you have to save them as well
		
		menuBar = new JMenuBar();				// New menu bar 
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");		// Creating Menus within the menu bar.
			
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");		// Drop down menyu itmes under file
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);				// Setting image icons to the drop down menu items
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setMnemonic(KeyEvent.VK_L); 		
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);			// Setting Mnemonics so items can be selected through keyboard.
		
		fileMenu.setMnemonic(KeyEvent.VK_F); 		
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);					// Adding items to the file menu in the menu bar
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
			System.out.println("You loaded a file.");
		} else if(e.getSource() == saveItem) {
			System.out.println("Your file has been saved.");
		} else if(e.getSource() == exitItem) {
			System.exit(0);
		}												// Action listener causes items to do various things when selected. 
	}		
}