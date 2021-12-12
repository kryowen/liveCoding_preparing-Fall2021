import java.awt.*;
import javax.swing.*;

class North extends JPanel {
	public North() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.GRAY);
		
		add(new JLabel("수식입력"));
		add(new JTextField(15));
	}
}

class Center extends JPanel {
	public Center() {
		setLayout(new GridLayout(4, 4, 1, 1));
		setOpaque(true);

		JButton[] buttons = new JButton[16];
		for(int i = 0; i < 12; i++) {
			buttons[i] = new JButton(Integer.toString(i+1));
			add(buttons[i]);
		}
		
		int c = 0;
		String[] arr = {"+","-","*","/"};
		for(int i = 12; i < 16; i++) {
			buttons[i] = new JButton(arr[c++]);
			buttons[i].setBackground(Color.CYAN);
			add(buttons[i]);
		}
	}
}

class South extends JPanel {
	public South() {
		setLayout(new FlowLayout());
		setOpaque(true);
		setBackground(Color.YELLOW);
		
		add(new JLabel("계산결과"));
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
