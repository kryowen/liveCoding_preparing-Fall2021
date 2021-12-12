import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ex extends JFrame {
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.GREEN);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Container c = (Container) e.getSource();
				c.setBackground(Color.GREEN);
			}
		});
		
		c.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				Container c = (Container) e.getSource();
				c.setBackground(Color.YELLOW);
			}

			@Override
			public void mouseMoved(MouseEvent e) {}
		});

		
		setSize(300, 300);
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
