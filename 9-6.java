import java.awt.*;
import javax.swing.*;

class Ex extends JFrame {

	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel[] labels = new JLabel[20];
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			labels[i].setBackground(Color.BLUE);
			labels[i].setOpaque(true);
			labels[i].setLocation((int) (Math.random()*200) + 50, (int) (Math.random()*200) + 50);
			labels[i].setSize(10, 10);
			c.add(labels[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
