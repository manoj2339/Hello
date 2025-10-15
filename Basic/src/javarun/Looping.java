package javarun;

public class Looping {

	public static void main(String[] args) {
		
		        
		        // Using for loop
		        System.out.println("For Loop Example (1 to 5):");
		        for (int i = 1; i <= 5; i++) {
		            System.out.println("Iteration " + i);
		        }
		        
		        // Using while loop
		        System.out.println("\nWhile Loop Example (5 to 1):");
		        int j = 5;
		        while (j >= 1) {
		            System.out.println("Iteration " + j);
		            j--;  // Decrementing j
		        }
		        
		        // Using do-while loop
		        System.out.println("\nDo-While Loop Example (1 to 3):");
		        int k = 1;
		        do {
		            System.out.println("Iteration " + k);
		            k++;  // Incrementing k
		        } while (k <= 3);
		        
		    }
		

	}


