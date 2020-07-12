package array;
import java.util.*;

public class arrayGrid {

	public static void main(String[] args) {
		int [][]a = new int[10][10];    
		 for(int i = 0; i < 10; i++)
		   {
		      for(int j = 0; j < 10; j++)
		      {
		         System.out.printf("%d ", a[i][j]);
		      }
		      System.out.println();
		   }
	}

}
