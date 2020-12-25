import java.util.*;

// pentagonal numbers using method.
 class Practise {
 
  
	public static void main(String[] args) {
	System.out.println("The fisrt 100 numbers are: ");
	for (int i = 1; i<101; i++){
		System.out.printf("%7d", getPentagonalNumber(i));
		if(i%10==0)
			System.out.println();
	}
		
		
	}
	
	
	public static int getPentagonalNumber(int n){
		return (n*(3*n-1)/2);
		
	}
 }	
 
	
	

