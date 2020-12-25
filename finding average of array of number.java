/**
 * Assign grades
 * 
 * 
 */

import java.util.*;

public class Project_Class {
	
	public static int average (int[]array) {
		int store =0;
		for(int i =0; i<array.length; i++) {
		 store += array[i];
		
		}
		int average = store/2;
		return average;
		
		
	}
	public static double average(double[] array) {
		double store =0;
		for(int i =0; i<array.length; i++) {
		 store += array[i];
		
		}
		double average = store/2;
		return average;
		
	}
	
	
	public static void main(String[]args) {
	
		double[] array_list = new double[10];
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Input 10 double values: ");
		
		for(int i =0; i<array_list.length; i++) {
			
			array_list[i] = scn.nextDouble();
			
			
		}
		
		for(int i =0; i<array_list.length; i++) {
			
		}
		
		System.out.println("The average of 10 numbers are: " + average(array_list));
		scn.close();
		
	
		}
		
		
				
			
			
		


		
		
	
}
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
