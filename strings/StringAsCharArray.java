//Java program to get the contents of a given string as a Char array.
package strings;
import java.util.*;
public class StringAsCharArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	
	// Copy the contents of the String to a char array
	char[] char_array=str.toCharArray();
	
	// Create a new String using the contents of the char array.
	String new_str= new String(char_array);
	
	// Display the contents of the char array.
	System.out.println("\nThe char array equals " +new_str+ "\n");
	
	}
}

