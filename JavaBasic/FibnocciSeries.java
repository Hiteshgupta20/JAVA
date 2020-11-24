/*JAVA PROGRAM FOR FIBONACCI SERIES
 * 1. INITIALIZE 3 NUMBER AS N1,N2,N3 
 * 2. SET AS N1 AND N2 AS 0,1 RESPECTIVELY
 * 3.PRINT NI AND N2 AFTER THAT PUT A FOR LOOP
 * 4.ADD N3=N1+N2 AND UPDATE THE VALUES OF N1 AND N2 
 * 5. PRINT THE RESULT */
public class Fibonacci_series {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1=0; n2=1;
		System.out.print(n1+" "+n2);    //printing 0 and 1
		
		for(int i=2; i<10; i++) {		//for loop starting with 2 as 0 amd 1 are already printed
			n3=n1+n2;
			System.out.print(" "+n3);   //printing n3
			
			n1=n2;				//updating n1
			n2=n3;				//updatinh n2
		}
}

}
