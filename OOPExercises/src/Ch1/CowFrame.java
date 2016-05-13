package Ch1;

import java.awt.*;
import javax.swing.JFrame;

public class CowFrame extends JFrame {
	private final Color BISQUE = new Color(0xcdb79e);
	
	public CowFrame () {
		init();
	}
	
	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}
	
	public void paint(Graphics g) {
		g.setColor(BISQUE);
		g.fillRect(50, 100, 400, 200);
		g.setColor(Color.BLACK);
		g.drawOval(350, 50, 200, 100);
	}
}