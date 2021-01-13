package array;
import java.util.*;
public class insertValueIntoArray {

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

	    // Insert an element in user input position of the array 
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the index position you want to add the value");
	   int Index_position = sc.nextInt();		//input index position
	   System.out.println("Enter the new value");
	   int newValue = sc.nextInt();				//input new value 
	   System.out.println("Original Array : "+Arrays.toString(my_array));
   	   
	   for(int i=my_array.length-1; i > Index_position; i--){
	    my_array[i] = my_array[i-1];}
   	    
	   my_array[Index_position] = newValue;
   	   System.out.println("New Array: "+Arrays.toString(my_array));

	}

}
