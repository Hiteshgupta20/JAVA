package matrix;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int rows,cols;
		
		//Initializing the matrix a
		int a[][]= {
				{1,2,3},
				{5,6,8},
				{8,7,4}
		};
		
		//Calculating no of rows and columns
		rows=a.length;
		cols=a[0].length;
		
		//Declare an array t with 	reverse dimension
		int t[][]=new int[cols][rows];
		//calculate transpose 
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
	   //Converts the row of original matrix into column of transposed matrix    
				t[i][j]= a[j][i];		
		}
	}
		System.out.println("Transpose of matrix");
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}

}
	}
