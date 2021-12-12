import java.awt.*;
import javax.swing.*;

class Ex extends JFrame {
	public Ex() {
		super("Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);
		setVisible(true);
	}
}

public class Main {
	public static void main(String[] args) {
		new Ex();
	}
}
