// MOVE SPHERES //
// By Nisha McNealis //
// OO Programming Period 5 //


package SchoologyAssignments;
import java.awt.*;
import javax.swing.JFrame;
/*
Here is my code for Move Spheres with two spheres.
I was very confused about this project.
I think that I would have been able to complete the project if
I had understood the underlying concepts. Unfortunately, I did not.
It took me an entire class period to simply make the spheres move,
leaving me no time to make them move correctly. I asked
Mr. Kuszmaul for help once, which helped me solve a few errors.
However, my code still does not work. 
I will explain some of the errors here:
1. The spheres do not orbit. I tried to implement the formula that was given to us,
but it didn't work.
2. Lines are drawn on the screen. I don't know why because my code does not use the command "drawLine". 
I was very confused about these lines.
Even though it has some big errors, I was still able to complete part of the assignment.
This is what I accomplished:
1. The spheres move. This requires a drawCircle function and an eraseCircle function that work correctly.
I also had to figure out how to make the circle's x and y coordinates change.
2. I have the right formula. I was able to change each value according to the formulas Mr. K explained.
3. I tried very hard to make this code work. I was always on task and using my time well. I sought help from outside
resources including Mr. K and Sufi K.
For these reasons, I hope that I can receive credit for my work.
The individual methods are explained in comments later in the code.
Thanks!
*/
public class MoveSpheres extends JFrame {
	//instance variables
	public  double xpos;
	public double ypos;
	public  double xvel;
	public  double yvel;
	public double xacc;
	public  double yacc;
	public  double xpos2;
	public double ypos2;
	public  double xvel2;
	public  double yvel2;
	public double xacc2;
	public  double yacc2;
	public double dt;
	public double mass;
	public Point force1;
	public Point center;

//Sets all the variables
	public MoveSpheres() {
		init();
		xpos = 10;
		ypos = 30;
		yvel = 10;
		yacc = 0; 
		xvel = 4;
		xacc = 0;
		dt = 0.1;
		mass = 30;
		center = new Point(350, 300);
	
	}
	public Point setForce(Graphics g, Point p1, Point p2){
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
		Point pt = new Point((int)xpos + 200, (int)ypos + 200);
		Point pt2 =   new Point((int)ypos + 300, (int)xpos + 300);
		////
		setForce(g, pt, pt2);
		nextGen1(g, pt, pt2);
		////
		drawCircle(g, pt2, 100);
		drawCircle(g, pt, 100);
		sleep();
		eraseCircle(g, pt, 100);
		eraseCircle(g, pt2, 100);
		repaint();

	}	
	//Updates all variables
	public void nextGen1(Graphics g, Point pt, Point pt2){
		force1 = setForce(g, pt, pt2);
		xpos += xvel * dt;
		xvel += xacc * dt;
		xacc = force1.x/mass;
		
		ypos += yvel * dt;
		yvel += yacc * dt;
		yacc = force1.y/mass;
		System.out.println("My position is " + xpos + ", " + ypos);

		xpos2 += xvel2 * dt;
		xvel2 += xacc2 * dt;
		xacc2 = force1.x/mass * -1;
		
		ypos2 += yvel * dt;
		yvel2 += yacc * dt;
		yacc2 = force1.y/mass * -1;
	}
	public Point line(Graphics g, Point pt, Point pt2){

		//uses the distance function of point
		int d = (int) pt.distance(pt2);

		//finds bx and by
		int xDiff = pt2.x - pt.x;
		int yDiff = pt2.y - pt.y;

		//finds 1/d^2 and then multiplies it by 10000000
		//so that it is visible
		int frac = 100000/(d * d);

		//finds bx/d * 10000000/d^2 
		int step1x = (xDiff / d)* frac;
		int step2x = step1x + pt.x;

		//finds by/d * 10000000/d^2 
		int step1y = (yDiff / d)* frac;
		int step2y = step1y + pt.y;

		force1 = new Point(step1x, step1y);
		return force1;
	}
}