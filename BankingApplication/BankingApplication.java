/*JAVA PROGRAM FOR BANKING APPLICATION
 * 1.CREATE A class named BANKCLASS
 * 2.INITIALIZE BALANCE,DEPOSIT,WITHDRAWN,PREVIOUS TRANSACTION,CUSTOMER NAME,CUSTOMER ID
 * 3.NOW WE CREATE A FUNCTION DEPOSIT AND INITIALIZE AMOUNT AS ITS PARAMETER
 * 4.AFTER THAT WE CREATE A WITHDRWAN FUNCTION AND TAKE AMOUNT AS ITS PARAMETER
 * 5.NOW WE CREATE A PREVIOUS TRANSACTION FUNCTION AND CHECK WHETHER THE TRANSACTION IS DEPOSITED OR WITHDRAWN
 * 6.THEN CREATE A FUNCTION OF SHOW MENU FOR THE USER AND TAKE INPUT FROM USER
 * 7.IN SH0W MENU FIRSTLY WE CREATE A WELCOME MESSAGE FOR THE USER AND THEN WE WILL CRAETE THE 5 OPTION FOR USER TO CHECK HIS BALANCE,PREVIOUS TRANSACTION.DEPOSIT AMOUNT,WITHDRWAN AMOUNT AND EXIT 
 * 8.FOR WELCOME MESSAGE WE WILL CREATE A CONSTRUCTOR AND PASSING THE CUSTOMER NAME AND ID AS ITS PARAMETER 
 * 9.FOR THE SHOW MENU OPTION FIRSTLY WE WILL USE CHAR OPTION AND THEN WE WILL USE DO WHILE LOOP.
 * 10.FINALLY PRINT THE RESULT
 */
package bankingApplication;
import java.util.*;
public class BankingApplication {

	public static void main(String[] args) {
		bankAccount UBI=new bankAccount("Hitesh", "UBI00531");  //user detail
		UBI.showMenu();
	}
	}

class bankAccount{	// Bank class
	int balance;
	int previousTransaction;
	String CustName;
	String CustId;
	
	bankAccount(String custName,String custId){		//constructor for welcome message
		this.CustName=custName;
		this.CustId=custId;
		}
	void deposit(int amount) {		//deposit function
		if(amount!=0) 
			balance=balance+amount;
			previousTransaction=amount;	
		}
	void withdrawn(int amount) {	//withdrawn function
		if(amount!=0) 
			balance=balance-amount;
			previousTransaction=-amount;
		}
		
	void getPreviousTransaction() {	//previous transaction function
		if(previousTransaction>0)
			System.out.println("Deposited : "+previousTransaction);
		else if(previousTransaction<0)
			System.out.println("Withdrwan : "+Math.abs(previousTransaction));
		else
			System.out.println("No Transaction Occured");
			}
		
	void showMenu() {				//show menu function
			
	char option='\0';
	Scanner sc= new Scanner(System.in);		//input from user
			
		System.out.println("Welcome " +CustName);
		System.out.println("Your ID is "+CustId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit Amount");
		System.out.println("C. Withdrawn Amount");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
			
		do {						//do while loop
			System.out.println("=============================================");
			System.out.println("Enter the option");
			System.out.println("==============================================");
			option=sc.next().charAt(0);
			
			
		switch(option) {
			
		case 'A':
			System.out.println("Balance : "+balance);
			break;
				
		case 'B':
			System.out.println("Enter the amount to deposit");
			int amount=sc.nextInt();
			deposit(amount);
			break;
				
		case 'C':
			System.out.println("Enter the amount to witdrawn");
			int amount2=sc.nextInt();
			withdrawn(amount2);
			break;
				
		case 'D':
			getPreviousTransaction();
			break;
				
		case 'E':
			break;
				
		default:
			System.out.println("This is an inavalid option!! please try again");
			break;
			}
			}
		while(option!='E');
			System.out.println("Thank you for using our bank services");
		}
	}
				
