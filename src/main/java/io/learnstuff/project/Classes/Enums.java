package io.learnstuff.project.Classes;

public class Enums {
	
			/*Enums
		An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
		
		To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
		
		Example
		enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
		You can access enum constants with the dot syntax:
		
		Level myVar = Level.MEDIUM;
		Enum is short for "enumerations", which means "specifically listed".
		
		Enum inside a Class
		You can also have an enum inside a class:
		
		Example
		public class Main {
		  enum Level {
		    LOW,
		    MEDIUM,
		    HIGH
		  }
		
		  public static void main(String[] args) {
		    Level myVar = Level.MEDIUM; 
		    System.out.println(myVar);
		  }
		}
		The output will be:
		
		MEDIUM
		Enum in a Switch Statement
		Enums are often used in switch statements to check for corresponding values:
		
		Example
		enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
		
		public class Main {
		  public static void main(String[] args) {
		    Level myVar = Level.MEDIUM;
		
		    switch(myVar) {
		      case LOW:
		        System.out.println("Low level");
		        break;
		      case MEDIUM:
		         System.out.println("Medium level");
		        break;
		      case HIGH:
		        System.out.println("High level");
		        break;
		    }
		  }
		}
		The output will be:
		
		Medium level*/

}
