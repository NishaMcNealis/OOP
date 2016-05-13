// TWO SPHERES //
// By Nisha McNealis //
// OO Programming Period 5 //


package SchoologyAssignments;
import java.awt.*;
import javax.swing.JFrame;

//Here is my code for Force Calculator with two spheres.
//Once I understood the formula, the project went smoothly.
//However, I was very confused before I understood it.

public class Spheres extends JFrame {
		//no instance variables
		
		public Spheres() {
			init();
			
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
		
		//INIT
		//sets size and background
		public void init() {
			setSize(700,600);
			setBackground(Color.white);
			repaint();
		}
		public void sleep(){
			try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		//PAINT
		//the main part of the code
		//invokes all the other functions
		public void paint(Graphics g) {
			g.setColor(Color.black);
			Point pt = new Point(150, 400);
			drawCircle(g, pt, 100);
			Point pt2 = new Point(500, 400);
			drawCircle(g, pt2, 100);
			line(g, pt, pt2);
			//center(g, 200, 400, 200);
			repaint();
						
		}	
		//LINE
		//the part that uses the formula Mr. Kuzsmaul provided
		//in order to find the correct coordinates of the arrow
		public Point line(Graphics g, Point pt, Point pt2){
			
			//uses the distance function of point
			int d = (int) pt.distance(pt2);
			
			//finds bx and by
			int xDiff = pt2.x - pt.x;
			int yDiff = pt2.y - pt.y;
			
			//finds 1/d^2 and then muliplies it by 10000000
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
			Point force = new Point(step2x, step2y);
			return force;
		}
}