/*JAVA PROGRAM TO PRINT LARGEST NUMBER*/
package Array;

public class Largest_element {

	public static void main(String[] args) {
		//INITIALIZE THE ARRAY
		int [] arr=new int[] {1,52,45,78,266};
		//INITIALIZE MAX AND INITIALY STORE THE FIRST ELEMENT
		int max=arr[0];
		//SEARCHING MAXIMUM NUMBER
		for(int i=0;i<arr.length;i++) {
		//COMPARING ELEMENBTS WOITH MAX
			if(arr[i]>max)
				max=arr[i];
		}
		//DISPLAYING LARGEST NUMBER
		 System.out.println("Largest element present in given array: " + max);  
	}

}
