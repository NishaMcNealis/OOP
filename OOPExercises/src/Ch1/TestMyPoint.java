package Ch1;

import java.util.Arrays;

/* This is my test program for
 * MyPoint.java. First, I tested the 
 * point creation methods (Getters).
 * Next, I tested the distance
 * methods. Since the code produced the 
 * correct answers with no errors,
 * we can conclude that my code works.
 */
public class TestMyPoint {
	public static void main(String[] args){
		// Testing the Setters
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);
		System.out.println(p2);
		// Testing the distance() methods
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(5, 6)); 
		MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint
		for (int i = 0; i < 10; i++) {
			points[i] = new MyPoint(i + 1, i + 1);    // Allocate each of MyPoint instances
	}
		System.out.println(Arrays.deepToString(points));
}
}
