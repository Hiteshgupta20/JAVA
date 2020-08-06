//JAVA PROGRAM TO CHECK PALIDROME NUMBER
package javaBasic;
import java.util.*;
public class Palidrom {

	public static void main(String[] args) {
		int sum=0,temp,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
	
		if(temp==sum)
			System.out.println(" is palidrome");
		else
			System.out.println(" is not  palidrome");
	}

}
