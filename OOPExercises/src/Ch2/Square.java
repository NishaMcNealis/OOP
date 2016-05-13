/*
 * This is the Square class, a subclass of Rectangle. 
 * The Square class contains no instance variables, but inherits the instance variables width 
 * and length from Rectangle.I override the toString() method
 *  to return "A Square with side=xxx, which is a subclass of yyy",
 *  where yyy is the output of the toString() method from the Rectangle class.
 *  I did not need to override getArea() or getPerimeter(), because the Rectangle
 *  methods also work for Square. I also override the setLength() and setWidth() 
 *  methods to change both the width and length when only one is changes, so 
 *  that the square does not become a rectangle.
 */
package Ch2;

public class Square extends Rectangle {
	public Square(double side) {
		   super(side, side);  // Call superclass Rectangle(double, double)
		}
	public Square(double side, String color, boolean filled) {
		   super(side, side, color, filled);  // Call superclass Rectangle(double, double)
		}
	//Getter
	public double getSide(){
		return width;
	}
	//Setters
	public void setSide(double side){
		this.setWidth(side);
		this.setLength(side);
	}
	@Override
	public void setWidth(double side){
		this.setWidth(side);
		this.setLength(side);
		
	}
	@Override
	public void setLength(double side){
		this.setWidth(side);
		this.setLength(side);
	}
	@Override
	public String toString(){
		return "A Square with side = " + width + ", which is a subclass of " + super.toString();
	}

		
}
