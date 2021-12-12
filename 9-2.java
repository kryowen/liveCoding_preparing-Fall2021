import java.awt.*;
import javax.swing.*;

class Ex extends JFrame {
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		
		c.add(new JButton("NORTH"), BorderLayout.NORTH);
		c.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		c.add(new JButton("CENTER"), BorderLayout.CENTER);
		c.add(new JButton("EAST"), BorderLayout.EAST);
		c.add(new JButton("WEST"), BorderLayout.WEST);
		
		setSize(400, 200);
		setVisible(true);
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
