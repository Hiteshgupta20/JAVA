/*PROGRAM TO CHECK FLOATING POINT NUMBER IN SPECIFIED FORMAT
 * 1.READ INPUT FROM USER
 * 2.CHECK WHETER NUMBER IS POSITIVE SMALL, POSITIVE LARGE, POSITIVE, 
 * 	SMALL NEGATIVE,LARGER NEGATIVE,NEGATIVE OR ZERO USING IF ELSEIF CONDITIONS
 * 3.PRINT THE RESULT ACC. TO USER INPUT  
 */
package Conditional_Statement;
import java.util.*;
public class floatinPointNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double num = sc.nextDouble();  //input
			
		if(num>0) {
			if(num<1) 
				System.out.println("positive small number");
			else if(num>1000000)
				System.out.println("positive large number");
			else
				System.out.println("positive number");
		}
		else if(num<0) {
			if(Math.abs(num)<1)
				System.out.println("negative small number");
			else if(Math.abs(num)<1000000)
				System.out.println("negative larger number");
			else
				System.out.println("negatie number");
		}
		else
			System.out.println("zero");
		}
	}


