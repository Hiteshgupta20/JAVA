// Java program to print current date
package DateAndTime;
import java.time.MonthDay;
import java.util.Calendar;

public class DateAndTimeUsingCalenderClass {

	public static void main(String[] args) {
		//time using calender class
		Calendar c=Calendar.getInstance();
		
		//print date and time 
		System.out.println("WEEK IN MONTH : "+c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("WEEK IN YEAR : "+c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("DAY OF MONTH : "+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY OF WEEK IN MONTH : "+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("DAY OF WEEK : " +c.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY OF YEAR : " +c.get(Calendar.DAY_OF_YEAR));
		System.out.println("HOUR : "+c.get(Calendar.HOUR));
		System.out.println("MINUTE :"+c.get(Calendar.MINUTE));
		System.out.println("SECOND :"+c.get(Calendar.SECOND));
		System.out.println("AM OR PM :"+c.get(Calendar.AM_PM));
			
		

	}

}
