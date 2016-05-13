package SchoologyAssignments;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class UnitVector extends JFrame {
	//no instance variables
	
	public UnitVector() {
		init();
		
	}
	
	//INIT
	//sets size and background
	public void init() {
		setSize(700,600);
		setBackground(Color.white);
		repaint();
	}
	
	//PAINT
	//the main part of the code
	//invokes all the other functions
	public void paint(Graphics g) {
		g.setColor(Color.black);
		Point p1 = new Point(100, 100);
		Point p2 = new Point(200,400);
		g.drawLine(100, 100, 200, 400);
		vector(g, p1, p2);
		repaint();
					
	}	 
	public void vector(Graphics g, Point p1, Point p2){
		int xDiff = p2.x - p1.x;
		int yDiff = p2.y - p1.y;
		g.drawLine(xDiff, yDiff, xDiff, yDiff);
//		Point fin = new Point(xDiff, yDiff);
//		return fin;
}
}
