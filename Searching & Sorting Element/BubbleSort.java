/*Bubble sort algorithm is known as the simplest sorting algorithm
 * In bubble sort algorithm, array is transversed from the first element to last element. 
 * Here, current element is compared with the next element. If current element is greater than the next element, 
 * it is swapped.*/

package javaPrograms;

import java.util.Scanner;

public class BubbleSort {
	
	//Method for bubble sort
	static void bubbleSort(int[] arr) {
		int n=arr.length-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					//Swapping 
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//main driver class
	public static void main(String [] args) {
		//Scanner class for user input
		Scanner sc = new Scanner(System.in);
		//for size of an array
		System.out.println("Enter the numbers of elements you want in array");	
		int n= sc.nextInt();
		//creating an array as of size of user input
		int [] arr= new int[n];			
		System.out.println("Enter all the elements");
		// inputing all elements
		for(int i=0;i<n;i++) {				
			arr[i]=sc.nextInt();
		}
		
		//original array 
		System.out.println("Array before Bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//calling method bubble sort
		bubbleSort(arr);		
		//array after sort
		System.out.println("\nArray after Bubble sort");				
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
