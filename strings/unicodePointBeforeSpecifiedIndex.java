//Java program to get the character (Unicode code point) before the specified index within the String.
package strings;
public class unicodePointBeforeSpecifiedIndex {

	public static void main(String[] args) {
		String str="w3.resources";
		System.out.println("original String : "+str);
		
		//codepoint before index1
		int val1=str.codePointBefore(1);
		//codepoint before index7
		int val2=str.codePointBefore(7);
		
		//print character at index value 1 in string
		System.out.println("Character(unicode point) :"+val1 );
		//print character at index value 7 in string
		System.out.println("Character(unicode point) :"+val2 );


	}

}
