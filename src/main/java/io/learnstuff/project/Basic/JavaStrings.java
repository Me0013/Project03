package io.learnstuff.project.Basic;

public class JavaStrings {
	public static void main(String[] args) {
		
		/* Strings
	
		String Length
	A String in Java is actually an object, which contain methods that can perform certain operations on strings. 
	For example, the length of a string can be found with the length() method: */
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		
		/*There are many string methods available, for example toUpperCase() and toLowerCase(): */
		
		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt2.toLowerCase());   // Outputs "hello world"
		
		/*	Finding a Character in a String
	The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):	*/

		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate")); // Outputs 7
		
		
		/*	String Concatenation
	The + operator can be used between strings to combine them. This is called concatenation:
	You can also use the concat() method to concatenate two strings:*/
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		//Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
		
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName1.concat(lastName1));
		
		
		/* Numbers and Strings	
	Java uses the + operator for both addition and concatenation.

	Numbers are added. Strings are concatenated.
	
	If you add a number and a string, the result will be a string concatenation:*/ 
		
		
		String x = "10";
		int y = 20;
		String z = x + y;  // z will be 1020 (a String)
		
		System.out.println(z);
		
		
		/* Strings - Special Characters
		 
		  Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
		  The solution to avoid this problem, is to use the backslash escape character.
		  
		  
		  
		Escape character	Result		Description
			\'					'		Single quote
			\"					"		Double quote
			\\					\		Backslash
			
			Code	Result	
			\n		New Line	
			\r		Carriage Return	
			\t		Tab	
			\b		Backspace	
			\f		Form Feed
		 
		 
		 * */ 
		
		
		
		
		
		
		
	}

}
