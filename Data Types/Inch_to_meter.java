/*PROGRAM TO CONVERT INCHES TO METER
 * 1.READ INPUT FROM USER IN INCHES AND STORE IT IN DOUBLE
 * 2.CONVERT INCHES INTO METER USING METER = INCHES*0.02514
 * NOTE ONE INCH IS 0.0254 METER 
 * 3.PRINT RESULT IN METERS
 */
package dataTypes;
import java.util.*;
public class Inch_to_meter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input the value for inch");
		double inch=in.nextDouble();   //input from user
		double meters=inch*0.0254;     //converting inch into meter
		System.out.println(inch +" inch is : " +meters +" meters");
	}
}
