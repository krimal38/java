import java.util.*;

// The program is to add the sum of series which is 1/3 + 3/5 + 5/7 + 7/9 +....+ n/n
 class Practise {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value of N, or how many numbers you want to calculate: ");
		double userinput = scn.nextDouble();
		double sum = 0;
		for(double i = 1.0 ; i<=userinput; i++){
			sum = sum + ((2*i-1)/(2*i+1));
			
			
		}
		System.out.println("The sum is " + sum);
				
					}

	
		
	}
		
		
	
	
	

