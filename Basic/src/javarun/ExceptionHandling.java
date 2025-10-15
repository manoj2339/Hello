package javarun;

public class ExceptionHandling {

	public static void main(String[] args) {
		  
		        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
		        
		        try {
		            // Attempt to access an element in the array (possible exception)
		            System.out.println("Accessing element at index 5: " + fruits[5]);  // Out of bounds index
		            
		            // Attempt to perform a division by zero
		            int result = 10 / 0;  // ArithmeticException
		            System.out.println("Result of division: " + result);
		            
		            // String manipulation that could potentially throw an exception
		            String str = null;
		            System.out.println("Length of string: " + str.length());  // NullPointerException
		            
		        } catch (ArrayIndexOutOfBoundsException e) {
		            // Catch the ArrayIndexOutOfBoundsException and handle it
		            System.out.println("Error: Invalid index. The array does not have that element.");
		            
		        } catch (ArithmeticException e) {
		            // Catch the ArithmeticException and handle it
		            System.out.println("Error: Cannot divide by zero.");
		            
		        } catch (NullPointerException e) {
		            // Catch the NullPointerException and handle it
		            System.out.println("Error: Attempt to call a method on a null object.");
		            
		        } catch (Exception e) {
		            // Catch any other exceptions not caught by previous blocks
		            System.out.println("An unexpected error occurred: " + e.getMessage());
		            
		        } finally {
		            // The 'finally' block runs regardless of whether an exception occurred or not
		            System.out.println("Execution finished. Cleanup can be done here.");
		        }
		    }

	}


