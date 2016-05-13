///* MAKE A CLOCK
// * Here is my clock project. 
// * I was able to use Java graphics to draw a clock 
// * with a working second hand. I started by figuring out how to construct
// * a circle. I used the Cow code that was provided on Schoology to learn
// * about graphics in Java. Eventually I was able to create a circle
// * with center (350, 300) with radius 100. Next, I focused on drawing a radius.
// * I found the drawLine method and used it to construct a radius
// * from the center of the circle to the top of the circle. After that,
// * I made the radius move, with the help of Mr. Kuszmaul. Note that after 
// * I created the drawClock() method, I stopped making the clock move.
// * The drawClock method takes a variety of arguments: int time, int radius,
// * int centX, int centY, and Graphics g. The drawClock method draws a clock with a 
// * specific radius and center that will be provided by the user.
// * It then draws a radius, or second hand, pointing to the number of seconds
// * given by the user. I also included an eraseClock method.
// * If I was given more time to work on this assignment, I would like
// * to add to the drawClock method and have the drawn clock's second hand move.
// * I know that my drawClock code works because I test it using TestClock.java. I also
// * know that my nextSecond code works separately because before I had created the drawClock
// * method, the second hand moved the correct amount. Mr. Kuszmaul helped me make nextSecond, so
// * he will hopefully remember that it worked. Unfortunately, the two separate methods do not 
// * work together. I am not sure why that is, but I believe that reducing the number of instance variables
// * I have could fix the problem. 
// */
//package Ch2;
////Importing Graphics library
//import java.awt.*;
//import javax.swing.JFrame;
//
//import InProgress.Point;
//
//public class Clock extends JFrame {
//	Point center1 = new Point (200,300);
//	Point center2 = new Point (400,300);
//	double t = 2 * Math.PI / 60;
//	int r  = 100;
//	int time = 10;
//	
//	public Clock () {
//		init();
//		
//	}
//	
//	public void init() {
//		setSize(700,600);
//		setBackground(Color.WHITE);
//		repaint();
//	}
//	public void plotCircle(Graphics g){
//		int circ1x = center1.x - r;
//		int circ1y = center1.y - r;
//		int circ2x = center2.x - r;
//		int circ2y = center2.y - r;
//		drawCircle(circ1x, circ1y,g);
//	}
//	public void drawCircle(int x, int y, Graphics g) {
//		g.drawOval(x - d/2, y - d/2, d, d);
//	}
//	public void paint(Graphics g) {
//		g.setColor(Color.BLACK);
//		drawClock(15, 20, 20, 200, g);
//		//drawClock(time, d/2, x2, y2, g);
//		sleep();
//		eraseClock(time, d/2, x2, y2, g);
//		nextSecond(g);
//		x1 = (int) (x2 - 100 * Math.sin(t));
//		y1 = (int) (y2 + 100 * Math.cos(t));
//		g.drawLine(x1, y1, x2, y2);
//		repaint();
//		drawClock(400, 400, 100, 100, g);
//		
//	}
//	public void force(double charge, Point pt1, Point pt2,Graphics g){
//		double distance = pt1.distance(pt2);
//		int mag = (int) ((int) charge/(distance * distance));
//		Point p1 = new Point(pt1.x - pt2.x + mag, pt1.y - pt2.y + mag);
//		g.drawLine(p1.x, p1.y + 100, p1.x, p1.y + 90);
//		}
//	public void drawClock(int time, int radius, int centX, int centY, Graphics g){
//		int x1 = (int) (x2 + 100 * Math.sin(getAngle()));
//		int y1 = (int) (y2 - 100 * Math.cos(getAngle()));
//		g.drawLine(x1, y1, x2, y2);
//		drawCircle(g);
//		nextSecond(g);
//	}
//	public void eraseClock(int time, int radius, int centX, int centY, Graphics g){
//		g.setColor(Color.WHITE);
//		int x1 = (int) (x2 + 100 * Math.sin(getAngle()));
//		int y1 = (int) (y2 - 100 * Math.cos(getAngle()));
//		g.drawLine(x1, y1, x2, y2);
//		drawCircle(g);
//	}
//	public double getAngle() {
//		return ((time * 2 * Math.PI) / 60);
//	}
//	
//	
////	public void sleep(){
////		try {
////		    Thread.sleep(1000);                 //1000 milliseconds is one second.
////		} catch(InterruptedException ex) {
////		    Thread.currentThread().interrupt();
////		}
////	}
//	public void nextSecond(Graphics g) {
//		t += 2 * Math.PI / 60;
//		if (t >= 2 * Math.PI) t -= 2 * Math.PI;
//	}
//}