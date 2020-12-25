import java.util.*;

 class Practise {
 

// Approximation of the square root, Babylonian method.
	public static void main(String[] args) {		
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the square root number: " );
		System.out.println("Enter the guess: ");
		long SquareRootNumber = scn.nextLong();
		long guess1 = scn.nextLong();
		
		double a = sqrt(SquareRootNumber,guess1);
		System.out.println("The approx is " + a);
	scn.close();
	}	

	public static double sqrt(long SquareRoot, long LastGuess){
		long NextGuess =0;
		do{
			NextGuess = (LastGuess + (SquareRoot/LastGuess))/2;
			
			if(NextGuess - LastGuess < 0.001){
				return NextGuess;
			}else{ 
			NextGuess= LastGuess;
			LastGuess++;
			}
				
			} while(true);
			
			
			
		} 
		
		
		
		}
		
		
 
		
		
 		

