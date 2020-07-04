/*PROGRAM TO FIND AREA AND PERIMETER OF CIRCLE
 * 1.INPUT THE RADIUS FROM USER AND STORE IT AS DOUBLE
 * 2.USING AREA OF CIRCLE :(3.14*radius*radius); 
 * 3.PRINT AREA OF CIRCLE
 * 4.USING PERIMETER OF CIRCLE :(2*3.14*radius)
 * PRINT PERIMETER OF CIRCLE
 */

package basic1;
import java.util.*;
public class area_and_perimeter_of_circle {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	 // INPUT THE RADIUS
	System.out.println("enter the radius");        
	double radius= sc.nextDouble();
	// AREA OF CIRCLE
	double area_of_circle= (3.14*radius*radius);
	// PRINT AREA OF CIRCLE
	System.out.println("Area of circle : " +area_of_circle);	
	// PERIMETER OF CIRCLE
	double perimeter_of_circle= (2*3.14*radius);	
	// PRINT PERIMETER OF CIRCLE
	System.out.println("Perimeter of cicle : " +perimeter_of_circle);

}
}
