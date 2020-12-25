
import java.util.*;
/*
 * Bubble sort
 */

public class Project_Class {
	
	public static int[] BubbleSort(int[] sortingAlgorithm) {
		
		for(int i =0; i<sortingAlgorithm.length-1; i++) {
			for (int j =0; j< sortingAlgorithm.length-1-i; j++) {
				
				if(sortingAlgorithm[j] > sortingAlgorithm[j+1]) {
					
					int temp = sortingAlgorithm[j+1];
					sortingAlgorithm[j+1] = sortingAlgorithm[j];
					sortingAlgorithm[j] = temp; 		
					
				}
				
			}
				
		
		}
		return sortingAlgorithm;
		
	}
	
	public static void printArray(int [] print) {
		for(int i =0; i<print.length; i++) {
			System.out.print(print[i] + " ");
		}
		
		
	}
	
	 public static void main (String[]args) {
			Scanner scn = new Scanner (System.in);
			
			int[] list = new int[5];
			
			System.out.println("Enter unsorted array: ");
			for(int i =0; i<list.length; i++) {
				list[i] = scn.nextInt();
			}
			System.out.println("The sorted number: ");
			
			BubbleSort(list);
			printArray(list);
			
			
		}
} 
	
	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
