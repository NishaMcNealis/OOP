package Ch1;

public class TestMyPolynomial {
	public static void main(String args[]){
	// Test program
	// Can invoke with a variable number of arguments
	MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
	MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
	System.out.println(p1);
    System.out.println(p2.evaluate(1));
    System.out.println(p2.add(p1));
//    System.out.println(p1.multiply(p2));

	}
}

