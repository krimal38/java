package name;
import java.util.*;
public class CS_202 {
	
	
	public static void main(String[]args) {
		
		String str = "Hello, my name is KSHITIZ ";
		char[] charArray = {'a','b','C','D'};
		
		AnotherClass obj = new AnotherClass(charArray);
		AnotherClass obj1 = new AnotherClass(str);
		
		
		System.out.println("Insert method:");
		obj1.insert(25, new AnotherClass(" Rimal").print());
			
		System.out.println();
		System.out.println("substring:");
		obj1.substring(8).print();
		
		System.out.println();
		System.out.println("UpperCase method:");
		obj1.toUpperCase().print();
		
		System.out.println();
		System.out.println("Reverse method:");
		obj1.reverse().print();
		
		System.out.println();
		System.out.println("susbtring in char[]");
		obj.substring(2).print();
		
		System.out.println();
		System.out.println("UpperCase method using char[]");
		obj.toUpperCase().print();
		
		System.out.println();
		System.out.println("Reverse method using char[]");
		obj.reverse().print();
		
		System.out.println();
		System.out.println("Insert method using char[]");
		obj.insert(2, new AnotherClass("F").print());
		
		System.out.println(obj.toString());
		
		
	}
	
	
}	
/*
 package name;

 public class AnotherClass {
	
	 StringBuilder sb = new StringBuilder();
	 char[] charArray;
	 
	public AnotherClass() {
		sb = new StringBuilder();
		
	}
	
	public AnotherClass(char[] chars) {
		
		this.charArray = new char[chars.length];
		System.arraycopy(chars, 0, this.charArray, 0, chars.length);
		
		String txt = new String(this.charArray);
		this.sb = new StringBuilder(txt);
		
	}
	
	public AnotherClass(String s) {
		this.sb =  new StringBuilder(s);
	}
	
	
	public AnotherClass insert(int offset, AnotherClass s) {
		return new AnotherClass (this.sb.insert(offset, s).toString());
	}
	
	public AnotherClass reverse() {
		return new AnotherClass(this.sb.reverse().toString());
	}
	
	public AnotherClass substring(int begin) {
		return new AnotherClass(this.sb.substring(begin));
	}
	
	public AnotherClass toUpperCase() {
		return new AnotherClass(this.sb.toString().toUpperCase());
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
// output



/*
 Insert method:
 Rimal

substring:
y name is KSHITIZ Rimal 

UpperCase method:
HELLO, MY NAME IS KSHITIZ RIMAL 

Reverse method:
 lamiR ZITIHSK si eman ym ,olleH

susbtring in char[]
CD

UpperCase method using char[]
ABCD

Reverse method using char[]
DCba

Insert method using char[]
F
DCFba

 */





