import java.util.*;

// Calculating the score using void method. 
 class Practise {
 
  
	public static void main(String[] args) {
	    
	Scanner scn = new Scanner (System.in);
	System.out.print("Enter your score: ");
	double EvaluateScore = scn.nextDouble();
	
	
	System.out.println("The grade is ");
	getGrade(EvaluateScore);
	
		
	
	}
	public static void getGrade(double score) {
			
			if(score>=90.0)
			   System.out.println('A');
			else if (score>=80.0)
				System.out.println('B');
			else if (score>=70.0)
				System.out.println('C');
			else if (score>=60.0)
				System.out.println('D');
			else 
				System.out.println('F');
		}
	    
	}
		
	
 
	
	

