import java.util.*;

// Financial application: compound value
// page 197 from introduction to java programming.
 class Practise {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount:");
        System.out.println("Enter the annual intrest rate: ");
	    System.out.println("Enter the number of months: ");
		
	    double amount = scn.nextDouble();
	    double rate = scn.nextDouble();
	    double months = scn.nextDouble();
	    
	    double change_rate = (rate/100);
	    double MonthlyIntrestRate = (change_rate/months);
	    
	   final double constant = (1+MonthlyIntrestRate);
	
	   double calculateFirstIntrestRate = amount * (constant) ;
	   
	   for(int i=1; i<months; i++){
		  
		   calculateFirstIntrestRate = (amount + calculateFirstIntrestRate) *(constant);
		
		   
	   }
	
	    
	   System.out.printf("The saving amount is %.3f", calculateFirstIntrestRate);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
		
	
 }	
	
	

