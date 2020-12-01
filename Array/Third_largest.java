package Array;
import java.util.*;

//Method for finding third largest
public class Third_largest {
	public static int getThirdLargets(int[]a) {
		Arrays.sort(a);
		return a[3];
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};
		
		//displaying third largest number
		System.out.println("Third Largest "+getThirdLargets(a));
		System.out.println("Third largest "+getThirdLargets(b));
	
	}

}
