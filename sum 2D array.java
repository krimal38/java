
import java.util.*;
/*
 * This program solves quadratic function.
 * ANd checks whether the value has one real root, two real roots or none.
 */

public class Project_Class {
		
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter rows:");
		int rows = scn.nextInt();
		System.out.print("Enter column: ");
		int column = scn.nextInt();
		
		int[][] list = new int[rows][column];
		
		for(int i =0; i< rows; i++) {
			for(int j =0; j<column; j++) {
				list[i][j] = scn.nextInt();
			}	
			
		}
		
		System.out.println("The array is: ");

		for(int i =0; i<rows; i++) {
			for(int j =0; j<column; j++) {
			System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
	int sum =sumArray(list);
	System.out.println("Adding up each row in the list. The sum is: " + sum);
	 Addrows(list);
	 int sumColumn = Addcolumn(list);
	 System.out.println("The sum of column is: " + sumColumn);
	
}

 	public static int sumArray(int[][] array_list) {
 				int sum = 0; 
 				for(int i =0; i<array_list.length; i++) {
 					for(int j =0; j<array_list.length; j++) {
 					sum +=	array_list[i][j];
 					}
 				}
 				return sum;
 			}
	public static void Addrows(int[][] rows) {
		int sum =0;
		int row;
		for( row =0; row<rows.length; row++) {
			sum += rows[0][row];
			
		}
		System.out.println("The sum of row is: " + sum );
	}
	public static int Addcolumn(int[][] column) {
		int sum =0;
		for(int i =0; i<column.length; i++) {
			sum += column[i][2];
		}
		return sum;
	}
}	
	
	
	
	


	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
