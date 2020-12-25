package name;
import java.util.*;
public class CS_202 {
	
	
	public static void main(String[]args) {
		
		String str = "Hello, my name is KSHITIZ ";
		
		AnotherClass obj = new AnotherClass(str);
		System.out.println(obj.sb);
		System.out.println();
		System.out.println("append method:");
		obj.append(new AnotherClass("Rimal ")).print();
		
		System.out.println();
		System.out.println("Append Integer value onto string: ");
		obj.append(82).print();
		
		System.out.println();
		System.out.println("The length of the String:");
		System.out.println(obj.length());
		
		System.out.println();
		System.out.println("The charAt method which returns string at specified place:");
		System.out.println(obj.charAt(8));
		
		System.out.println();
		System.out.println("To LowerCase method:");
		obj.toLowerCase().print();
		
		System.out.println();
		System.out.println("substring method: ");
		obj.substring(18, 26).print();
		obj.substring(5, 15).print();
		
		
		System.out.println();
		System.out.println("toString() method:");
		System.out.println(obj.toString());
		
	}
}	

/*
 package name;

 public class AnotherClass {
	
	 StringBuilder sb = new StringBuilder();
	 
	public AnotherClass(String s) {
		
		this.sb = new StringBuilder(s);
	}
	
	
	public AnotherClass append(AnotherClass s) {
		
		return new AnotherClass(this.sb.append(s).toString());
	}
	
	public AnotherClass append(int i) {
		Integer astr = new Integer(i);
		
		return new AnotherClass(this.sb.append(astr).toString());
	}
	
	public int length() {
		return this.sb.length();
	}
	
	
	public char charAt(int index) {
		return this.sb.charAt(index);
	}
	
	
	public AnotherClass toLowerCase() {
		// Either use one line of code which changes the StringBuilder this.sb to string (using toString()) and then only you can use toLowerCase() or use the loop.
		// Always remember, to change StringBuilder to String use toString() keyword.
		//return new AnotherClass(this.sb.toString().toLowerCase());
		for(int i =0; i<sb.length(); i++) {
			char c = sb.charAt(i);
			sb.setCharAt(i, Character.toLowerCase(c));
		}
		return this;
	}
	
	public AnotherClass substring(int begin, int end) {
		return new AnotherClass(this.sb.toString().substring(begin, end));
	}
	
	public String toString() {
		return this.sb.toString();
	}
	
	
	public AnotherClass print() {
		System.out.println(this.sb);
		return this;
	}
}

 */

// output---------

/*
 Hello, my name is KSHITIZ 

append method:
Hello, my name is KSHITIZ Rimal 

Append Integer value onto string: 
Hello, my name is KSHITIZ Rimal 82

The length of the String:
34

The charAt method which returns string at specified place:
y

To LowerCase method:
hello, my name is kshitiz rimal 82

substring method: 
kshitiz 
, my name 

toString() method:
hello, my name is kshitiz rimal 82
 */



