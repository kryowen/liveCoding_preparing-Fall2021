import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ex extends JFrame {
	
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");
		c.add(label);
		label.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				label.setText("사랑해");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				label.setText("Love Java");
			}
			
		});
		
		setSize(350, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
