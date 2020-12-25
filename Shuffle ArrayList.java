package name;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
public class CS_202 {
	
	
	public static void main(String[]args)  {
		Scanner scn = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter numbers: ");
		
		while(scn.hasNextInt()) {
			list.add(scn.nextInt());
		}
		shuffle(list);
	scn.close();	
	}
	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
		System.out.println("Shuffled array: " + list);
	}
}	



// output
/*
 Enter numbers: 1 2 3 9 3 0 5 done
Shuffled array: [0, 5, 3, 9, 2, 3, 1]

 
 */



