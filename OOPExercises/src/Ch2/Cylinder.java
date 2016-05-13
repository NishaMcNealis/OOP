/*________________________________2.1_________________________________
 * This is my code for 2.1, the Cylinder class. This class is a subclass
 * of the superclass Circle. This means that it inherits methods and variables
 * from circle. In all three constructors, the super() method is present.
 * In the last constructor, it takes one argument. The super() method
 * allows a subclass to invoke a method or constructor from its superclass.
 * In this program, I override two methods from Circle. First, I override the
 * getArea() method from Circle. I created a new getArea() method that
 * returns the surface area. I could still use the getArea() method from Circle
 * by invoking super.getArea(), which I did in the getVolume() method. Then, I 
 * overrode another method from Circle called toString(). I used the code
 * provided in the online textbook to do this. I tested all of the methods
 * in this class in the attached TestCylinder class.
 * ___________________________________________________________________
 */
package Ch2;

import Ch1.Circle;

public class Cylinder extends Circle {  //save as "Cylinder.java"
	   private double height;  // private variable
	   
	   // Constructor with default color, radius and height
	   public Cylinder() {
	      super();        // call superclass no-arg constructor Circle()
	      height = 1.0; 
	   }
	   // Constructor with default radius, color but given height
	   public Cylinder(double height) {
	      super();        // call superclass no-arg constructor Circle()
	      this.height = height;
	   }
	   // Constructor with default color, but given radius, height
	   public Cylinder(double radius, double height) {
	      super(radius);  // call superclass constructor Circle(r)
	      this.height = height;
	   }
	   
	   // A public method for retrieving the height
	   public double getHeight() {
	      return height; 
	   }
	  
	   // A public method for computing the volume of cylinder
	   //  use superclass method getArea() to get the base area
	   public double getVolume() {
	      return super.getArea()*height; 
	   }
	   //I added an override
	   @Override
	   public double getArea() {      // in Cylinder class
	      return (Math.PI * 2 * getRadius() * height) + (2 * super.getArea());
	}
	   @Override
	   public String toString() {      // in Cylinder class
	      return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
	             + " height=" + height;
	   }
}
