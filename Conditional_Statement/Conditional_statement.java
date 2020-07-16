/*PROGRAM TO PRINT WEIRD NOT WEIRD ACC. TO CONDITIONS
 * 1.READ INPUT FROM USER
 * 2.CHECK THE CONDITION BY USING IF ELSE CONDITION 
 * 3.PRINT THE RESULT
 */
package basic1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Conditional_statement {

   public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("enter the number");
        int N = scanner.nextInt();		//INPUT
        scanner.close();
        if(N%2==1) {		//CONDITIONAL STATEMENT
        	System.out.println("Weird");}
        else if((N%2==0) && (N>20||N>2&&N<5)) {
        	System.out.println("Not Weird");}
        else if((N%2==0) && (6<N<<20)) {
        	System.out.println("Weird");
        }
        
        		
        	
        	
        	
        	
        	
        }
    
    
    
    
    }
    
    
    



