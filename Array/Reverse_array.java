/*JAVA PROGRAM TO REVERSE ELEMENTS OF AN ARRAY*/
package Array;

public class Reverse_array {

	public static void main(String[] args) {
		//initialize the array
		int[] arr=new int[] {1,2,3,4,5};
		//displaying original array
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//displaying reveresd array
		System.out.println("Array in reversed order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] +" ");
		}
		
		

	}

}
