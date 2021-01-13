/*JAVA PROGRAM TO FIND FACTORIAL OF A NUMBER
 * 1.INITIALIZE THE NUMBER AND A FACT
 * 2.USING FOR LOOP CALCULATE THE FACTORIAL
 * 3.PRINT THE FACTORIAL*/
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		int fact=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");			
		num=sc.nextInt();					//user input
		
		for(int i=1;i<=num;i++) {	
			fact=fact*i;					//finding factorial
		}

		System.out.println("factorial of " +num+ " is "+fact);		//printing result
		
	}

}
