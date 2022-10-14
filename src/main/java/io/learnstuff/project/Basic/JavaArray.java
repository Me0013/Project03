package io.learnstuff.project.Basic;

public class JavaArray {
	
	public static void main(String[] args) {
		
		/*Java Arrays
	Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
	
	To declare an array, define the variable type with square brackets:	string[] cars;	*/
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
			
		int[] myNum = {10, 20, 30, 40};
		
		
		/*Access the Elements of an Array
	You can access an array element by referring to the index number.
	
	This statement accesses the value of the first element in cars:*/
			
		
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		//System.out.println(cars2[0]);
		
		
		
		/* Change an Array Element 
	To change the value of a specific element, refer to the index number:	*/
		
		String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
		cars3[0] = "Opel";
		//System.out.println(cars3[0]);
		
		
		/*Array Length
	To find out how many elements an array has, use the length property:*/
		
		String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
		//System.out.println(cars4.length);
		
		
		/*Loop Through an Array
	You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.
	
	The following example outputs all elements in the cars array:*/
		
		String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars5.length; i++) {
		 // System.out.println(cars5[i]);
		}
		
		
		/*Multidimensional Arrays
	A multidimensional array is an array of arrays.
	
	To create a two-dimensional array, add each array within its own set of curly braces:*/
		int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7} };
		
		/*myNumbers is now an array with two arrays as its elements.

	To access the elements of the myNumbers array, specify two indexes: one for the array, 
	and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:*/
		
		int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers2[1][2];
		//System.out.println(x); 
		
		//We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
		
		
	    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }
	  }
	
		
	}

