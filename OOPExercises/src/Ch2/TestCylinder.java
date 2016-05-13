/*
 * Below is my code for the TestCylinder, which tests each method
 * of the Cylinder class. It creates three different instances of
 * the class Cylinder. For each instance, it tests the getRadius, getHeight,
 * getArea, and getVolume methods of the Cylinder and Circle classes. 
 * Then it tests the toString() method of the Cylinder class.
 * Since my code prints the correct answers in the right format,
 * we can conclude that it works.
 */

package Ch2;

public class TestCylinder {  // save as "TestCylinder.java"
	   public static void main (String[] args) {
	      // Declare and allocate a new instance of cylinder
	      //   with default color, radius, and height
	      Cylinder c1 = new Cylinder();
	      System.out.println("Cylinder:"
	            + " radius=" + c1.getRadius()
	            + " height=" + c1.getHeight()
	            + " surface area=" + c1.getArea()
	            + " volume=" + c1.getVolume());
	      System.out.println(c1);
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying height, with default color and radius
	      Cylinder c2 = new Cylinder(10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c2.getRadius()
	            + " height=" + c2.getHeight()
	            + " surface area=" + c2.getArea()
	            + " volume=" + c2.getVolume());
	      System.out.println(c2);
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying radius and height, with default color
	      Cylinder c3 = new Cylinder(2.0, 30.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c3.getRadius()
	            + " height=" + c3.getHeight()
	            + " surface area=" + c3.getArea()
	            + " volume=" + c3.getVolume());
	      System.out.println(c3);
	   }
	}
