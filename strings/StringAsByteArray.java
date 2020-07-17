//Java program to get the contents of a given string as a byte array.
package strings;
import java.util.*;
public class StringAsByteArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine(); 	//input string
		
		 // Copy the contents of the String to a byte array.
		byte[] byte_arr= str.getBytes();
		
		// Create a new String using the contents of the byte array.
		String new_str= new String(byte_arr);
		
		
		System.out.println("\nThe new String equals " +new_str +"\n");

	}

}
