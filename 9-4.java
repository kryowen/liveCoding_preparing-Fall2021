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
		c.setLayout(new GridLayout(1, 10));
		
		JButton[] buttons = new JButton[10];
		for(int i = 0; i < 10; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			buttons[i].setOpaque(true);
			buttons[i].setBackground(color[i]);
			c.add(buttons[i]);
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
