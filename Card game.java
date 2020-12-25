
import java.util.*;
/*
 * CArd game. Keeps on adding until the sum of 4 numbers generated from random generator is 24. 
 * 
 */

public class Project_Class {
		
	public static void main(String[] args) {
		int[] deck = new int[4]; // picks 4 random cards and compute their sum.
		
		int return_type=CardGame(deck);
	//while(return_type != 24)
		//return_type=CardGame(deck); // this is to force to make it 24
		
		if(return_type == 24) {
			PrintArray(deck);
		}else
			System.out.println("You got the sum of " + return_type);
		
	
		
	}
	public static void PrintArray(int[] printArray) {
		System.out.println("This sum gives you 24");
		for(int i =0; i<printArray.length; i++) {
			if(printArray[i] == 1)
				System.out.print("Ace ");
			else if(printArray[i] == 13)
				System.out.print("King ");
			else if(printArray[i] == 12)
				System.out.print("Queen ");
			else if(printArray[i] == 11)
				System.out.print("Jack ");
			else 
				System.out.print(printArray[i] + " ");
		}
		
		
	}
	public static int CardGame(int[] cards) {
		int sum =0;
		Random randomPick = new Random();
		
		for(int i=0; i<cards.length; i++)
		{
			cards[i] = randomPick.nextInt(52) +1;
			sum += cards[i];
		}
		return sum;
	}
}	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
