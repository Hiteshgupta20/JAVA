package array;
import java.util.*;
public class sumOfParticularIntegerInArray {

	public static void main(String[] args) {
		int[] array_num= {10,25,56,10,56,10};
		System.out.println("Original array: " +Arrays.toString(array_num));
		int search_num=10;
		int fixed_num=30;
		System.out.println("Result: "+result(array_num,search_num,fixed_num));
	}
		
		public static boolean result(int[] numbers,int search_num,int fixed_num) {
			int temp_num=0;
			for(int number:numbers) {
				if(number==search_num) {
					temp_num+=search_num;}
				if(temp_num>fixed_num) {
					break;}
				}
			return temp_num==fixed_num;
	}

}
