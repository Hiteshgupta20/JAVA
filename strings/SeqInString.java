//Java program to test if a given string contains the specified sequence of char values

package strings;
import java.util.*;
public class SeqInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();	//input string
		System.out.print("Enter the sequence u want to check");	
		String str2=sc.next();	//input sequence
		
		//Checking the sequence and print the result
		System.out.println(str.contains(str2));
		
	}

}
