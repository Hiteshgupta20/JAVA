package strings;
import java.util.*;
public class stringEndWithSpecificLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String Str=sc.nextLine();
		System.out.println("Enter the End value u want to check");
		String end_val=sc.next();
		
		boolean end= Str.endsWith(end_val);
		
		System.out.println("\"" +Str+ "\" ends with" + " / " +end_val+ "\"? " + end);

	}

}
