package dataTypes;
import java.util.*;
public class signed_unsigned_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the numbers");
			
		int num1= sc.nextInt();
		int num2=sc.nextInt();
		
		 num1=Integer.MIN_VALUE;
		 num2=Integer.MAX_VALUE; 
		System.out.println("Signed integers : " +num1 +","+num2);
		System.out.println("-----------------");
		
		int compared_signed_num= Integer.compare(num1, num2);
		System.out.println("Result of comapred signed number " +compared_signed_num);
		
		int compared_unsigned_num= Integer.compareUnsigned(num1, num2);
		System.out.println("Result of comapred unsigned number " +compared_unsigned_num);
				
		
		

	}

}
