package name;
import java.util.*;

import java.util.ArrayList;
public class CS_202 {
	
	
	public static void main(String[]args)  {
		Scanner scn = new Scanner(System.in);

		AnotherClass obj = new AnotherClass();
		
		System.out.println("Enter five strings:");
		for(int i =0; i< 5; i++) {
			obj.push(scn.nextLine());
		}
		System.out.println();
		System.out.println("Peek: On the top of the stack is " + obj.peek());
		System.out.println("Size: " + obj.getSize());
		obj.reverse();
		System.out.println("IsEmpty? " + obj.isEmpty());
		System.out.println("Pop: Top element of the stack " + obj.pop());
		System.out.println("Now the list is: ");
		obj.reverse();
		
		
		
		scn.close();
		
	}
	
}	
// Stack class
/*
 package name;

import java.util.ArrayList;
import java.util.Collections;

public class AnotherClass{
	
	 
	private ArrayList<String> list;
	
	
	public AnotherClass() {
		this.list = new ArrayList<>();
	
	}

	 public boolean isEmpty() {
		 return list.isEmpty();
	 }
	 
	 public int getSize() {
		 return list.size();
	 }
	 
	 public Object peek() {
		 return list.get(getSize()-1);
	 }
	 
	 public Object pop() {
		 Object o = list.get(getSize()-1);
		 list.remove(getSize() -1);
		 return o;
	 }
	 public void push(String o) {
			 list.add(o);
		 
	 }
	 public void reverse() {
		 Collections.reverse(list);
		 System.out.println("Reverse String: " + list.toString());
	 }
	
 }

 */ 


// output
/*
 Enter five strings:
Dog
Cat
Monkey
Rabbit
Fox

Peek: On the top of the stack is Fox
Size: 5
Reverse String: [Fox, Rabbit, Monkey, Cat, Dog]
IsEmpty? false
Pop: Top element of the stack Dog
Now the list is: 
Reverse String: [Cat, Monkey, Rabbit, Fox]

 */





