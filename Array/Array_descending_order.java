package Array;

public class Array_descending_order {

	public static void main(String[] args) {
		//Initialize array and a temp 
			int[] arr=new int[] {1,2,5,3,4,7,62};
			int temp=0;
			//Displaying original array
			System.out.println("original array");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			//sorting array in ascending order
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}		
				}
			}
			System.out.println();
			//diaplaying array in ascending order
			System.out.println("Array in ascending order");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}

	}
