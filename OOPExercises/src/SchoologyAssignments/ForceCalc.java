// FORCE CALCULATOR //
// By Nisha McNealis //
// OO Programming Period 5 //


package SchoologyAssignments;

//Here is my code for Force Calculator

public class ForceCalc {
	
	/*This is the important part of the project. 
	//Here, I take three arguments: charge (a double)
	//and two points. 
	//I have also included a Point class.
	//The distance method is explained in my summary
	//of the point class.
	*/
	//FORCE METHOD
	public static Point force(double charge, Point pt1, Point pt2){
		double distance = pt1.distance(pt2);
		int mag = (int) ((int) charge/(distance * distance));
		Point p1 = new Point(pt1.x - pt2.x + mag, pt1.y - pt2.y + mag);
		return p1;
		}

	
	/*This is the part where I test the force method. 
	 *It returns the correct answer, so it
	 *works.
	*/
	//TESTING
	public static void main(String[] args) {
		Point p1 = new Point(3,3);
		Point p2 = new Point (0,0);
		System.out.println(force(100, p1, p2));
	}
	}

