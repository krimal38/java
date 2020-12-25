package name;
import java.util.*;

import java.util.ArrayList;
public class CS_202 {
	
	
	public static void main(String[]args)  {
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter Integers: ");
		while(scn.hasNextInt()) {
			list.add(scn.nextInt());
		}
		sort(list);
		System.out.println("The sum is: " + sum(list));
		removeDuplicates(list);
	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		System.out.println(list.toString());
	
	}
	
	public static int sum(ArrayList<Integer> list) {
		int sum =0;
		for(int i =0; i<list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	public static void removeDuplicates(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<>();
		
		
		for(Integer element: list) {
			if(!newList.contains(element)) {
				newList.add(element);
			}
			
		}
		System.out.println(newList.toString());
		
	}
}	

/*
 output
 Enter Integers: 
1
2
3
4
5
6
7
8
4
3
2
done
[1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8]
The sum is: 45
[1, 2, 3, 4, 5, 6, 7, 8]

 */



