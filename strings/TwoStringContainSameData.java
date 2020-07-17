// Java program to check whether two String objects contain the same data
package strings;
import java.util.*;
public class TwoStringContainSameData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String Str1= sc.nextLine(); //1st input
		System.out.println("Enter the 2nd string");
		String Str2=sc.nextLine();	//2nd input
		
		// Are any of the above Strings equal to one another?
		boolean equal=Str1.equals(Str2);
	
		// Display the results of the equality checks.
		System.out.println("\"" +Str1+ "\" equals " + "\"" +Str2 + "\" ? " +equal);

	}

}
