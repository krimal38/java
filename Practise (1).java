import java.util.*;
public class Practise {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter a point with two coordinates: ");
	double first_point = scn.nextDouble();
	double second_point = scn.nextDouble();
	
	   double equation_of_a_circle = Math.sqrt((Math.pow(first_point, 2)+ Math.pow(second_point, 2))); 
		
		if (equation_of_a_circle<= 10)
			System.out.printf("Point (%f, %f) is in the circle ", first_point, second_point);
		else 
		System.out.printf("Point (%f, %f) is not in the circle ", first_point, second_point);
		
		 }
		
		
	}
	

