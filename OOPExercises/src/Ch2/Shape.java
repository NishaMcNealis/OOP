/*
 * Here is the superclass Shape I coded for 2.2.
 * As you can see, it initializes two instance variables that
 * are common to all of its subclasses. This program has two constructors
 * and two getters. It has two setters and one toString method.
 * This program is very important because it allows us to give three shapes
 * (Rectangle, Circle and Square) the same basic properties without
 * writing the same code over and over. 
 */


package Ch2;

public class Shape {
//Variables
public String color;
public boolean filled;
//Constructors
public Shape(){
	color = "green";
	filled = true;
}
public Shape(String color, boolean filled){
	this.color = color;
	this.filled = filled;
}
//Getters
public String getColor(){
	return color;
}
public boolean isFilled(){
	return filled;
}
//Setters
public void setColor(String color){
	this.color = color;
}
public void setFilled(boolean filled){
	this.filled = filled;
}
//ToString Method
public String toString(){
	String fStr = "not filled.";
	if (filled) fStr = "filled.";
	return "A Shape with color of " + color + " and " + fStr;
}
}
