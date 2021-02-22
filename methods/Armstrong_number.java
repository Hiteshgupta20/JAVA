package javaPrograms;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt(), originalNumber, remainder, result = 0;

		//Store user input into original number bcz at the end we have to comapare the number with original number
        originalNumber = number;
        //Count no of digits
        int length = String.valueOf(number).length();
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, length);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}