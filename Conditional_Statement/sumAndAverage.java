package Conditional_Statement;
import java.util.*;
public class sumAndAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of testCases");
		int t=sc.nextInt();
		for(int i=0;i<=t;i++)
			System.out.println("enter the number");
			
		
		/*System.out.println("Enter the 1st num");
		double num1=sc.nextDouble();
		System.out.println("enter 2nd num");
		double num2=sc.nextDouble();
		System.out.println("enter 3rd num");
		double num3=sc.nextDouble();
		System.out.println("enter 4th num");
		double num4=sc.nextDouble();
		*/
				
		double sum= num1+num2+num3+num4;
		System.out.println("Sum of numbers : " +sum);
		
		double avg=sum/4;
		System.out.println("Average : " +avg);
	}

}
