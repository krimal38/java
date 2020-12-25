import java.util.*;
public class Project {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String user_input = scn.nextLine();
       boolean var = character_checker(user_input);
       boolean var1 = LettersOrDigits(user_input);
      if(var == true && var1 == true)
    	  System.out.println("Valid password.");
      else 
    	  System.out.println("Invalid Password.");
       
       
       
       
 
	}
	public static boolean character_checker(String password){
		
		if(password.length()>=8){
			return true;
		} else{
			return false;
		}
			
	}
	
	
	public static boolean LettersOrDigits(String password){
		
		if(password.matches("[a-zA-z0-9]+")){
			return true;
		}
		else return false;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	


