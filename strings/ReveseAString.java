//Java program to Reverse a String
package strings;
import java.util.*;
public class ReveseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input= sc.nextLine();	//input

		// convert String to character array 
		char[] str=input.toCharArray();
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}
	}

}
