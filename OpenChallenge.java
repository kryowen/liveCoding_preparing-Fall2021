import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Ex extends JFrame {
	JLabel[] labels;
	JLabel text;
	
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		labels = new JLabel[3];
		for(int i = 0; i < 3; i++) {
			labels[i] = new JLabel("0", JLabel.CENTER);
			labels[i].setFont(new Font("Arial", Font.PLAIN, 20));
			labels[i].setSize(50, 30);
			labels[i].setLocation(45+i*100, 30);
			labels[i].setBackground(Color.MAGENTA);
			labels[i].setOpaque(true);
			labels[i].setForeground(Color.YELLOW);
			c.add(labels[i]);
		}
		
		text = new JLabel("시작합니다.");
		text.setSize(100, 30);
		text.setLocation(125, 150);
		c.add(text);
		
		c.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '\n') {
					labels[0].setText(Integer.toString((int) (Math.random() * 5)));
					labels[1].setText(Integer.toString((int) (Math.random() * 5)));
					labels[2].setText(Integer.toString((int) (Math.random() * 5)));
					
					if(labels[0].getText().equals(labels[1].getText()) && labels[0].getText().equals(labels[2].getText())) {
						text.setText("축하합니다!");
					} else {
						text.setText("아쉽군요");
					}
				}
			}
			
		});
			

		setSize(350, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
