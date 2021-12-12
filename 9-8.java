import java.awt.*;
import javax.swing.*;

class North extends JPanel {
	public North() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.GRAY);
		
		JButton[] buttons = new JButton[3];
		buttons[0] = new JButton("열기");
		buttons[1] = new JButton("닫기");
		buttons[2] = new JButton("나가기");
		
		add(buttons[0]);
		add(buttons[1]);
		add(buttons[2]);
	}
}

class Center extends JPanel {
	public Center() {
		setLayout(null);
		
		JLabel[] labels = new JLabel[10];
		for(int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("*");
			labels[i].setForeground(Color.RED);
			labels[i].setSize(10, 10);
			labels[i].setLocation((int) (Math.random()*200) + 50, (int) (Math.random()*200) + 50);
			
			add(labels[i]);
		}
	}
}

class South extends JPanel {
	public South() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.YELLOW);
		
		add(new JLabel("Word Input"));
		add(new JTextField(15));
	}
}


class Ex extends JFrame {
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
	
		
		c.add(new North(), BorderLayout.NORTH);
		c.add(new Center(), BorderLayout.CENTER);
		c.add(new South(), BorderLayout.SOUTH);
		
		setSize(350, 300);
		setVisible(true);
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
