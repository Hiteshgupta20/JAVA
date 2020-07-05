/*Program to break an integer into a sequence of individual digits.
 * 1.Read a six digit non native number from user
 * 2.create 6 individual digits using %operator
 * 3.print the numbers  
 */
package dataTypes;
import java.util.*;
public class IntegerIntoSequenceIndividualDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input the six nin native integer");
		int input=in.nextInt();
		
		int n1=input/100000%10;
		int n2=input/10000%10;
		int n3=input/1000%10;
		int n4=input/100%10;
		int n5=input/10%10;
		int n6=input%10;
		
	 System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}

}
