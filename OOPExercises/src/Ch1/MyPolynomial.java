package Ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class MyPolynomial {
	private double[] coeffs;
    private double c;
    private double sq;
	//Constructor #1
	   public MyPolynomial(double... coeffs) {  // varargs
	      this.coeffs = coeffs;                 // varargs is treated as array
	   }
	 //Constructor #2
	   public MyPolynomial(String filename) {
		   Scanner in = null;
		   try {
		      in = new Scanner(new File(filename));  // open file
		   } catch (FileNotFoundException e) {
		      e.printStackTrace();
		   }
		   int degree = in.nextInt();      // read the degree
		   coeffs = new double[degree+1];  // allocate the array
		   for (int i=0; i<coeffs.length; ++i) {
		      coeffs[i] = in.nextDouble();
		   }
		}
	   public int getDegree(){
		   return coeffs.length - 1;
	   }
	   public String toString(){
		   String temp = "";
		   for (int i=0; i<coeffs.length; ++i) {
			      temp += coeffs[i] + "x^" + (coeffs.length - 1 - i) + " + ";
		   		}
         try{
        	 return temp.substring(0, temp.length() -2);}
         finally{
        	 return temp.substring(0, temp.length());}
         }
	   public double evaluate(double x){
		   for (int i=0; i<coeffs.length; ++i) {
		      c = coeffs[i];
              sq = 1;
              for (int y=0; y<coeffs.length; ++y){
              	sq = sq * x;
             }
		   }
           return sq * c;
	   }
	   public String add(MyPolynomial another) {
		   String n = "";
		   int retsize = this.coeffs.length;
		   int smallsize = another.coeffs.length;
		   if (retsize < another.coeffs.length) {
		    retsize = another.coeffs.length;
		    smallsize = this.coeffs.length;
		   }
		   for (int i = 0; i < retsize; i ++) {

		    if (i < smallsize) {
		     double nums= this.coeffs[i] + another.coeffs[i];
		     n+= "+ " + nums +"x" + "^" + i + " ";
		    }
		    else if (this.coeffs.length == retsize) {
		     double nums = this.coeffs[i];
		     n+= "+ " + nums +"x" + "^" + i + " ";
		    }
		    else if (another.coeffs.length == retsize) {
		     double nums = another.coeffs[i];
		     n+= "+ " + nums +"x^" + i + " ";
		    }
		   }
		   return n;
	   }
}
//      public String multipoly(MyPolynomial another) {
//          String n = "";
//    	  int greater = 0;
//  		  int smaller = 0;
//    	  if (this.coeffs.length > another.coeffs.length){
//    			greater = this.coeffs.length;
//    			smaller = another.coeffs.length;
//    		  }
//    	 else {
//    			smaller = this.coeffs.length;
//    			greater = another.coeffs.length;
//    			}
//          for (int i = 0; i <= greater; i++){
//              for (int j = 0; j <= smaller; j++){
//                  double num = i * j;
//                  n +=  " + " + num + "x^" + (coeffs.length - 1 - i);
//                  String fin = "";
//                  for (int k = 0; k < coeffs.length - 1; k++){
////                	  if (n.substring(i, i + 2) 
//                  }
//                  }
//              }
//          }
//}
//          return n;
//       private Polynomial mMult(double c, int exp){
//    	   MyPolynomial retval = new MyPolynomial();
//    	   double[] retCoeffs;
//    	   int retSize = rxp + this.coeffs.length;
//    	   retCoeffs = new double[retsize];
//    	   for (int i = 0; i < exp; i ++){
//    		   retCoeffs[i] = 0.0;
//    	   }
//    	   for (int i = exp; i < retSize; i++){
//    		   retCoeffs[i] = c * this.coeffs[i - exp];
//    	   }
//    	   retval.coeffs = retCoeffs;
//    	   return retval;
//          
//       }  
//        public MyPolynomial multiply(MyPolynomial other) {
//    	   Polynomial retval = new Polynomial ();
//    	   retval coeffs = new double[0];
//    	   double c;
//    	   int exp;
//    	   for (int i = 0, i , other.coeffs.length; i ++){
//    		   exp = i;
//    		   c = other coeffs[i];
//    		   MyPolynomial next = this.mMult(c, exp);
//    		   retval = retval.add(next);
//    	   }
//    	   return retval;
//              String n = "";
//        	  int greater = 0;
//      		  int smaller = 0;
//        	  if (this.coeffs.length > another.coeffs.length){
//        			greater = this.coeffs.length;
//        			smaller = another.coeffs.length;
//        		  }
//        	 else {
//        			smaller = this.coeffs.length;
//        			greater = another.coeffs.length;
//        			}
//              for (int i = 0; i <= greater; i++){
//                  for (int j = 0; j <= smaller; j++){
//                      double num = i * j;
//                      n +=  " + " + num + "x^" + (coeffs.length - 1 - i);
//                      String fin = "";
//                      for (int k = 0; k < coeffs.length - 1; k++){
//                    	  if (n.substring(i, i + 2) 
//                      }
//                      }
//                  }
//              }
//              return n;
//        	  
//          }
//      }
//	  
//      }
//
//
////alist.set(i+j, ((a.coeffs[i]) * another.coeffs[j])+alist.get(i+j));


