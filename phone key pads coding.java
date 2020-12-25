import java.util.*;


public class Practise {

	public static void main(String[] args) {
		
		// The program reads letter, and outputs the corresponding number. Example if user enter a it outputs 2.
		// phone key pads coding.
		
	   Scanner scn = new Scanner (System.in);
	   System.out.print("Enter the letter: ");
	   
	   char letter = scn.next().charAt(0);
	  
	  scn.close();
	   
	   if(letter=='a' || letter == 'b' || letter == 'c'|| letter == 'A' || letter == 'B' || letter == 'C')
		   System.out.println("The corresponding number is 2 ");
	   
	   else if(letter=='d' || letter == 'e' || letter == 'f' || letter == 'D' || letter == 'E' || letter == 'F')
		   System.out.println("TThe corresponding number is 3 ");
	   
	   else if(letter=='g' || letter == 'h' || letter == 'i' || letter == 'G' || letter == 'H'|| letter == 'I')
		   System.out.println("The corresponding number is 4 ");
	   
	   else if(letter=='j' || letter == 'k' || letter == 'l' || letter == 'J' || letter == 'K' || letter == 'L')
		   System.out.println("The corresponding number is 5 ");
	   
	   else if(letter=='m'|| letter == 'n' || letter == 'o' || letter == 'M' || letter == 'N' || letter == 'O')
		   System.out.println("The corresponding number is 6 ");
	   
	   else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' || letter == 'P' || letter == 'Q' || letter == 'R')
		   System.out.println("The corresponding number is 7");
		   
	   else if (letter =='t' || letter == 'u' || letter == 'v' || letter == 'T' || letter == 'U'|| letter == 'V')
	   System.out.println("The corresponding number is 8");
	   
	   else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' || letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
	   System.out.println("The corresponding number is 9");
	   
	   
	   else 
		   System.out.println(letter + " is invalid input.");
	   
	   
	   
	
	   
	   
	   
	   
	   
	   
		 }
		
		
	}
	

