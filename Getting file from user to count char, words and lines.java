package name;
import java.io.IOException;
import java.util.*;

public class AnotherClass{
	public static void main(String[] args) throws IOException {
		int characterCount = 0;
		int words = 0;
		int lines =0;
		Scanner scn = new Scanner(System.in);
		System.out.println("File to be read: ");
		String inputFile = scn.next();
				
		java.io.File file = new java.io.File(inputFile);
		Scanner in = new Scanner(file);
		
		
		while(in.hasNextLine()) {
			lines ++;
			String line = in.nextLine();
			characterCount += line.length();
			words += new StringTokenizer(line, ", ").countTokens();
		}
		System.out.println(characterCount + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
		
		in.close();
		scn.close();
		
	}
	
 }




