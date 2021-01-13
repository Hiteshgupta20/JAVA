/*JAVA PROGRAM TO FIND ARMSTRONG NUMBER
 * 1.INTIALIZE THE NUMBER AND A TEMP NUMBER
 * 2.STORE THE NUMBER IN TEMP NUMBER
 * 3.USING WHILE LOOP ANF FIND THE REMAINDER OF NUMBER
 * 4.UPDATE THE NUMBER
 * 5.COMPARE THE TEMP NUMBER AND NUMBER
 * 6.IF BOTH THE NUMBER ARE SAME PRINT THE RESULT NUMBER IS ARMSTRONG */
import java.util.*;
public class armstrong_number {

	public static void main(String[] args) {
		int n,temp,a,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		n=sc.nextInt();					//user input
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;						//updating number
			c=c+(a*a*a);				//calculating armstrong number
		}
		if(temp==c) {					//comapring both temp and number
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
}

}
