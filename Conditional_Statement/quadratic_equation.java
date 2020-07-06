/*PROGRAM TO FIND ROOOTS OF A QYADRATIC EQUATION
 * 1. READ 3 NUMBERS FROM USER
 * 2.FIND (B*B-4*A*C) AND STORE IT AS DOUBLE RESULT
 * 3.NOW CHECK IF RESULT GREATER THAN 0 OR EQUAL OR LOWER THEN SOLVE THE EQUATION USING MATH FUNCTION 
 * 4.PRINT THE ROOTS
 */
package Conditional_Statement;
import java.util.*;
public class quadratic_equation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of A");
	double a=sc.nextDouble();
	System.out.println("Enter value of B");
	double b= sc.nextDouble();
	System.out.println("Enter the value of C");
	double c=sc.nextDouble();
	
	double result= b*b-4*a*c;
	if(result>0.0) {
		double r1=(-b+Math.pow(result, 0.5))/(2.0*a);
		double r2=(-b-Math.pow(result, 0.5))/(2.0*a);
		System.out.println("The Roots Are : "+ r1 +" and "+r2);
	}
	else if(result==0) {
		double r1=(-b)/(2*a);
		System.out.println("The Roots Are : "+ r1 );
	}
	else {
		System.out.println("The equation has no real root");
	}
}
}