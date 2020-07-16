/*PROGRAM TO CHECK ARRAY CONTAINS SPECIFIC VALUE
 * 1.FIRST WE CREATE A STATIC BOOLEAN FUNCTION AND A INT ARRAY AS ITS PARAMTER
 * 2.IF THE ARRAY CONTAINS THE SPECIFIED VALUE IT RETURNS TRUE ELSE FALSE
 * 3.CREATE A INT ARRAY AND PASS THE VALUE U WANT TO CHECK
 * 4.PRINT THE RESULT 
 */
package array;

public class arrayContainsSpecificValue {
	public static boolean contains(int[] arr,int items) {
		for(int n:arr) {
			if(items==n) 
				return true;		
		}
				return false;		
		}

	public static void main(String[] args) {
		int[] my_arr1= {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365, 
	            		1456, 2265, 1457, 2456};
		System.out.println(contains(my_arr1,2013));
		System.out.println(contains(my_arr1,2015));

	}

}
