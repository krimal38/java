
import java.util.*;
/*
 * selection sort
 */

public class Project_Class {
public static int[] sorting(int [] A) {
		
		for(int i =0; i<A.length-1; i++) {
			int minIndex = i;
			
			for(int j=i+1; j<A.length; j++) {
				if(A[j]< A[minIndex]) minIndex = j;	
			}
			int temp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
		}
		return A;
		
	}
	public static void printArray(int[] A) {
		for(int i =0; i<A.length; i++) {
		 System.out.print(A[i] + " ");	
			
		}
		
		
	}
	public static void main (String [] args) {
		int [] array = new int[5];
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter unsorted numbers: ");
	for(int i =0; i<array.length; i++) {
		
		array[i] = scn.nextInt();	
	}
			
	System.out.println("The sorted numbers are: ");
	sorting(array);
	printArray(array);
	
	}	
	
} 
	
	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
