package io.learnstuff.project.Basic;

public class JavaBooleans {

	public static void main(String[] args) {
		
		/*	
		Boolean Values
	A boolean type is declared with the boolean keyword and can only take the values true or false	
		
		Boolean Expression
	A Boolean expression is a Java expression that returns a Boolean value: true or false
	This is useful when we want to compare values to find answers.
		*/
		
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
		
		//we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18:
		
		
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);
	}
	
}
