package matrix;

public class Odd_even_in_Matrix {

	public static void main(String[] args) {
		int rows,cols,countEven=0,countOdd=0;
		//Initializing the matrix a
		
		int a[][]= {
				{1,2,6},
				{7,6,2},
				{5,3,8}
		};
		
		//calculating rows and columns in given matrix
		rows=a.length;
		cols=a[0].length;
		
		//count the even and odd elements
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(a[i][j]%2==0)
					countEven++;
				else
					countOdd++;
			}
		}
		System.out.println("Frquency of even number" +" "+ countEven);
		System.out.println("Frquency of odd number" +" "+ countOdd);

	}

}
