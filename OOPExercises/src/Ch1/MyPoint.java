package Ch1;

/* This is Exercise 1_3.
 * I created a class called
 * MyPoint. The class had 2 constuctors,
 * 3 setters, 2 getters, and 2 special methods.
 * One of these methods is called distance
 * and takes 2 arguments (int x and int y).
 * It returns the distance from this point to another point.
 * The other point is located
 * at the given (x, y) coordinates.
 * The other method is an overloaded distance
 * method. It takes just one argument (MyPoint another).
 * It returns the distance from the point 
 * to another given MyPoint instance.
 * Lastly, this program has a toString method
 * that returns "(x, y)".
 */
public class MyPoint {
	private int x;
	private int y;
	//constructors
	public MyPoint(){
		this.x = 0;
		this.y = 0;	
	}
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;	
	}
	//setters
	public void setX(int x) {
		this.x = x;
	   }
	public void setY(int y) {
		this.y = y;
	   }
	//getters
	public int getX() {
		return x;
	   }
	public int getY() {
		return y;
	   }
	//sets X and Y
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//distance methods
	public double distance(int x, int y){
		int diffY = this.y - y;
		int diffX = this.x - x;
		return diffY / diffX;
	}
	public double distance(MyPoint another) {
		   int xDiff = this.x - another.x;
		   int yDiff = this.y - another.y;
		   return  Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		}
	//toString method
	public String toString(){
		return "(" + x +", " + y + ")";
	}
	
}
