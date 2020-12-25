import java.util.*;

 class Practise {
 
  // display matrix of 0s and 1s
	public static void main(String[] args) {		
		printMatrix();
	
	}
	
	public static void printMatrix(){
	 Scanner scn = new Scanner(System.in);
	 System.out.print("Enter: ");
	 int number = scn.nextInt();
	 
	 for(int coloumn = 0; coloumn < number; coloumn++){
		 
		 for(int row =0; row< number; row++){
			 
				 System.out.printf("%1d",(int)(Math.random()*2));
		 }
		 System.out.println();
	 }
	
	 
		
		
	}
 }	

