package array;
import java.util.Arrays;
import java.util.*;
public class removeIndexValue {

	public static void main(String[] args) {
		   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		    		   
   // Remove the user input element of the array
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the index value u want to remove");
   int removeIndex = sc.nextInt();
   
   for(int i = removeIndex; i <my_array.length-1; i++){
        my_array[i] = my_array[i+1];
		      }
 // We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
   System.out.println("Original Array : "+Arrays.toString(my_array));    
   System.out.println("After removing the second element: "+Arrays.toString(my_array));
		 }
}
