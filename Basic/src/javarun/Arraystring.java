package javarun;

public class Arraystring {
   public static void main(String[] args) {
		        // Create an array of strings
		        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
		        
		        // Display all elements in the array
		        System.out.println("Fruits in the array:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }
		        
		        // Access a specific element in the array using an index
		        int index = 2; // Cherry
		        System.out.println("\nFruit at index " + index + ": " + fruits[index]);
		        
		        // Use a string operation (e.g., concatenation)
		        String extraFruit = "Grapes";
		        String newFruitList = fruits[0] + ", " + fruits[1] + ", " + fruits[2] + ", " + extraFruit;
		        System.out.println("\nNew Fruit List: " + newFruitList);
		        
		        // Searching for a string in the array
		        String searchFruit = "Banana";
		        boolean found = false;
		        for (String fruit : fruits) {
		            if (fruit.equals(searchFruit)) {
		                found = true;
		                break;
		            }
		        }
		        
		        if (found) {
		            System.out.println("\n" + searchFruit + " is in the array.");
		        } else {
		            System.out.println("\n" + searchFruit + " is not in the array.");
		        }
		    }
		

	}


