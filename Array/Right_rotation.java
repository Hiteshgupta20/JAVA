package Array;

public class Right_rotation {

	public static void main(String[] args) {
		//Initializr the array
		int [] arr=new int[] {1,2,3,4,5};
		//n determines the number of rotation
		int n=3;
		
		//Displaying original array
		System.out.println("Original array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		//Rotate the given array by n number
		for(int i=0;i<n;i++) {
			int j,last;
		//store the last element of array
			last=arr[arr.length-1];
		
		for(j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
		}
		//last element will be added to the start of array
		arr[0]=last;
		}
		
		//displaying array after rotation
		System.out.println();
		System.out.println("Array after rotation ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
