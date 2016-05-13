package Ch1;

/*This is exercise 1.1 as assigned due January 8th, 2016.
 * The assignment first asks us to compile the given code.
 * The code did not run the very first time that we ran it.
 * The assignment asks "Can you run the Circle class? Why?"
 * It then answers its own question, explaining that the class 
 * does not have a main() method, which means that it can not be
 * run directly. 
 * 
 * We solved this problem by using a test program
 * called TestCircle, which I have also uploaded.
 * After running the TestCircle program, this one was able to work.
 * This taught us that there are building blocks in Java
 * that are meant to be used as parts of larger programs instead
 * of being compiled separately.
 * 
 * Finally, we were asked to add several elements to our programs.
 * I have identified each element I added in the comments.
 * 
 * One of the things we were asked was 
 * "In TestCircle, can you access the instance variable
 * radius directly (e.g., System.out.println(c1.radius));
 * or assign a new value to radius (e.g., c1.radius=5.0)?
 * Try it out and explain the error messages."
 * -From the assignment
 * 
 * When I ran the new code after accessing the instance variable,
 * it gave me the following error:
 * "The field Circle.radius is not visible"
 * This is because radius is a private instance variable
 * which means that it can only be accessed inside
 * the class.
 * 
 * When I tried to assign a new value to radius,
 * I received this error:
 * "The field Circle.radius is not visible"
 * Again, this is because radius is a private variable.
 * 
 */
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   //The constructor I created sets the radius and the color
   public Circle(double radius, String color) {
	   this.radius = radius;
	   this.color = color;
	   }

   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
	  this.radius = radius;
      color = "red";
   }

   // Setter for instance variable radius
   public void setRadius(double radius) {
	   this.radius = radius;
   }
 
   // Setter for instance variable color
   public void setColor(String color) { 
	  this.color = color; }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   // Getter for instance variable color
   public String getColor() {
	   return color;
   }
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   public String toString(){
	  return "Circle: radius- " + radius + " color- " + color;
   }

}
