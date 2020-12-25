package name;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Project_Class {
	 
	public static void main(String[]args) throws Exception{
		
		java.io.File file = new java.io.File("E:/java oxygen/text.txt");
		if(!file.exists()) {
			System.out.println(file + " does not exist!");
			System.exit(0);
		}
		 
		
		// THis wont override the existing text inside txt file
		java.io.PrintWriter output = new java.io.PrintWriter(new FileOutputStream(file,true));
		
		output.print("Adding some more texts on the txt file.\n");
		output.println(777);
		
		output.close();
		
		Scanner scn = new Scanner(file);
		while(scn.hasNext()) {
			String print = scn.nextLine();
			System.out.println(print);
		}
		
		scn.close();
		
		
		}
		
	}
	
	

	





