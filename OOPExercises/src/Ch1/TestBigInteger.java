package Ch1;

	/*1.8
	/ Here is my code for exercise 1.8.
	/ This program is very straightforward. I experimented with the BigInteger class from Java.math
	/ The java.math.BigInteger class provides operations that work like all of Java's primitive integer 
	/ operators but can be used on larger numbers. 
	/ The two operations that I have tested here are add and multiply.
	/ This class is very useful because there are many cases
	/ when a 8-, 16-, 32-, or 64-bit signed integer is simply not enough 
	/ for a specific program.
	/ Since my code produced no errors and returned the correct results, it is safe to assume that it works.
	*/

	import java.math.BigInteger;
	public class TestBigInteger {
	   public static void main(String[] args) {
	      BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
	      BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
	      System.out.println(i1.add(i2));
	      System.out.println(i1.multiply(i2));
	   }
	}


