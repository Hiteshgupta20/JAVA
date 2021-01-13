//Java program to create a new String object with the contents of a character array.
package strings;
public class CharArrayContentToString {

	public static void main(String[] args) {

		// Character array with data.
		char[] myArray =new char[] {'1','2','5','6','3'};
	
	// Create a String containig the contents of arr_num
    // starting at index 1 for length 2.
	String str=String.copyValueOf(myArray,1,4);
	
	// Display the results of the new String. 
	System.out.println("The book contains " + str +" pages.");	}

}
