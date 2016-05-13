/*
 * The Rectangle class contains two instance variables- width (double) and length (double).
 * It has three constructors. The default constructor initializes the width and length to 1.0.
 * There is one getter and one setter for each instance variable. There are two methods, getArea()
 * and getPerimeter(). I used the special Override syntax on the toString() method to
 *  return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy", 
 *  where yyy is the output of the toString() method from the superclass.
 */

package Ch2;

public class Rectangle extends Shape{           // save as "Rectangle.java"
	   // private instance variable, not accessible from outside this class
	   public double width;
	   public double length;
	   
	   // 1st constructor, which sets both width and color to default
	   public Rectangle() {
	      width = 1.0;
	      length = 1.0;
	   }
	   //The constructor I created sets the width
	   public Rectangle(double width, double length) {
		   this.width = width;
		   this.length = length;
		   }

	   // 3rd constructor with given width, color, and filled
	   public Rectangle(double width, double length, String color, boolean filled) {
		  this.width = width;
		  this.length = length;
	      this.color = color;
	      this.filled = filled;
	   }

	   // Setter for instance variables width and length
	   public void setWidth(double width) {
		   this.width = width;
	   }
	   public void setLength(double length) {
		   this.length = length;
	   }

	   // Getters - public methods for retrieving the width and length
	   public double getWidth() {
	     return width; 
	   }
	   public double getLength() {
		     return length; 
		   }
	  
	   // A public method for computing the area of Rectangle
	   public double getArea() {
	      return width * length;
	   }
	   // A public method for computing the circumference of Rectangle
	   public double getPerimeter() {
	      return width + width + length + length;
	   }
	   @Override
	   public String toString(){
		  return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
		   }

		}

