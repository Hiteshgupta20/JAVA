/*PROGRAM TO REVERSE A STRING
 * 1.INPUT THE STRING FROM USER AND STORE IT AS A CHAR ARRAY
 * 2.BY USING FOR LOOP INITIALIZE INT I AS LENGTH.LENGTH-1 AND DECREMENYIN I BY 1 
 * 3.PRINT REVERSE STRING 
 */

package BasicPart1;
import java.util.*;
public class reverse_a_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");  //input the string
		char[] letters =  sc.nextLine().toCharArray();  // Char Array of letters
		
		System.out.println("Reverse String ");
		for(int i =letters.length-1; i>=0; i--) {      // Reversing the string
			System.out.print(letters[i]);
		}
		System.out.println("\n");
		sc.close();
				
	}

}
