/*PROGRAM TO CALCULATE BMI
 * 1.READ WEIGHT(kg)&HEIGHT(cm) FROM USER AND STORE IT AS DOUBLE
 * 2.CLACULATE BMI =WEIGHT/HEIGHT*HEIGHT
 * 3.PRINT RESULT
 */
package dataTypes;
import java.util.*;
public class calculate_BMI {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter weight in kg");
	int weight=in.nextInt(); //input weight in kg
	System.out.println("enter the height in cm"); 
	int height=in.nextInt();  ////input height in cm
	
	double BMI=weight/(height*0.01*height*0.01); //note convert height cm to meter &1cm=0.01m
	System.out.println("BODY MASS INDEX IS:" +BMI+"\n");
	}

}
