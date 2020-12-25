import java.util.*;


public class Practise {

	public static void main(String[] args) {
// Generating random number to guess for the user.  
		
		
	int guess = (int)(Math.random()*10);
	
	Scanner scn = new Scanner(System.in);
	System.out.print("Guess the magic number between 0 to 100 ");
	int number = scn.nextInt();
		
	while (number!= guess){
		System.out.print("Enter the guess:");
	number = scn.nextInt();
	if (number == guess)
	System.out.println("Yes, the number is " + guess);
	else if(number>guess)
		System.out.println("You're guess is too high " + number );
	else 
		System.out.println("You're guess is too low " );
	
	}
		
	scn.close();
	}
}	

