
import java.util.*;
/* this program takes the students name and their score from the user, and sort the name according to the alphabet. 
 * I used the build in class sorting technique to sort the name of the students. 
 */

public class Project_Class {

	
	public static void main (String[]args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int length= scn.nextInt();
		
		String[] array_name = new String[length];
		int[] score = new int[length];
		
		for(int i =0; i< length; i++) {
			System.out.println("Enter the name of the student"+(i+1)+":");
			array_name[i] = scn.next();	
			System.out.println("Enter the student's grade: ");
			score[i] = scn.nextInt();
		}
		sort(array_name); // return method
		
		System.out.println("The sorted form is: ");// array used for print statement.
		for(int i =0; i<length; i++ ) {
			System.out.println("Name: "+ array_name[i] + " --- and score is: " + score[i]);
		}
		
	} 
	
	
	public static String[] sort(String[] names) {
		
		Arrays.sort(names);
			
			return names; 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
