/*JAVA PROGRAM TO FIND SUM OF ARRAY*/
package Array;

public class Sum_of_array {

	public static void main(String[] args) {
		// Initialize Array
		int[] arr=new int[] {1,5,2,8,3,4};
		int sum=0;
		//Finding sum
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			}
		//Displaying Sum 
		System.out.println("Sum of Array = "+ sum);

	}

}
