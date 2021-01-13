package matrix;

public class Lower_Traingular {

	public static void main(String[] args) {
		int rows,cols;
		int a[][] = {       
                {1, 2, 3},    
                {8, 4, 6},    
                {4, 5, 7}    
                };    
		//calculate no of rows and column in given matrixes
		rows=a.length;
		cols=a[0].length;
		
		if(rows!=cols)
			System.out.println("Matrix should be a square matrix");
		else
			System.out.println("Lower traingular marix");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(i>j)
						System.out.print("0 ");
					else
						System.out.print( a[i][j]+" ");
					}
				System.out.println();
			}

	}

}
