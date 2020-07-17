/*PROGRAM TO CHECK WHETHER THE NUMBER IS POSITIVE OR NEGATIVE
 * 1.READ INPUT FROM USER
 * 2.USING IF CONDITION CHECK NUMBER IS GREATER OR LOWER THEN ZERO
 * 3.IF LOWER PRINT NEGATIVE ELSE POSTIVE
 * 4.PRINT THE RESULT
 */
package Conditional_Statement;
import java.util.*;
public class positive_negative_number {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the number");
		int num =sc.nextInt();  //input
				
		if(num>0)				// conditional statement
			System.out.println("Positive");
		else
			System.out.println("Neative");
	}
}
