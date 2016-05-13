package Ch1;

	/* This is Exercise 1_5, called "The MyTriangle Class".
	 * I created a class called MyTriangle.
	 * This class modeled a triangle with three points.
	 * It used 3 instances of MyPoint class.
	 * The class had 2 constructors.
	 * One takes integer arguments and the other
	 * takes MyPoint arguments. The program has
	 * no setters or getters. However, it has 
	 * two unique methods.
	 * One of these methods is called getPerimeter()
	 * and takes no arguments.It returns the perimeter
	 * of the triangle. It uses the distance() method from
	 * the MyPoint class. This method finds the distance
	 * from one point to another point, so I used it to
	 * find the length of each side.
	 * The other method is called printType().
	 * It takes no arguments. This method
	 * prints "equilateral" if all the three sides are equal,
	 * "isosceles" if any two sides are equal, 
	 * or "scalene" if the three sides are different.
	 * Lastly, this program has a toString method
	 * that returns a string description of the instance
	 * in the format "Triangle at (x1, y1), (x2, y2), (x3, y3)".
	 */
public class MyTriangle {
		private MyPoint v1;
		private MyPoint v2;
		private MyPoint v3;
		//constructors
		public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
			this.v1 = new MyPoint(x1, y1);
			this.v2 = new MyPoint(x2, y2);
			this.v3 = new MyPoint(x3, y3);
		}
		public MyTriangle(MyPoint pt1, MyPoint pt2, MyPoint pt3){
			this.v1 = pt1;
			this.v2 = pt2;
			this.v3 = pt3;
		}
		//setter (not required, just for fun)
		public void setVertex(MyPoint v1) {
			this.v1 = v1;
		}
		public String printType() {
			if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)){
				return "Equilateral";}
			else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2)) {
			    return "Isosceles";
			}
			else {
			    return "Scalene";
			}
		   }
		public double getPerimeter() {
			return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
		}
		//toString method
		public String toString(){
			return "Triangle at " + v1 +", " + v2 + ", " + v3;
		}
	}

