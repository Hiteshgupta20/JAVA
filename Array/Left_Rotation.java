/*JAVA PROGRAM TO LEFT ROTATE THE ELEMENTS*/
package Array;

public class Left_Rotation {

	public static void main(String[] args) {
		//initialize the array
		int[]arr=new int[] {1,2,3,4,5};
		//n determine the number of times array should be rotated
		int n=3;
		//display the original array
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
		//Rotate array to th left
		for(int i=0;i<n;i++) {
		int j,first;
		//stores the first element of elements
		first=arr[0];
			for(j=0;j<arr.length-1;j++) {
			//shift array by one
				arr[j]=arr[j+1];
			}
				arr[j]=first;
		}
		System.out.println();
		//displaying array after rotation 
		System.out.println("Array after rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
	}
	
}
