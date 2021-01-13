//Java program to create a unique identifier of a given string.
package strings;
import java.util.*;
public class StringHashCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.next();	//input
		
		// Get the hash code for the above string.	
		int hashCode=str.hashCode();
		
		// Display the hash code
		System.out.println("The hash for " + str +" is " + hashCode);
	}

}
