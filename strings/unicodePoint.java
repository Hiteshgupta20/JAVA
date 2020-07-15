//Java program to get the character (Unicode code point) at the given index within the String.
package strings;
public class unicodePoint {

	public static void main(String[] args) {
		String str="w3.resources";
		System.out.println("original String : "+str);
		
		//codepoint at index1
		int val1=str.codePointAt(1);
		//codepoint at index5
		int val2=str.codePointAt(6);
		
		//print character at index value 1 in string
		System.out.println("Character(unicode point) :"+val1 );
		//print character at index value 5 in string
		System.out.println("Character(unicode point) :"+val2 );
	

	}

}
