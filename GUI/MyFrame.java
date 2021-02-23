import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	ImageIcon check;
	ImageIcon X;

	MyFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		check = new ImageIcon("Checkmark.png");
		X = new ImageIcon("X.png");
		
		label = new JLabel();
		label.setIcon(check);
		label.addMouseListener(this);

		this.add(label);
		this.pack();
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);						

}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on any given component.
		label.setIcon(check);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when the mouse button has been pressed on any given component.
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when the mouse button has been released on any given component.
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters the area of the component.
		label.setIcon(X);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits the area of the component.
		label.setIcon(check);
	}
}