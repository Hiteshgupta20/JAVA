//JAVA PROGRAM TO CHECK AMSTRONG NUMBER
package javaBasic;
import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {
		int a,c=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();	//INPUT THE NUMBER
		temp=num;
		
		while(num>0) {		
			a=num%10;		
			num=num/10;
			c=c+(a*a*a);
			}
		if(temp==c)
			System.out.println(" Amstrong number");
		else
			System.out.println(" not a Amstrong number");
	}

}
