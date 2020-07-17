/*PROGRAM TO FIND THE FACTORIAL OF NUMBER
 * 1.READ INPUT FROM USER
 * 2.USING FOR LOOP WE GET THE FACTORIAL OF GIVEN NUMBER
 * 3.PRINT THE RESULT
 */
 package forLoopPractice;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  num;
		int fact = 1;
		System.out.println("enter the positive no ");
		num=sc.nextInt();	//INPUT
		for(int i=1; i<=num; i++) {
		
			fact = fact*i;
			System.out.println("factorial "  +fact);
			
		}
		
		

	}

}
