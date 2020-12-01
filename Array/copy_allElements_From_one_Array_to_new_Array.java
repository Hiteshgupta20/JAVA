/*JAVA PROGRAM TO COPY THE ELEMENTS OF 1ST ARRAY TO 2ND ARRAY */
package Array;

public class copy_allElements_From_one_Array_to_new_Array {

	public static void main(String[] args) {
		//Initialize the 1st array
		int [] arr1= new int[] {1,2,6,4,2,5};
		//initilize the 2md array of length of 1st array
		int [] arr2= new int[arr1.length];
		
		//copying the elements of 1st array
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		//priting the 1st array
		System.out.println("Original Array ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		//priting the second array
		System.out.println("\nNew Array ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr2[i]+ " ");
		}
	}
	

}
