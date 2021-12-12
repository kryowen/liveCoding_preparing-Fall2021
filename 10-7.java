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
		text.addMouseWheelListener(new MouseAdapter() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int size = text.getFont().getSize();
				int n = e.getWheelRotation();
				
				if(n < 0) {
					if(size >= 5) {
						text.setFont(new Font("Arial", Font.PLAIN, size-5));
					}
				} else {
					text.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
			}
			
		});
		c.add(text);
		
		setSize(300, 300);
		setVisible(true);
		
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
