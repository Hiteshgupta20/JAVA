/*PROGRAM TO CONVERT MINUTES INTO YEAR
 * 1.FIND minutesInYear=60*24*365  NOTE HERE 60 = MINUTES, 24=HOURS, 365=DAYS
 * 2.READ INPUT FROM USER AND STORE IT AS DOUBLE
 * 3.COVERT MINUTES INTO YEARS USING FORMULA (MIN/minutesInYear)
 * 4.PRINT THE RESULT 
 */
package dataTypes;
import java.util.*;
public class minutes_into_years {

	public static void main(String[] args) {
		double minutesInYear = 60*24*365;   
		Scanner in= new Scanner(System.in);
		System.out.println("enter the minutes");  //input from user
		double min= in.nextDouble();
		long years = (long)(min/minutesInYear);   
		System.out.println((int)min +" minutes is approximately " +years +" years");
}
}
