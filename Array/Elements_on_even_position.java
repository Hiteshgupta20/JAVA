/*JAVA PROGRAM TO PRINT ELEMENTS ON EVEN POSITION*/
package Array;

public class Elements_on_even_position {

	public static void main(String[] args) {
		//Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
            for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  