import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Practise {

	public static void main(String[] args) {
		// converting a user input letter into number using scn.next().charAt();
		
		
	   Scanner scn = new Scanner (System.in);
	   System.out.print("Enter a letter grade in uppercase letter: ");
	   char letter = scn.next().charAt(0);
	  scn.close();
	   
	   if(letter=='A')
		   System.out.println("The numeric value for grade A is 4. ");
	   else if(letter=='B')
		   System.out.println("The numeric value for grade B is 3. ");
	   else if(letter=='C')
		   System.out.println("The numeric value for grade C is 2. ");
	   else if(letter=='D')
		   System.out.println("The numeric value for grade A is 1. ");
	   else if(letter=='E')
		   System.out.println("The numeric value for grade A is 0. ");
	   
	   else System.out.println(letter + " is and invalid grade. ");
	   
	   
	   
	   
	   
	   
		 }
		
		
	}
	

