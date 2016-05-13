// MOVE SPHERES //
// By Nisha McNealis //
// OO Programming Period 5 //


package InProgress;
import java.awt.*;
import javax.swing.JFrame;

import InProgress.Point;

//Here is my code for Move Spheres with two spheres.
//Once I understood the formula, the project went smoothly.
//However, I was very confused before I understood it.

public class MoveSpheres extends JFrame {
		//instance variables
	public  double xpos;
	public double ypos;
	public  double xvel;
	public  double yvel;
	public double xacc;
	public  double yacc;
	public double dt;
	public double mass;
	public Point force;
	
		
		public MoveSpheres() {
			init();
			xpos = 1;
			ypos = 0;
			yvel = 10;
			yacc = -1; 
			xvel = 4;
			xacc = 1;
			dt = 0.1;
			mass = 3;
			
			
		}
		public Point getForce(Graphics g, Point p1, Point p2){
			Spheres s = new Spheres();
			Point force = s.line(g, p1, p2);
			return force;
		}
		//DRAWCIRCLE
	
		//draws a circle when given only one point, the center
		//finds the points necessary to invoke drawOval, a 
		//graphics function
		public void drawCircle(Graphics g, Point p, int radius){
			int circleX = (int) (p.x - radius);
			int circleY = (int) (p.y - radius);
			g.drawOval(circleX, circleY, radius*2, radius * 2);
			}
		public void eraseCircle(Graphics g, Point p, int radius){
			sleep();
			g.setColor(Color.white);
			int circleX = (int) (p.x - radius);
			int circleY = (int) (p.y - radius);
			g.drawOval(circleX, circleY, radius*2, radius * 2);
			}
		
		//INIT
		//sets size and background
		public void init() {
			setSize(700,600);
			setBackground(Color.white);
			repaint();
		}
		public void sleep(){
		try {
		    Thread.sleep(10);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
		//PAINT
		//the main part of the code
		//invokes all the other functions
		public void paint(Graphics g) {
			g.setColor(Color.black);
			Point pt = new Point((int)xpos, (int)ypos);
			drawCircle(g, pt, 100);
			sleep();
			eraseCircle(g, pt, 100);
			Point pt2 =   new Point(500, 400);
			drawCircle(g, pt2, 100);
			line(g, pt, pt2);
			////
			nextGen();
			repaint();
						
		}	
		public void nextGen(){
			System.out.println("My position is " + xpos + ", " + ypos);
			xpos += xvel * dt;
			xvel += xacc * dt;
			xacc = force.x/mass;
			ypos += yvel * dt;
			yvel += yacc * dt;
			yacc = force.y/mass;
		}
public Point line(Graphics g, Point pt, Point pt2){
			
			//uses the distance function of point
			int d = (int) pt.distance(pt2);
			
			//finds bx and by
			int xDiff = pt2.x - pt.x;
			int yDiff = pt2.y - pt.y;
			
			//finds 1/d^2 and then multiplies it by 10000000
			//so that it is visible
			int frac = 10000000/(d * d);
			
			//finds bx/d * 10000000/d^2 
			int step1x = (xDiff / d)* frac;
			int step2x = step1x + pt.x;
			
			//finds by/d * 10000000/d^2 
			int step1y = (yDiff / d)* frac;
			int step2y = step1y + pt.y;
			
			//uses all this info to draw the line
			g.drawLine(pt.x, pt.y, step2x, step2y);
			force = new Point(step2x, step2y);
			return force;
		}
//		public static void main(String[] args) {
//			System.out.print(pos);
//			System.out.print(vel);
//		}
}