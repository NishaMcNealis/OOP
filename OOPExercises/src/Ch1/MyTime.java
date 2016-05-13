/* This is my code for 1.9, the MyTime class.
 * I created a class called
 * MyTime. The class starts by initializing three instance variables:
 * hour, minute and second. It also has a constructor.
 * The constructor invokes the setTime() method to set the instance variables.
 * setTime(int hour, int minute, int second) checks if the given hour, minute and second 
 * are valid, then sets the instance variables.
 * This class has 3 setters. The setters are setHour(int hour),
 * setMinute(int minute), setSecond(int second). It makes sure that the parameters 
 * are valid, then sets the respective instance variable to the given value.
 * There are three getters: getHour(), getMinute(), getSecond().
 * The toString() method of this class returns the time in the format"HH:MM:SS".
 * The methods nextSecond(),nextMinute(), nextHour() update this instance to the next 
 * second, minute or hour and return this instance of MyTime. 
 * nextMinute() and nextSecond() may use two other methods called getNextMinute() and getNextHour().
 * previousSecond(), previousMinute(), previousHour() are similar to nextSecond(),nextMinute(), 
 * and nextHour(), but they update this instance to the previous 
 * second, minute or hour before returning this instance of MyTime.
 */

package Ch1;

	public class MyTime {
	  public int hour;
	  public int minute;
	  public int second;
	  
	  public MyTime(int hour, int minute, int second) {
		  setTime(hour, minute, second);
	  }
	  public void setTime(int hour, int minute, int second){
	   if (this.hour >= 0 && this.hour <= 23) {
	   		this.hour = hour;
	   }
	   if (this.minute >= 0 && this.minute <= 59) {
	   		this.minute = minute;
	   }
	   if (this.second >= 0 && this.second <= 59) {
	   		this.second = second;
	   }
	   }
	  public void setHour(int hour) {
	    if (this.hour >= 0 && this.hour <= 23) {
	   		this.hour = hour;
	   }
	  }
	  public void setMinute(int minute) {
	    if (this.minute >= 0 && this.minute <= 59) {
	   		this.minute = minute;
	   }
	  }
	  public void setSecond(int second) {   
	    if (this.second >= 0 && this.second <= 59) {
	   		this.second = second;
	   }
	  }
	  public int getHour() {
	   	return this.hour;
	  }
	  public int getMinute() {
	   	return this.minute; 
	  }
	  public int getSecond() {
	   	return this.second;
	  }
	  public String toString(){
	    String str = "";
	    if (hour < 10){
	      str += ("0" + hour);
	    }
	    else{
	      str += hour;
	    }
	    if (minute < 10){
	      str += (": 0" + minute);
	    }
	    else{
	      str += ": " + minute;
	    }
	    if (second < 10){
	      str += (": 0" + second);
	    }
	    else{
	      str += ": "+second;
	    }
	    return str;
	  }
	  public MyTime nextSecond(){
	    if (this.second == 59) {
	      this.second = 0;
	      this.minute = getNextMinute();
	  }
	    else {
	      this.second ++; 
	    }
	    return this;
	}
	  public int getNextMinute(){
	    if (this.minute == 59) {
	      this.minute = 0;
	      this.hour = getNextHour();
	  }
	    else {
	      this.minute ++; 
	    }
	    return this.minute;
	}
	  public int getNextHour(){
	    if (this.hour == 23) {
	      this.hour = 0;
	  }
	    else {
	      this.hour ++; 
	    }
	    return this.hour;
	}
	  public MyTime nextMinute(){
	    if (this.minute == 59) {
	      this.minute = 0;
	      this.hour = getNextHour();
	  }
	    else {
	      this.minute ++; 
	    }
	    return this;
	}
	  public MyTime nextHour(){
	    if (this.hour == 23) {
	      this.hour = 0;
	  }
	    else {
	      this.hour ++; 
	    }
	    return this;
	}
	  public MyTime previousSecond(){
	    if (this.second == 0) {
	      this.second = 59;
	      this.minute = getLastMinute();
	  }
	    else {
	      this.second --; 
	    }
	    return this;
	}
	  public MyTime previousMinute(){
	    if (this.minute == 0) {
	      this.minute = 59;
	      this.hour = getLastHour();
	  }
	    else {
	      this.minute --; 
	    }
	    return this;
	}
	  public MyTime previousHour(){
	    if (this.hour == 0) {
	      this.hour = 23;
	  }
	    else {
	      this.hour --; 
	    }
	    return this;
	}
	  public int getLastMinute(){
	    if (this.minute == 0) {
	      this.minute = 59;
	      this.hour = getLastHour();
	  }
	    else {
	      this.minute --; 
	    }
	    return this.minute;
	}
	  public int getLastHour(){
	    if (this.hour == 0) {
	      this.hour = 23;
	  }
	    else {
	      this.hour --; 
	    }
	    return this.hour;
	}
	}
	