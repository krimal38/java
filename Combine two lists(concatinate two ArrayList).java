package name;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CS_202 {
	
	
	public static void main(String[]args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		ArrayList<Integer> concatinate = union(list1, list2);
	
		System.out.println("Union of list1 and list2: " + concatinate);
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		 list1.addAll(list2);
		 return list1;
		
		
	}
}	
/*
 output
 List1: [1, 2, 3, 4]
List2: [5, 6, 7, 8]
Union of list1 and list2: [1, 2, 3, 4, 5, 6, 7, 8]

 */


