import java.awt.*;
import javax.swing.*;

class Ex extends JFrame {
	final private Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
			Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, 
			Color.PINK, Color.LIGHT_GRAY };
	
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		JLabel[] labels = new JLabel[16];
		for(int i = 0; i < 16; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			labels[i].setOpaque(true);
			labels[i].setBackground(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
			c.add(labels[i]);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
