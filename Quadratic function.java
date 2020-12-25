
import java.util.*;
/*
 * This program solves quadratic function.
 * ANd checks whether the value has one real root, two real roots or none.
 */

public class Project_Class {
		public static void main (String[]args) {
		    Scanner scn = new Scanner(System.in);
			
		    double[] equation = new double[3];
		    double[] roots = new double[3];
		    
		    System.out.println("Enter three numbers: ");
		   
		    for(int i =0; i<equation.length; i++) {
		    	equation[i] = scn.nextDouble();
		    }
		   solveQuad(equation , roots);
		    
		   scn.close(); 
		}
			public static void solveQuad(double[] eqn, double[] roots) {
				
				double a = eqn[0]; 
				double b = eqn[1]; 
				double c = eqn[2];
				

				double discriminant = Math.pow(b, 2) - (4 * a * c);
				
				if(discriminant > 0.0) {
					roots[0]= (-b + Math.pow(discriminant, 0.5)) / (2.0 * a); 
					roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a); 
					System.out.printf("Two solutions are:%f and %f ",roots[0],roots[1]);
					
				}
					else if(discriminant == 0.0){
						roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
						System.out.printf("One solution is:%f ",roots[0]);
					}
					else 
						System.out.println("No solution. ");
						
				
			}

		
	
	
}	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
