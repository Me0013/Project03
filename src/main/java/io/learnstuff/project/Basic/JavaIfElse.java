package io.learnstuff.project.Basic;

public class JavaIfElse {
	
	public static void main(String[] args) {
		
		/*Java Conditions and If Statements		
		Java has the following conditional statements:	*/

			//Use if to specify a block of code to be executed, if a specified condition is true
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
			
			//Use else to specify a block of code to be executed, if the same condition is false
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
	
		
			//Use else if to specify a new condition to test, if the first condition is false
		
		int time1 = 22;
		if (time1 < 10) {
		  System.out.println("Good morning.");
		} else if (time1 < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		
			//Use switch to specify many alternative blocks of code to be executed
		
		
		/*Short Hand If...Else
		 
	There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

	It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
			variable = (condition) ? expressionTrue :  expressionFalse;
	*/
		
		int time2 = 20;
		String result = (time2 < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
	
	}

}
