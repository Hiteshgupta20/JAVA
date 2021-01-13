/*JAVA PROGRAM TO PRINT PATTERN
 * 1.IN THIS PROGRAM WE USE 2 FOR LOOPS 
 * 2.1ST FOR LOOP FOR ROWS AND 2ND FOR COLOUMS
 * 3.FIRST PRINT STATEMENT PRINTS *
 * 4.SECOND PRINT STATEMENT PRINTS SPACE*/
public class Right_traingle_pattern {

	public static void main(String[] args) {
		int i,j,row=5;
		
		for(i=0;i<row;i++) 		//outer loop for rows
		{
		for(j=0;j<=i;j++) 		//inner loop for column
		{
			System.out.print("*");	//prints star
		}
			System.out.println(" ");		//prints space
		}
		
}

}
