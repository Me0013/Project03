package io.learnstuff.project.Basic;

public class JavaDataTypes {
	
	public static void main(String[] args) { 
	
		//Data Types
		
		int myNum = 5;
		System.out.println(myNum); 
		
		float myFloat = 5.99f; 
		
		//By default 5.99 is double literal. To tell compiler to treat it as float explicitly -> use f or F.
		
		
		/*Data types are divided into two groups:

		Primitive data types - includes byte, short, int, long, float, double, boolean and char
		Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)*/
		
		
		// Numbers 
		
		/*

		Primitive number types are divided into two groups:
	
		Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. 
		Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
		
		Floating point types represents numbers with a fractional part, containing one or more decimals. 
		There are two types: float and double.
		
		Even though there are many numeric types in Java, the most used for numbers are int 
		(for whole numbers) and double (for floating point numbers). However, we will describe them 
		all as you continue to read.*/
		
			
			/*Byte 
		The byte data type can store whole numbers from -128 to 127. 
		This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127: */
			
			
			/* Int
		The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial,
		the int data type is the preferred data type when we create variables with a numeric value.	*/
				
			
			/* Floating Point Types
		The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
			 */
		
		float myNum1 = 5.75f;
		System.out.println(myNum1);
		
		
		double myNum2 = 19.99d;
		System.out.println(myNum2);
		
		
		/*  Use float or double?
		
		The precision of a floating point value indicates how many digits the value can have after the decimal point. 
		The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
		 Therefore it is safer to use double for most calculations. */
				
				
		/*Scientific Numbers
		A floating point number can also be a scientific number with an "e" to indicate the power of 10:*/


		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);

		
		/*  Boolean Types
		Boolean values are mostly used for conditional testing. => TRUE/FALSE*/
		
		/* !!!!! Type casting - convert the following double type (myDouble) to an int type:			*/	
		
		double myDouble = 9.78d;
		int myInt = (int)myDouble;
		System.out.println(myInt);
		
		
		/*Characters
		The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c' 	
		
		Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:*/
		
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		
		
				/*	Strings
		The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes ""
		
		The String type is so much used and integrated in Java, that some call it "the special ninth type".
		
		A String in Java is actually a non-primitive data type, because it refers to an object.
		The String object has methods that are used to perform certain operations on strings. */
		
		
		
		
				/*Non-Primitive Data Types
		Non-primitive data types are called reference types because they refer to objects.
		
		The main difference between primitive and non-primitive data types are:
		
		1. Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
		2. Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
		3. A primitive type has always a value, while non-primitive types can be null.
		4. A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
		5. The size of a primitive type depends on the data type, while non-primitive types have all the same size.
		
		Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.  */
				 
		
	}
	

}
