package oops;

public class Class {

	
		private String className;
	    private int classStrength;

	    // Constructor to initialize the attributes
	    public Class(String className, int classStrength) {
	        this.className = className;
	        this.classStrength = classStrength;
	    }

	    // Getter method for className
	    public String getClassName() {
	        return className;
	    }

	    // Setter method for className
	    public void setClassName(String className) {
	        this.className = className;
	    }

	    // Getter method for classStrength
	    public int getClassStrength() {
	        return classStrength;
	    }

	    // Setter method for classStrength
	    public void setClassStrength(int classStrength) {
	        this.classStrength = classStrength;
	    }

	    // Method to display class details
	    public void displayClassDetails() {
	        System.out.println("Class Name: " + className);
	        System.out.println("Class Strength: " + classStrength);
	    }

	    // Main method to test the Class class
	    public static void main(String[] args) {
	        // Create a new Class object
	        Class myClass = new Class("Mathematics", 30);

	        // Display class details
	        myClass.displayClassDetails();

	        // Modify class details
	        myClass.setClassName("Science");
	        myClass.setClassStrength(35);

	        // Display updated class details
	        myClass.displayClassDetails();
	    }
	
	}


