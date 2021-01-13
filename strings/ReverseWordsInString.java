//Java program to reverse words in a given String 
package strings;
import java.util.*;
import java.util.regex.Pattern;
public class ReverseWordsInString {

	// Method to reverse words of a String 
	public static String reverseWord(String str) {
		
		// Specifying the pattern to be searched 
		Pattern pattern=Pattern.compile("\\s");
		
		// splitting String str with a pattern (i.e )splitting the string whenever their 
        //  is whitespace and store in temp array
		String[] temp=pattern.split(str);
		String result="";
		
	   //Iterate over the temp array and store the string in reverse order. 
		for(int i=0;i<temp.length;i++) {
			if(i==temp.length-1)
				result=temp[i]+result;
			else
				result=" " +temp[i] + result;
		}
		return result;
	}
	 // Driver methods to test above method 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the string");
	String str1=sc.nextLine();
	System.out.println(reverseWord(str1));
	}

}
