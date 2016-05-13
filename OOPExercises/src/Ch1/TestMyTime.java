package Ch1;

public class TestMyTime {
	   public static void main(String[] args) {
	      MyTime t1 = new MyTime(15, 32, 54);
	      t1.setTime(15, 33, 34);
	      t1.setSecond(22);
	      MyTime t2 = new MyTime(28, 04, 55);
	      t2.setTime(28, 34, 55);
	      System.out.println(t1.nextMinute());
	      System.out.println(t1.nextSecond());
	      System.out.println(t1.nextHour());
	      System.out.println(t1.previousHour());
	      System.out.println(t1.previousSecond());
	      System.out.println(t1.previousMinute());
	      System.out.println(t1);
	      MyTime t3 = new MyTime(23, 59, 59);
	      System.out.println(t3.nextSecond());
	      t2.setTime(0, 0, 0);
	      System.out.println(t3.previousSecond());
	   }
	}


