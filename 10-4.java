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
		c.add(text);
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String str = text.getText();
					str = (str.substring(1).concat(str.substring(0, 1)));
					text.setText(str);
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
