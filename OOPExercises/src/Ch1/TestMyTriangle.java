package Ch1;

	/* This is my test program for
	 * MyTriangle.java. First, I tested the
	 * Constructors. I did this by 
	 * constructing 2 triangles called t1 and t2.
	 * I then tested the toString method.
	 * Since this code did not produce an error, 
	 * I moved on to the getPerimeter() method.
	 * The perimeter was correct, so I moved on to the 
	 * printType() method. Since this code produced the 
	 * correct answers with no errors,
	 * it is clear that my code must work.
	*/
public class TestMyTriangle {
		public static void main(String[] args){
			// Testing the constructors
			MyTriangle t1 = new MyTriangle(3, 0, 10, 23, 45, 27);
			MyPoint p1 = new MyPoint(2, 22);
			MyPoint p2 = new MyPoint(4, 67);
			MyPoint p3 = new MyPoint(6, 22);
			MyTriangle t2 = new MyTriangle(p1, p2, p3);
			// Testing the toString() method
			System.out.println(t1);
			// Testing the getPerimeter method
			System.out.println(t1.getPerimeter());
			System.out.println(t2.getPerimeter());
			// Testing the printType method
			System.out.println(t1.printType());
			System.out.println(t2.printType());
	}
	}

