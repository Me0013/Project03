package io.learnstuff.project.FileHandling;

public class Delete {
			/*Delete a File
		To delete a file in Java, use the delete() method:
		
		Example
		import java.io.File;  // Import the File class
		
		public class DeleteFile {
		  public static void main(String[] args) { 
		    File myObj = new File("filename.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
		  } 
		}
		The output will be:
		
		Deleted the file: filename.txt
		ADVERTISEMENT
		
		ADVERTISEMENT
		
		ADVERTISEMENT
		
		Delete a Folder
		You can also delete a folder. However, it must be empty:
		
		Example
		import java.io.File; 
		
		public class DeleteFolder {
		  public static void main(String[] args) { 
		    File myObj = new File("C:\\Users\\MyName\\Test"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the folder: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the folder.");
		    } 
		  } 
		}
		The output will be:
		
		Deleted the folder: Test
		*/
}
