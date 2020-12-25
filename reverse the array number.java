/**
 * Assign grades
 * 
 * 
 */

import java.util.*;

public class Project_Class {
	
	public static void main(String[]args) {
		int[] list = new int[10];
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		
		for(int i =0; i< list.length; i++) { // user input 10 array of numebers.
			list[i] = scn.nextInt();
		}
		
		
	for(int j = list.length-1; j >=0; j--) { // used to traverse the given 10 array of number.
		System.out.println(list[j]);
	}
		
		
		
		
	}	
	
}	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
