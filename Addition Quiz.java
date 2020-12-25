package name;

import java.util.ArrayList;

import java.util.*;

public class CS_202 {
	
	public static void main(String[]args) {
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		
		System.out.println("Enter two numbers: ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		
		System.out.print("What is " + num1 + " + " + num2 +"?");
		int userInput = scn.nextInt();
		list.add(userInput);
		
		int result = num1+num2;
		
		while((userInput) != result) {
			System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 +"?");
			
			userInput = scn.nextInt();
			if(list.contains(userInput)) {
				System.out.println("You already entered " + userInput);
			}
			
			list.add(userInput);
			
		}
		System.out.println("You got it!");
	
		
		
	}
		
	
}	

