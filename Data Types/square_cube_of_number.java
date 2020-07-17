/*PROGRAM TO FIND SQUARE ,CUBR OR FOURTH OF A NUMBER
 * 1.READ A NUMBER FROM USER AND STORE IT AS INT
 * 2.NOW USING MATH FUNCTION SQUARE ,CUBE,FOURTH THE POWER OF NUMBER
 * 3.PRINT THE RESULT
 */
package dataTypes;
import java.util.*;
public class square_cube_of_number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("input the number");
		int number=in.nextInt(); //INPUT FROM USER
		
		int square=(int) Math.pow(number, 2);  //SQAURE OF NUMBER
		int cube  =(int) Math.pow(number, 3);  //CUBE OF NUMBER
		int fourth=(int) Math.pow(number, 4);  //FOURTH OF NUMBER
		
		System.out.println("Square of " +number +" = " +square);
		System.out.println("Cube of "+number +" = " +cube);
		System.out.println("Fourth of "+number +" = " +fourth);

	}

}
