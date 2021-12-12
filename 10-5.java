import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ex extends JFrame {
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel text = new JLabel("Love Java");
		text.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(text);
		
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int size = text.getFont().getSize();
				
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					text.setFont(new Font("Arial", Font.PLAIN, size+5));
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if(size >= 5) {
						text.setFont(new Font("Arial", Font.PLAIN, size-5));
					}
				}
			}
		});
		
		setSize(300, 150);
		setVisible(true);
		
		text.setFocusable(true);
		text.requestFocus();
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
