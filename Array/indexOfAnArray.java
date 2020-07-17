/*PROGRAM TO FIND INDEX VALUE OF AN ARRAY
 * 1.FIRSTLY WE CREATE STATIC INT FUNCTION AND PASSING THE INT ARRAY AS ITS PARAMETER
 * 2.IF ARRAY IS NULL RETURN THE INT VALUE
 * 3.IF ARRAY CONTAINS THE SPECIFIED VALUE THEN RETUEN THE INDEX VALUE OF THAT SPECIFIED VALUE
 * 4 ELSE INCREMENT THE VALUE BY 1 REPEAT THE STEP 3
 * 5.PRINT THE RESULT 
 */
package array;

public class indexOfAnArray {

	public static int findIndex(int[] my_arr,int t) {
		if(my_arr==null) return -1;
		int len=my_arr.length;
		int i=0;
		while(i<len) {
			if(my_arr[i]==t)
				return i;
			else i=i+1;}
				return -1;
		}
	
	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	      System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
	      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
	      
	}
}
