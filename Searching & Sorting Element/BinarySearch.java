package javaPrograms;

import java.util.Arrays;

public final class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,25,41,23,65};
		int input = 23;
		
		//Sorting array
		Arrays.sort(arr);
		System.out.print("Sorted Array: " +Arrays.toString(arr));
		
		//Logic for perform searching
		int index= getElementIndex(arr,input);
		System.out.println("\n"+input+" is at index : "+index);
	}

	//Logic for Searching element using Binary Search
	private static int getElementIndex(int[] arr, int input) {
		int start=0;
		int last=arr.length-1;		
		while(start<=last){
			int middle=(start+last)/2;
			
			if(input==arr[middle])
				return middle;
			else if(input>arr[middle])
				start=middle+1;
			else if(input<arr[middle])
				last=middle-1;
		}
		return -1;
	}

}
