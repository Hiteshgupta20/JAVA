/* JAVA PROGRAM TO CHECK THE PALINDROME NUMBER
 * 1.INTIALIZE THE NUMBER
 * 2.STORE IT IN A TEMP. NUMBER
 * 3.REVERSE THE NUMBER 
 * 4.COMPARE THE TEMP. NUMBER TO THE INITIALIZE NUMBER
 * 5.IF BOTH NUM ARE SAME THEN IT IS PALINDROME*/
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int sum=0,r,temp;
		Scanner sc=new Scanner(System.in);			//Scanner
		System.out.println("Enter the number");
		
		int num=sc.nextInt();				//user input
		temp=num;
		while(num>0) {
			
		r=num%10;							//reverse the number
		sum=(sum*10)+r;						
		num=num/10;							//updating number
}
		if(temp==sum) {						// comparing the temp to sum number
			System.out.println(" is palindrome");
		}
		else {												
			System.out.println(" is not a palindrome");
		}

	}

}
