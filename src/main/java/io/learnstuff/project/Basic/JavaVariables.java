package io.learnstuff.project.Basic;

public class JavaVariables {
	
	public static void main(String[] arg) {
		
		System.out.println("There are different types of variables: ");
		System.out.println("1. String - stores text, such as \"Hello\". String values are surrounded by double quotes");
		System.out.println("2. int - stores integers (whole numbers), without decimals, such as 123 or -123");
		System.out.println("3. float - stores floating point numbers, with decimals, such as 19.99 or -19.99");
		System.out.println("4. char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes");
		System.out.println("5. boolean - stores values with two states: true or false");
		
		System.out.println("Declare: type(int) variableName(Sum) = value; ");
		
		System.out.println("How to use quotes in a String => String name = \"John\";  ");
		
		/*Declare:*/ 
		int myNumber;  
		myNumber = 15; 
		myNumber = 20; // myNum is now 20.  
		
		final int myNum = 40;  // constant  
		
		String name = "John";
		System.out.println("Hello " + name);
		
		
		String firstName = "John ";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		//Declare Multiple Variables 
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);
		
		
		//One Value to Multiple Variables
	
		int a, b, c;
		a = b = c = 50;
		System.out.println(a + b + c);
		
		
		//Identifiers
		
		
		System.out.println("All Java variables must be identified with unique names. ");
		
		System.out.println("It is recommended to use descriptive names in order to create understandable and maintainable code.");
		
		
		// Good
		int minutesPerHour = 60;

		// OK, but not so easy to understand what m actually is
		int m = 60;
		
	}

}
