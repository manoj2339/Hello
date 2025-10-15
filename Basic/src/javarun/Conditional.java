package javarun;

import java.util.Scanner;

public class Conditional {

	
		    public static void main(String[] args) {
		        
		        // Creating a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // Asking for a number input
		        System.out.print("Enter a number between 1 and 10: ");
		        int number = scanner.nextInt();
		        
		        // Using the if statement
		        if (number > 0) {
		            System.out.println("The number is positive.");
		        }

		        // Using if-else statement
		        if (number % 2 == 0) {
		            System.out.println("The number is even.");
		        } else {
		            System.out.println("The number is odd.");
		        }

		        // Using else-if ladder
		        if (number == 1) {
		            System.out.println("The number is one.");
		        } else if (number == 5) {
		            System.out.println("The number is five.");
		        } else if (number == 10) {
		            System.out.println("The number is ten.");
		        } else {
		            System.out.println("The number is neither 1, 5, nor 10.");
		        }

		        // Using switch statement
		        switch (number) {
		            case 1:
		                System.out.println("The number is exactly one.");
		                break;
		            case 2:
		                System.out.println("The number is exactly two.");
		                break;
		            case 3:
		                System.out.println("The number is exactly three.");
		                break;
		            case 4:
		                System.out.println("The number is exactly four.");
		                break;
		            case 5:
		                System.out.println("The number is exactly five.");
		                break;
		            default:
		                System.out.println("The number is not between 1 and 5.");
		                break;
		        }
		        
		        // Closing the scanner to prevent resource leak
		        scanner.close();

	}

}
