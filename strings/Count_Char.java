package strings;
import java.util.*;
public class Count_Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String word=sc.nextLine();
		int count=0;
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)!=' ') {
				count++;
			}
		}
			System.out.println("Total no of char present " +count);

	}

}
