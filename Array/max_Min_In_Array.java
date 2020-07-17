package array;
import java.util.*;
public class max_Min_In_Array {
	
	public static void main(String[]args) {
		// Initializing array of integers
		Integer[] my_array= {1,52,56,47,62,78,623};
		// using Collections.min() to find minimum element 
		int min=Collections.min(Arrays.asList(my_array));
		// using Collections.max() to find maximum element
		int max=Collections.max(Arrays.asList(my_array));
		 // printing original array 
		System.out.println("Original Array : "+Arrays.toString(my_array));
		// printing minimum and maximum numbers 
		System.out.println("Minimun element of array : "+min);
		System.out.println("Maximun element of array : "+max);
	}
}
