/*PROGRAM TO COMPARE TWO NUMBERS
 * 1.INPUT 2 NUMBERS FROM USER
 * 2.USING IF CONDITION COMPARING TWO GIVEN NUMBERS
 */



package BasicPart1;
import java.util.*;
public class compare_two_numbers {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input the 2 numbers");
		int number1=sc.nextInt(); //input 1st number to compare
		
		int number2=sc.nextInt(); //input 2nd number to compare
		
		if(number1 == number2) 							 
			System.out.printf("%d==%d\n", number1,number2);
		if(number1 != number2)
			System.out.printf("%d!=%d\n",number1,number2);
		if(number1 > number2)
			System.out.printf("%d>%d\n",number1,number2);
		if(number1 < number2)
			System.out.printf("%d<%d\n",number1,number2);
		if(number1 >= number2)
			System.out.printf("%d>=%d\n",number1,number2);
		if(number1 <= number2)
			System.out.printf("%d<=%d\n",number1,number2);
		sc.close();
	}
}