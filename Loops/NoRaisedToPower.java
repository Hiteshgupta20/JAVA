/*PROGRAM TO FIND NUMBER RAISED TO POWER
 * 1. READ BASE VALUE AND ITS RAISED POWER FROM USER
 * 2.USING FOR LOOP WE GET THE REQUIRED RESULT 
 * 3.PRINT THE RESULT
 */
package forLoopPractice;
import java.util.*;
public class NoRaisedToPower {
	public static void main(String []args) {
		Scanner console = new Scanner (System.in);
		int base;
		int power;
		int result = 1;
		
	System.out.println("enter the base value");
	base= console.nextInt();
	System.out.println("enter the power");
	power = console.nextInt();
	
	for(int i=1; i<=power; i++) {
		result	 *= base;
		System.out.println("result : " +result);
	}
	}

}
