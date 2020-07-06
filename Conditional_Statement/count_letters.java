/*PROGRAM TO COUNT LETTERS OF A STRING
 * 1. READ A STRING FROM USER
 * 2.COUNT THE LETTERS BY USING ARRAY AND FOR LOOP
 * 3. PRINT THE RESULT
 */
package basic1;
import java.util.*;
public class count_letters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		char[] ch= sc.nextLine().toCharArray();  //input the string
		int letter=0;
		for(int i=0; i<ch.length; i++) {
			if(Character.isLetter(ch[i])) {		//CONDITION CHECK
				letter++;
			}
		}
		System.out.println("Letter: " +letter);
	}

}
