//Java program to compare a given string to the specified character sequence.
package strings;
import java.util.*;
public class CompareTwoStrings {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String Str1=sc.next();	//input 1st string
		System.out.println("Enter the 2nd string");
		String Str2=sc.next();	//input 2nd string
		
		//comparing strings
		System.out.println(Str1.equals(Str2));
	}
}
