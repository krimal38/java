import java.util.*;

// Calculating the score using caller method. 
 class Practise {
 
  
	public static void main(String[] args) {
	    
	Scanner scn = new Scanner (System.in);
	System.out.print("Enter your score: ");
	double EvaluateScore = scn.nextDouble();
	
	
	System.out.println(getGrade(EvaluateScore));
	
		
		scn.close();
	}
	public static char getGrade(double score) {
			
			if(score>=90.0)
			   return 'A';
			else if (score>=80.0)
				return 'B';
			else if (score>=70.0)
				return 'C';
			else if (score>=60.0)
				return 'D';
			else 
				return 'F';
		}
	    
	}
		
	
 
	
	

