//Java program to concatenate a given string to the end of another string
package strings;
import java.util.*;
public class StringConcat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String Str1=sc.next();	//input 1st string
		System.out.println("Enter the 2nd string");
		String Str2=sc.next();	//input 2nd string
		
		//printing Concated string
		System.out.println("Concated String: "+Str1.concat(Str2));
		

	}

}
