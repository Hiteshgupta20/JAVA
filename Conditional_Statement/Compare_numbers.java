/*PROGRAM TO COMPARE TWO NUMBERS
 * 1.READ 2 NUMBERS FROM USER
 * 2.USING IF ELSE COMOARE THE NUMBER
 * 3.PRINT THE RESULT
 */
package basic1;
import java.util.*;
public class Compare_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1,num2;		
		System.out.println("enter the num1 ");
		num1=sc.nextInt();	//INPUT 1ST NUMBER
		System.out.println("enter the num2 ");
		num2=sc.nextInt();	//INPUT 2ND NUMBER
		
			if (num1 == num2) { 
				System.out.printf("%d == %d\n" ,num1,num2);}
			if ( num1 != num2 ) {          
	            System.out.printf( "%d != %d\n", num1, num2 );}  
	        if ( num1 < num2 )  {        
	            System.out.printf( "%d < %d\n", num1, num2 );}  
	        if ( num1 > num2 ) {	          
	            System.out.printf( "%d > %d\n", num1, num2 );}  
	        if ( num1 <= num2 ) {         
	            System.out.printf( "%d <= %d\n", num1, num2 );  }
	        if ( num1 >= num2 ) {         
	            System.out.printf( "%d >= %d\n", num1, num2 );  }
		}
	}


