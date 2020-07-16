/*PROGRAM TO SWAP TWO NUMBERS
 * 1. READ 2 NUMBERS FROM USER
 * 2.SWAP 2 NUMBERS USING FOLLOWING OPERATIONS
 * 3.PRINT THE RESULT
 */
package basic1;
import java.util.*;
public class swappingTwoNumbers {

	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the A and B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping " +"a = " +a + " b = "  +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping " +"a = " +a + " b = " +b);
		
	
}
}
