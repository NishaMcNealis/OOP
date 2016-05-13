package Ch1;

public class TestMyDate {
	public static void main(String[] args){
	      //MyDate d1 = new MyDate(2012, 2, 28);
	      MyDate start = new MyDate(2011, 12, 28);
	      for (int i = 0; i < 10;i ++){
	    	System.out.println("Test2");  
	    	start.nextDay();
	        //start.setDay(start.getNextDay());
	        System.out.println(start);  
	      }
    }
}
