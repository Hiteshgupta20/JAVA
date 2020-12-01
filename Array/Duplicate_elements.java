/*JAVA PROGRAM TO FIND THE DUPLICATES IN ARRAY*/
package Array;

public class Duplicate_elements {

	public static void main(String[] args) {
		//initialize the array
		int[] arr=new int[] {1,2,5,5,6,2,6,8,7,5};
		System.out.println("Duplicates elements");
		
			//searching for duplictes
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
						System.out.println(arr[j]);
			}
		}

	}

}
