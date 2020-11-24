/*JAVA PROGRAM TO GENERATE RANDOM NUMBER B/W GIVEN RANGE
 * 1.INITIALIZE THE MIN AND MAX RANGE 
 * 2.USING MATH.RANDOM METHOD FINDING THE RANDOM NUMBER B/W MIN AND MAX NUMBER
 * 3. PRINT THE RANDOM NUMBER*/
import java.util.*;
public class Random_number {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the min range of number");
	int min=sc.nextInt();										//input min number of range
	System.out.println("Enter the max range of number");
	int max=sc.nextInt();										//input max number of range
	
	System.out.println("Radom number b/w "+min +" & " +max);
	int random_number=(int)(Math.random()*(max-min+1)+min);		//genrating random number
	System.out.println(random_number);

}

}
