import java.util.*;


public class Practise {

	public static void main(String[] args) {
		
		// Student major and status.
		// The program ask the user to enter the first letter of their major and number which shows the year of the student.
		
	   Scanner scn = new Scanner (System.in);
	   System.out.println("Enter one letter for your major: ");
	   System.out.println(" Enter one digit for your college level: ");
	     char major = scn.next().charAt(0);
	   int number = scn.nextInt();
	
	   if (major == 'M')
	    	System.out.print("Mathamatics");
	    else if (major == 'C')
	    	System.out.print("Computer Science");
	    else if (major == 'I')
	    	System.out.print("Information technology");
	    else 
	    	System.out.print("invalid input");
	   
	   
	  
	   
              switch(number){
              case 1 :
            	  System.out.print(" Freshman");break;
              case 2:
            	  System.out.print(" sophomore");break;
              case 3:
            	  System.out.print(" junior");break;
              case 4:
            	  System.out.print(" senior");break;
            	 default:
            		 System.out.print("Invalid input");
              }
	  
scn.close();
	 
	   
		 }
		
		
	}
	

