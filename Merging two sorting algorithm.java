
import java.awt.List;
import java.util.*;
/*
 * CArd game. Keeps on adding until the sum of 4 numbers generated from random generator is 24. 
 * 
 */

public class Project_Class {
		
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the length of first array: ");
		int array1 = scn.nextInt();
		System.out.print("Enter the length of second array: ");
		int array2 = scn.nextInt();
		
		int[] length1 = new int[array1];
		int[] length2 = new int[array2];
		
		System.out.printf("Enter list1: ");
		for(int i =0; i<length1.length; i++) {
			length1[i] = scn.nextInt();
		}
		System.out.printf("Enter list2: ");
		for(int j =0; j<length2.length; j++) {
			length2[j] = scn.nextInt();
		}
		int[] list1 = merge(length1);
		int[] list2 = merge1(length2);
		
		PrintArray(list1, list2);	
		
	}
	public static void PrintArray(int[] list1, int[]list2) {
		
		int[] merge = new int[list1.length+list2.length];
		int count =0;
		
		for(int i =0; i<list1.length; i++) {
			merge[i] = list1[i];
			count ++;
			}
		for(int j =0; j<list2.length; j++) {
		merge[count++] = list2[j];
		}
		System.out.print("The merged list is: ");
		for(int i =0; i<merge.length; i++)
			System.out.print(merge[i] + " ");
		
		
}
	public static int[] merge(int[] list1) {
		Arrays.sort(list1);
		return list1;
	}
	public static int[] merge1(int[] list2) {
		Arrays.sort(list2);
		return list2;
	}
} 	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
