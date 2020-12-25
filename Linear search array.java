import java.util.*;
public class Project {

	public static void main(String[] args) {
	int[] list = {1,2,3,4,5};
	int i = linearsearch(list,3);
	System.out.println("At position " + i);
	}
	public static int linearsearch(int[] list, int key){
		for(int i=0; i< list.length; i++){  
			if(list[i]== key) // checks list[0] == 3, but my list[0] is 1. so, it is not true. 
				// Goes to another loop, now i++ will be 1. Check again whether list[1] == 3. No, because list[1] is 2.
				// ANother loop, now i++ will be 2. Check whether list[2] ==3. Yes, so we return i. 
				// if it is out of bound we will return -1.
				return i;
		}
		return -1;
	}
}

	


