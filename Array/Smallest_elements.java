/*JAVA PROGRAM TO PRINT SMALLEST NUMBER*/
package Array;

public class Smallest_elements {

	public static void main(String[] args) {
		//INITIALIZE THE ARRAY
			int [] arr=new int[] {1,52,45,78,266};
			//INITIALIZE MIN AND INITIALY STORE THE FIRST ELEMENT
			int min=arr[0];
			//SEARCHING MINIMUM NUMBER
			for(int i=0;i<arr.length;i++) {
			//COMPARING ELEMENBTS WOITH MIN
			if(arr[i]<min)
			min=arr[i];
				}
			//DISPLAYING SMALLEST NUMBER
			 System.out.println("Largest element present in given array: " + min);  
			}

		}
