package javarun;

public class Start {

	public static void main(String[] args) {
		// Variables of different data types
        int num1 = 10;                  // Integer data type
        double num2 = 5.5;              // Double data type
        float num3 = 3.2f;              // Float data type
        char letter = 'A';              // Character data type
        String message = "Hello Java";  // String data type
        boolean isJavaFun = true;       // Boolean data type

        // Arithmetic operators
        int sum = num1 + (int) num2;    // Adding int and double (casting double to int)
        double product = num2 * num3;   // Multiplying double and float
        float division = num3 / (float) num1;  // Dividing float by int (casting int to float)

        // Relational operators
        boolean isGreater = num1 > num2;  // Checking if num1 is greater than num2
        boolean isEqual = num2 == num3;   // Checking if num2 is equal to num3

        // Logical operator
        boolean result = isJavaFun && isGreater; // Combining boolean values using AND operator

        // Concatenation operator for Strings
        String combinedMessage = message + " - The sum is " + sum + " and product is " + product;

        System.out.println("Sum (int + double): " + sum);
        System.out.println("Product (double * float): " + product);
        System.out.println("Division (float / int): " + division);
        System.out.println("Is num1 greater than num2? " + isGreater);
        System.out.println("Is num2 equal to num3? " + isEqual);
        System.out.println("Result of logical AND (isJavaFun && isGreater): " + result);
        System.out.println("Combined message: " + combinedMessage);
    
	}

}
