package Array;

public class Elemets_on_odd_position {

	public static void main(String[] args) {
		//Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5,6,8,10,12};  
  
        System.out.println("Elements of given array present on odd position: ");  
        //Loop through the array by incrementing value of i by 2  
            for (int i = 0; i <=arr.length-1; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  


}
