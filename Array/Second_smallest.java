package Array;

import java.util.Arrays;

public class Second_smallest {
		public static int getSecondSmallest(int[]a) {
			Arrays.sort(a);
			return a[1];
		}
		
		public static void main(String[] args) {
			int a[]= {1,2,5,6,3,2};  
			int b[]={44,66,99,77,33,22,55};
			
			//displaying third largest number
			System.out.println("Second Smallest "+getSecondSmallest(a));
			System.out.println("Second Smallest "+getSecondSmallest(b));
		
		}

	}


