package InProgress;

/* This is the Point class adapted from Exercise 1.3.
 * The important part of this code is the distance method. This
 * method takes a point as an argument and follows the distance formula
 * to return the distance between the points.
 */
public class Point {
	public int x;
	public int y;
	//constructors
	public Point(){
		this.x = 0;
		this.y = 0;	
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;	
	}
	//distance method
	public double distance(Point another) {
		   int xDiff = this.x - another.x;
		   int yDiff = this.y - another.y;
		   return  Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		}
	//toString method
		public String toString(){
			return "(" + x +", " + y + ")";
		}
		
	
}
