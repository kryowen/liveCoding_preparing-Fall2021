import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ex extends JFrame {
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel text = new JLabel("C");
		text.setSize(10, 10);
		text.setLocation(100, 100);
		text.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JLabel label = (JLabel) e.getSource();
				label.setLocation((int)(Math.random()*350), (int)(Math.random()*350));
			}
			
		});
		c.add(text);
		
		setSize(400, 400);
		setVisible(true);
		
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
