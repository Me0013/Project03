package io.learnstuff.project.Classes;

public class JavaClassAttributes {
	
		/*Java Class Attributes
	In the previous chapter, we used the term "variable" for x in the example (as shown below). 
	It is actually an attribute of the class. Or you could say that class attributes are variables within a class:*/

		/*Accessing Attributes
	You can access attributes by creating an object of the class, and by using the dot syntax (.):

	The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:*/
	
		/*int x = 10;
		final int a = 10;*/ 
	
		/*public static void main(String[] args) {
		
		JavaClassAttributes myObj = new JavaClassAttributes();
		
		//Modify Attributes or override existing values
		
		myObj.x = 30; 
		System.out.println(myObj.x);
	
		
		//If you don't want the ability to override existing values, declare the attribute as final
		
		System.out.println(myObj.a);
		
			/*Multiple Objects
	If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:*/
		
		//constructor 
		String fname = "John";
		String lname = "Doe";
		int age = 24;

		  public static void main(String[] args) {
			  JavaClassAttributes myObj2 = new JavaClassAttributes();
		    System.out.println("Name: " + myObj2.fname + " " + myObj2.lname);
		    System.out.println("Age: " + myObj2.age);
		  }
}
