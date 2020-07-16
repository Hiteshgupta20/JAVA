/*PROGRAM TO MAKE A CALCULATOR USING SWITCH CONDITION
 * 1.READ 2 NUMBERS FROM USER AND STORE IT AS DOUBLE
 * 2.READ THE OPERATOR FROM USER ("+,-,*,/")
 * 3.USING SWITCH CREATE THE FOLLOWING CASES: "+", "-", "*","/"
 * 4. PRINT THE RESULT
 */
package dataTypes;
import java.util.*;
public class Calculator_using_switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers ");
		double num1 =sc.nextDouble(); 	//INPUT 1ST NUMBER
		double num2=sc.nextDouble();	//INPUT 2ND NUMBER
		System.out.println("input the operator : " + "either +, -, *, or /"  );	//INPUT OPERATOR
		String operator = sc.next();
		switch(operator) { // SWITCH CONDITION
		case "+":
			System.out.println("result : " +(num1+num2));
			break;
		case "-":
			System.out.println("result : " +(num1-num2));
			break;
		case "*":
			System.out.println("result : " +(num1*num2));
			break;
		case "/":
			System.out.println("result : " +(num1/num2));
			break;
		}
		
	}

}
