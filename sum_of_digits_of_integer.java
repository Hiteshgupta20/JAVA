/*PROGRAM TO FIND SUM OF DIGITS OF INTEGER
 * 1.INPUT NUMBER FROM USER AND STORE IT IN LONG
 * 2.CREATE A STATIC INT FUNCTION AND TAKE LONG NUMBER AS ITS PARAMETER
 * 3.INITIALIZE SUM =0
 * 4.CHECK WHETHER THE NUMBER IS ZERO OR NOT
 * 5.USE SUM=SUM+NUMBER%10 AND UPDATE THE NUMBER
 * 6.RETURN SUM
 */


package BasicPart1;
import java .util.*;
public class sum_of_digits_of_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		long number=sc.nextLong();  //input the number 
		System.out.println("The sum of digits : " + sumOfDigits(number));
		sc.close();
	}
	
	public static int sumOfDigits(long number) {  //static function sumOfDigits
		int sum=0;
		while(number!=0) {						  	
			sum+=number%10;
			number/=10;
		}
		return sum;
		
	}
}
