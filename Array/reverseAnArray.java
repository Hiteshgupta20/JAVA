// Reversing an array using Java collections
package array;
import java.util.*;
public class reverseAnArray {

	/*function reverses the elements of the array*/
	public static void reverse(Integer[]a) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void main(String[] args) {
		// Initializing array of integers
		Integer[] arr= {10,20,65,25,45,87};
		reverse(arr);
	}

}
