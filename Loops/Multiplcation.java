/*PROGRAM TO WRITE THE MULTIPLICATION TABLE OF NUMBER
 * 1.INPUT THE NUMBER FROM USER
 * 2.USING FOR LOOP WE GET THE REQUIRED RESULT
 * 3.PRINT THE RESULT
 */
package forLoopPractice;
import java.util.*;
public class Multiplcation {

	public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	
	 int num;
	 
	 System.out.println("enter the no");
	 
	 num= sc.nextInt();
	 System.out.println("multiplication table of " + num);
	 for(int i=1; i<=10; i++) {
		 System.out.println(num +" x " +i +" = " +(num*i));
	 }
	 
		
	}

}
