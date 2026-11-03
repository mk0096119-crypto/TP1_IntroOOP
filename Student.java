package tp2;

public class Student {

	    // Attributes

	    String name;

	    int id;

	    String major;

		public String email;

	    // Method

	    public void displayInfo() {

	        System.out.println("Student Name: " + name);

	        System.out.println("Student ID:"  + id);

	        System.out.println("Major: " + major);
	        
	        System.out.println("Email: " + email);

	        System.out.println("---------------------");

	    }
	    public void study() {
	        System.out.println("The student " + name + " is currently studying OOP.");
	    }
	}

