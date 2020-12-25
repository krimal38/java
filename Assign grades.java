/**
 * Assign grades
 * 
 * 
 */

import java.util.*;

public class Project_Class {
	
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the  number of students: ");
		int students = scn.nextInt();
		
		int[] grades = new int[students];
		
		for(int i =0; i<students; i++) {
			System.out.println("Enter score: ");
			grades[i] = scn.nextInt();
		}
		CalculateEverything(grades);
		
	}	
	
	public static void CalculateEverything(int[] grade) { // Calculate everything
		calulateGrade(grade);
		for(int i =0; i<grade.length; i++) {
			
			System.out.println("Student " + i + " score is " + grade[i] + " and grade is " + CheckChar(grade[i]));
		}
		
	}
	
	
	public static char CheckChar(int score) { // Method used to check grades
		
		if(score >= 90)
			return 'A';
		else if (score >= 80 )
			return 'B';
		else if (score >= 70)
			return 'C';
		else if (score >= 60 )
			return 'D';
		else 
			return 'F';
			
		
	}
	
	public static int calulateGrade(int[]grade) { // Method used to check score
		int highscore = grade[0];
		for (int grades : grade) {
		if(highscore > grades) {
			highscore = grades;
		}
			  
			
			
		}
		return highscore;
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
