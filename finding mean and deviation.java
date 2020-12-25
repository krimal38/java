
import java.util.*;

/*
 * This program calculates standard deviation of statistics problem. Uses different formula but works. 
 * 
 * 
 * 
 */
public class Project_Class {
	
	public static double mean (double[] x) {
		double sum =0;
		double mean = 0;
		for(int i =0; i< x.length; i++) {
			sum += x[i];
			
			mean = sum/x.length;
		}
		return mean;	
		}
	
	public static double deviation (double[] x) {
		double mean = mean(x);
		double xi = 0;
		double deviation =0;
		
		for(int i =0; i<x.length; i++) {
			xi += x[i];
			
			double power = Math.pow(xi-mean,2);
			deviation = Math.sqrt(power/(x.length-1));
		}
		return deviation;
	}
	
   public static void main(String[] args) {
	   double[] list = new double[10];
	   Scanner scn = new Scanner (System.in);
	   
	   System.out.println("Enter ten numbers: ");
	   for(int i =0; i<list.length; i++) {
		   list[i] = scn.nextDouble();
		  
	   }
	   double mean = mean(list);
	   double deviation = deviation(list);
	   System.out.println("The mean is " + mean);
	   System.out.println("The standard deviation is " + deviation);
	
	   scn.close();
	
   }
} 
	
	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
