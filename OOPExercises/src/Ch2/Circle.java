/*
 * This is my code for the Circle subclass of the superclass Shape.
 * The Circle class contains an instance variable radius (double) and three 
 * constructors as shown. The default radius is 1.0. I also have a getter and a setter 
 * for the instance variable radius. This program includes two methods, getArea() and getPerimeter(). 
 * I overrode the toString() method inherited from the Shape superclass.
 */

package Ch2;

public class Circle extends Shape{           // save as "Circle.java"
	   // private instance variable, not accessible from outside this class
	   private double radius;
	   
	   // 1st constructor, which sets both radius and color to default
	   public Circle() {
	      radius = 1.0;
	   }
	   //The constructor I created sets the radius
	   public Circle(double radius) {
		   this.radius = radius;
		   }

	   // 3rd constructor with given radius, color, and filled
	   public Circle(double radius, String color, boolean filled) {
		  this.radius = radius;
	      this.color = color;
	      this.filled = filled;
	   }

	   // Setter for instance variable radius
	   public void setRadius(double radius) {
		   this.radius = radius;
	   }

	   // A public method for retrieving the radius
	   public double getRadius() {
	     return radius; 
	   }
	  
	   // A public method for computing the area of circle
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   // A public method for computing the circumference of circle
	   public double getPerimeter() {
	      return radius*2*Math.PI;
	   }
	   @Override
	   public String toString(){
		  return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
	   }

	}