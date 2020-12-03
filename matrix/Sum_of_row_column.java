package matrix;

public class Sum_of_row_column {

	public static void main(String[] args) {
		int rows,cols,sumRow=0,sumCol=0;
		//Initializing the matrix a
		
		int a[][]= {
				{1,2,3},
				{4,8,9},
				{5,4,7}
		};
		
		//Calculating no of rows and columns
		rows=a.length;
		cols=a[0].length;
		
		//calculate sum of each row
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sumRow=sumRow+a[i][j];
			}
		  System.out.println("Sum of " + (i+1) +" row: " + sumRow);
		}
		System.out.println();
		//calculate sum of each column
		for(int i=0;i<cols;i++) {
			for(int j=0; j<rows;j++) {
				sumCol=sumCol+a[j][i];
			}
			  System.out.println("Sum of " + (i+1) +" col: " + sumCol);
		}

	}

}
