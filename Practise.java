import java.util.*;
public class Practise {

	public static void main(String[] args) {
		// It computes using three operators ^, &&, and || 
		
	   Scanner scn = new Scanner (System.in);
	   System.out.print("Enter an integer: ");
	   double computation = scn.nextDouble();
	   
	   
	  boolean first_computation = (computation%5==0 && computation%6==0);
		    System.out.println("Is " + computation + " is divisible by 5 and 6? " + first_computation );

	  boolean second_computation = (computation%5==0 || computation%6==0) ;
	  
	        System.out.println("Is " + computation + " is divisible by 5 or 6? " + second_computation );
	  
	  boolean third_computation = (computation%5==0 ^ computation%6==0);
            System.out.println("Is " + computation + " is divisible by 5 or 6, but not both? " + third_computation);
		   
		 }
		
		
	}
	

