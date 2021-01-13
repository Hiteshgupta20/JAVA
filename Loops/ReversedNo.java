/*PROGRAM TO REVERSE THE NUMBER
 * 1.READ INPUT FROM USER
 * 2.USING WHILE LOOP REVERSE THE NUMBER
 * 3.PRINT THE REVERSED NUMBER
 */
package forLoopPractice;
import java.util.*;
public class ReversedNo {
public static void main(String[]Args) {
	
	Scanner sc =  new Scanner(System.in);
			int num;
			int reversed =0;
			System.out.println("enter the input");
			num=sc.nextInt();	//INPUT
			while(num!=0) {
			int digit = num%10 ;
			reversed= reversed*10 +digit;
			num = num/10;
			}
			System.out.println("Reverse no : " +reversed);
			
			
			
			
}



}
