/*PROGRAM TO FIND SPPED IN METER/SEC,KM/HOUR,MILE/HOUR
 * 1.READ DISTANCE IN METER ,HOUR,MINUTES,SEC FROM USER 
 * 2.CALCULATE TIME IN SECONDS,METER/SEC,KM/HOUR,MILE/HOUR
 * 3.PRINT THE REULT
 */
package dataTypes;
import java.util.*;
public class speed_in_mps_kph_mph {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float timeSeconds;
		float mps,kph,mph;
		
		System.out.print("Enter distance in meters");
		float distance = in.nextFloat();  //input distace 
		
		System.out.print("input hours: ");
		float hr=in.nextFloat();         //input hours
		
		System.out.print("Input minutes :");
		float min=in.nextFloat();       //input minutes
		
		System.out.print("Input seconds :");
		float sec=in.nextFloat();		//input seconds
	
		timeSeconds=(hr*3600)+(min/60)+sec; //converting time in seconds
		mps=distance/timeSeconds;			//converting meter/secong				
		kph=(distance/1000.0f)/(timeSeconds/3600.0f); //converting km/hour
		mph=(kph/1.609f); 					//converting miles/hour "NOTE: 1 MILE =1609 METER"
		
		System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
		}
}
