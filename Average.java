/*PROGRAM TO FIND AVERAGE OF 3 NUMBERS
 * 1.INPUT 3 NUMBERS FROM USER AND STORE IT AS INT
 * 2.USING AVERAGE :(num1 + num2 + num3)/3;
 * 3.PRINT AVERAGE OF 3 NUMBERS
 */
package basic1;
import java.util.*;
public class average {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//INPUT THE NUMBER1
		System.out.println("enter the number 1");
		int num1=sc.nextInt();
		//INPUT 2ND NUMBER
		System.out.println("enter the number 2");
		int num2 = sc.nextInt();
		//INPUT 3RD NUMBER
		System.out.println("enter the number 3");
		int num3 = sc.nextInt();
		// AVERAGE 
		int avg = (num1 + num2 + num3)/3;
		System.out.println("Average of three numbers : " +avg );						
		
		

	}

}
