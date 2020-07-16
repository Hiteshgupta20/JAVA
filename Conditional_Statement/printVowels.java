/*PROGRAM TO CHECK WHETHER INPUT LETTER IS VOWEL OR NOT
 * 1.INPUT A LETTER FROM USER
 * 2.CHECK WHETHER ITS VOWEL OR NOT USING IF ELSE CONDITION
 * 3.PRINT THE RESULT
 */
package Conditional_Statement;
import java.util.*;
public class printVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letter");
		char letter=sc.next().charAt(0); //input
		
		if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
			System.out.println("Letter is vowel");
		else
			System.out.println("Letter is consonent");
				

	}

}
