import java.util.*;
public class Project {
/*   0 1 2 3 4      <---- index
 *   2 4 1 5 3      <---- array
 *   i              <---- inner loop i
 *     j            <---- outer loop j
 * 
 */
	public static void main(String[] args) {
		int[] array = {10,5,3,7,2};
		sort(array);
		for(int i =0; i<array.length; i++)
			System.out.print(array[i] + " ");
		}
		
		public static int[] sort(int[] A){
			for(int i=0; i<A.length-1; i++){ // This is the inner loop A.length-1. -1 is to prevent from going OutOfBounds Error
				int minIndex =i; // It stars initially at minIndex =0
			for(int j = i+1; j< A.length; j++){
				if(A[j]<A[minIndex]) // This compares. My j is at 1 right now which is array 5. if(A[1]<A[0]), also means 5<10? yes,				
					minIndex =j; // If the above if statement is true then my new minIndex= j, where my j is 1. My minIndex now is 1. keep doing the loop.
// if(A[2]<A[1]) (1<4)? yes, now my minIndex is minIndex = 2.
// if(A[3]<A[2]) (7<3)? No, now my minIndex won't change. Still minIndex = 2.
// if(A[4]<A[2]) (2<3)? yes, now minIndex is minIndex =4. Executes the loop.			
			}
				int temp = A[minIndex]; // temp is equal to minIndex,A[4] and minIndex is 2(array value).
				A[minIndex] = A[i]; // A[4] = A[0]
				A[i] = temp; // A[0] = temp, which is A[4]. Now, 2 switches with 10 {2,5,3,7,10} new array.
				// Now i increments +1. That means for second step i will be pointing at A[1] instead of A[0]. Keeps doing it until the whole list is sorted
			}
			return A; // returns A.
			
		}	
	}

	
			
	


