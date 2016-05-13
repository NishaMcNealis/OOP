package Ch1;

/* This is a class called MyDate, which models a date instance.
This class contains three private instance variables: year (int),month (int) and day (int)
It also contains private static variables: strMonths (String[]), strDays (String[]), and 
dayInMonths (int[]). The MyDate class also has several public static methods:
isLeapYear takes one argument, int year. It returns true if the given year is a leap year. 
isValidDate takes 3 arguments, int year, int month, and int day. 
It returns true if the given year, month, and day are valid. The year must be between 1 and 9999, 
the month must be between 1 and 12, and the day must be between 1 and the last day of the current month.
Next, getDayOfWeek takes 3 arguments: int year, int month, and int day. It returns the day of the week as
an integer. 0 is Sunday, 1 is Monday, etc. This was probably the hardest part of the program to write,
but it really helped that we worked on it in class because Mr. Kuszmaul was available to answer all the questions I had.
The MyDate class has one constructor, which takes 3 parameters: int year, int month and int day. 
It invokes the setDate() method to set the instance variables, which I will describe later.
The MyDate class has many public methods. setDate invokes the static method isValidDate().
It verifies that the given year, month and day are valid. There are three more setters.
setYear verifies that the given year is between 1 and 9999. setMonth verifies that the given month is between 1 and 12.
setDay(int day) verifies that the given day is between 1 and the month's last day. 
getYear(), getMonth(), and getDay() return the value for the year, month and day, respectively.
The toString method for this class returns a date string in the format "xxxday d mmm yyyy".
nextDay() updates this instance to the next day and returns this instance. nextMonth() updates this instance
to the next month and returns this instance. nextYear() updates this instance to the next year 
and returns this instance. previousDay(), previousMonth(), previousYear() update this instance to the next day, month or year 
and returns this instance. This submission also includes a test program that tests nextDay() in a loop.
It prints the dates from 28 Dec 2011 to 2 Mar 2012.

 */

public class MyDate {
	//defining variables
	private int year;
	private int month;
	private int day;
	//defining static variables
	private static String[] strMonths =  {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	private static int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//methods
	public static boolean isLeapYear(int year){
		if (year % 400 == 0) return true;
		if (year % 100 == 0) return false;
		if (year % 4 == 0) return true;
		return false;
	}
	public static boolean isValidDate(int year, int month, int day){
		if (year < 1 || year > 9999) return false;
		if (month < 1 || month > 12) return false;
		if (month == 2){
			if (isLeapYear(year)){
				if (day < 0 || day > 29) return false;
			}
			else{
				if (day < 0 || day > 28) return false;
			}
		}
		else{
			if (day < 0 || day > daysInMonths[month]) return false;
		}
		return true;
	}
	public static String dayOfWeek(int year, int month, int day){
		int num = (year/ 100) - 17;
		int[] yearNumArray = {4, 2, 0, 6, 4, 2, 0, 6};
		int[] monthNoLeap = {0, 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int[] monthLeap = {0, 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int monthNum = 0;
		if (isLeapYear(year)) monthNum = monthLeap[month];
		else monthNum = monthNoLeap[month];
		int currNum = yearNumArray[num];
		int last2 = year % 100;
		int step3 = last2 + currNum;
		int step4 = step3 + (last2 / 4);
		int s5 = step4 + monthNum;
		int s6 = (s5 + day) % 7;
		return strDays[s6];
	}
	//Constructor
	public MyDate(int year, int month, int day){
		setDate(year, month, day);
	}
	//public methods
	public void setDate(int year, int month, int day){
		if (isValidDate(year, month, day)){
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}
	//Setters
	public void setYear(int year){
		if (year >= 1 && year <= 9999) this.year = year;
	}
	public void setMonth(int month){
		if (month >= 1 && month <= 12)this.month = month;
	}
	public void setDay(int day){
		if (month == 2){
			if (isLeapYear(year)){
				if (day > 0 || day <= 29) this.day = day;;
			}
			else{
				if (day > 0 || day <= 28) this.day = day;
			}
		}
		else{
			if (day > 0 || day <= daysInMonths[month]) this.day = day;
		}
	}
	//Getters
	public int getYear(){
		return this.year;
	}
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	//toString
	public String toString(){
		return dayOfWeek(this.year, this.month, this.day) + " " + this.day + " " + strMonths[this.month] + " " + this.year;
	}
	//next day, month and year methods
	public MyDate nextDay(){
		int temp = 0;
		if (month == 2){
			if (isLeapYear(this.year)){
				temp = 29;
			}
			else{
				temp = 28;
			}
		}
		else{
			temp = daysInMonths[this.month];
		}
		if (this.day == temp) {
			this.day = 1;
			this.month = getNextMonth();
		}
		else {
			this.day ++; 
		}
		return this;
	}
	public int getNextDay(){
		int temp = 0;
		if (month == 2){
			if (isLeapYear(this.year)){
				temp = 29;
			}
			else{
				temp = 28;
			}
		}
		else{
			temp = daysInMonths[this.month];
		}
		if (this.day == temp) {
			this.day = 1;
			this.month = getNextMonth();
		}
		else {
			this.day ++; 
		}
		return this.day;
	}
	public int getNextMonth(){
		if (this.month == 12) {
			this.month = 1;
			this.year = getNextYear();
		}
		else {
			this.month ++; 
		}
		return this.month;
	}
	public int getNextYear(){
		return this.year ++;
	}

	public MyDate nextMonth(){
		if (this.month == 12) {
			this.month = 1;
			this.year = getNextYear();
		}
		else {
			this.month ++; 
		}
		return this;
	}
	public MyDate nextYear(){
		this.year ++;
		return this;
	}
	//previous day, month and year methods
	//Day
	public MyDate previousDay(){
		if (this.day == 1) { //the first day of the month is a special case because the month has to change
			if (this.month == 1) {
				this.year --; 
				this.month = 12;
				this.setDay(30);
				return this;
			}
			this.day = daysInMonths[lastMonth()]; //this day should become the last day of the previous month
			this.month --;
		}
		else { //for any day other than the first day of the month
			this.day --; //subtract one
		}
		return this; //return this instance
	}
	public int lastDay(){
		int dy = this.day;
		if (this.day == 1) {
			dy = daysInMonths[lastMonth() - 2];
		}
		else {
			dy --; 
		}
		return dy;
	}
	//Month
    public MyDate previousMonth(){
        if (this.month == 1) {
          this.month = 12;
          this.year = lastYear();
      }
        else {
          this.month --; 
        }
        return this;
    }

	public int lastMonth(){
		MyDate retval = new MyDate(this.year, this.month, this.day);
		if (this.month == 1) { //Jan is a special case
			retval.month = 12; //Month should become December
		}
		else { //For all other months
			retval.month --; //subtract one month
		}
		return retval.month; //return the month
	}
	//Year
	public MyDate previousYear(){
		if (isLeapYear(this.year)){
			this.day = lastDay();
		}
		this.year --; 
		return this;
	}
	public int lastYear(){
		int yr = this.year;
		yr --; 
		return yr;
	}
	//main method
	public static void main(String[] args) {

		MyDate d1 = new MyDate(2012, 2, 28);
		System.out.println(d1);             // Tuesday 28 Feb 2012
		System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
		System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
		System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
		System.out.println(d1.nextYear());  // Monday 1 Apr 2013
		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);                 // Monday 2 Jan 2012
		System.out.println(d2.previousDay()); // Sunday 1 Jan 2012

		System.out.println(d2.previousDay());   // Saturday 31 Dec 2011

		System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
		System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());  // Monday 28 Feb 2011

		// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
		// MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
	}
}
