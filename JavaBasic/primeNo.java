package javaBasic;
import java.util.*;
public class primeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean flag=false;
		int i=2;
		while(i<=num/2) {
			
			if(num%2==0) { 
				flag=true;
				break;}
			
			i++;
		}
		if(!flag)
			System.out.println(num + " is a prime number ");
		else
			System.out.println(num + " is not a prime number");
		
	}

}
