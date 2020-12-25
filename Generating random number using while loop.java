import java.util.*;


public class Practise {

	public static void main(String[] args) {
// Generating random number and adding two numbers using while loop. 
		
		
	int number1 = (int)(Math.random()*10);
	int number2 = (int )(Math.random()*10);
	
	
	Scanner scn = new Scanner(System.in);

	System.out.println("What is " + number1 + " and " + number2 + "?");
	int answer = scn.nextInt();
		
	while(number1 + number2 != answer){
		
		System.out.println("Not correct. Try again!!! What is " + number1 + " and " + number2 + "?");
		answer = scn.nextInt(); // stops the loop 
		
	}
	System.out.println("Correct answer");	
	scn.close();
	}
}	

