package name;
import java.util.*;

public class Project_Class {
	 
	public static void main(String[]args) throws Exception{
		int characterCount = 0;
		int words = 0;
		int lines =0;
		
		java.io.File file = new java.io.File("E:/java oxygen/text.txt");
		if(!file.exists()) {
			System.out.println(file + " does not exist!");
			System.exit(0);
		}
		 
		
		Scanner scn = new Scanner(file);
	
		
		while(scn.hasNextLine()) {
		
			lines++;
			String line = scn.nextLine();
			characterCount += line.length();
			words += new StringTokenizer(line, ", ").countTokens();
			
		}
		System.out.println("File " + file + " has");
		System.out.println(characterCount + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	
		
		
		scn.close();
		
		
		}
		
	}
	
	

	





