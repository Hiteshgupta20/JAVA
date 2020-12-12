package strings;
import java.util.*;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declaring two strings by taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings you want");
		String str=sc.nextLine();
		String str1=sc.nextLine();
		
		//Converting both to lower case 
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		
		//comparing length of both strings
		if(str.length()!=str1.length()) {
			System.out.println("Strings are not anagram");
			}
		else {
			//converting both string to char array
			char[] String1 =str.toCharArray();
			char[] String2 =str1.toCharArray();
			
			
		//Sorting arrays
		Arrays.sort(String1);
		Arrays.sort(String2);
		
		//Comparing both array using equal methods
		if(Arrays.equals(String1,String2)==true) {
			System.out.println("Both the strings are anagram");
		}
		else {
			System.out.println("Both the strings are not anagrams");
			}
		}

	}

}
