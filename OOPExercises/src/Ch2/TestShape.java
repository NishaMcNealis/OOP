/*
 * This is my test program for 2.2.
 * I start by creating two shapes to test all the methods in the Shape superclass.
 * Then, I create a circle instance, a rectangle instance and a square instance.
 * Since I tested all the methods that I created and they all worked,
 * I believe that my code works.
 */

package Ch2;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		s1.setColor("blue");
		System.out.println(s1);
		
		Shape s2 = new Shape("purple", false);
		s2.setColor("yellow");
		System.out.println(s2);
		
		Circle c = new Circle(10, "grey", false);
		System.out.println(c);
		System.out.println(c.getPerimeter());
		
		Rectangle r = new Rectangle(10, 20, "pink", false);
		System.out.println(r);
		System.out.println(r.getArea());
		
		Square s = new Square(15, "red", true);
		System.out.println(s);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
}
}
