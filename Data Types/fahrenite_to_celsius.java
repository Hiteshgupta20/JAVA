/*PROGRAM TO CONVERT TEMPERATURE FROM FAHRENITE TO CELSIUS 
 * 1.READ INPUT FROM USER IN CELSIUS AND STORE IT IN DOUBLE 
 * 2.CONVERT FAHRENITE INTO CELSIUS USING C=(5(F-32))/9
 * 3.PRINT TEMPERATURE IN CELSIUS
 */
package dataTypes;
import java.util.*;
public class fahrenite_to_celsius {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the degree in fahrenite");
		double fahrenite=in.nextDouble();   //input 
		
		double celsius = (5*(fahrenite-32))/9;  //converting into celsius
		System.out.println(fahrenite +" degree fahrenite is equal to : " +celsius +" in celsius");
				
	}

}
