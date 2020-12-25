import java.util.*;
public class Project {

	public static void main(String[] args) {
	
		int[] list = {1,2,3,4,5,6};
		
		int i = BinarySearch(list,6);
		System.out.println(i);
		
		
	}
	
	public static int BinarySearch(int[] list, int key){
		int low =0; // We need two values for the algorithm so we use low and high. It is the first position of the list array.
		int high = list.length-1; // We used -1 just so we don't go outOfBounds. It would still work without it. It is the last position of list array.

		
		while(low<=high){ // saying (low<= high) we say 0<=5
			int mid_value = (low+high)/2; // It is to find the mid point in the array (0+5)/2 is floor of 2.5 which is 2.
			
			if(key> list[mid_value]) // if(6>list[2]). Means is 6>3? Yes, but if was no then i would go to else block.
				low = mid_value+1;  // low = 2+1. increment. Now my low is 3 and my high is still 6. so my new mid is (3+6)/2 which is 4. Now it says if(6>list[4]) then return, otherwise loop the iteration
			
			else if(list[mid_value] == key) // It says if(list[2] == 6) means, if i am searching for element which is the middle element then,
				return mid_value; // return the mid_value which is 3
			else 
					high = mid_value -1; // works the same way as low. If statement jumps to this part when 6>list[n] doesnot satisfy the condition.
			
			
			
		}
		
		return -1; // returns -1 if we are looking for a number that is not in the array.
		
	}
}

	


