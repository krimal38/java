package name;

public class CS_202 {
	
	
	public static void main(String[]args) {
		char[] chars = {'a','b','C','D','E','f','G'};
		char [] anotherChar = {'a','c','k','l'};
		Project_Class obj = new Project_Class(chars);
		Project_Class obj1 = new Project_Class(anotherChar);
		
		System.out.println("Char at specified index charAt: " + obj.charAt(0));
		System.out.println("Length of char: " + obj.length());
		System.out.println("SubString:");
		obj.substring(1, 2).print();
		System.out.print("\n");
		obj.toLowerCase().print();
		System.out.print("\n");
		System.out.println("valueOf:");
		obj.valueof(0).print();
		System.out.print("\n");
		System.out.println(obj.equals(obj1));
		
		
	}
	
}	
/*
 package name;

 class Project_Class{
	
	char[] data; // data field for char[]
	
	// This constructor is for char[] (10.22)
	public Project_Class(char[] chars) {
		this.data = new char[chars.length];
		System.arraycopy(chars, 0, this.data, 0, chars.length);
	}
	
	
	// From here on it will be for Char[] (10.22)
	public char charAt(int index) {
		return this.data[index];
	}
	
	public int length() {
		return this.data.length;
	}
	
	public Project_Class substring(int begin, int end) {
		char[] substring = new char[end-begin];
		
		for(int i = begin; i<end; i++) {
			substring[i-begin] = this.charAt(i);
		}
		return new Project_Class(substring);
	}
	
	public Project_Class toLowerCase() {
		for(int i =0; i<this.length(); i++) {
			this.data[i] = Character.toLowerCase(this.data[i]);
		}
		return this;
	}
	
	public boolean equals(Project_Class s) {
		if(this.length() != s.length()) return false;
		
		return true;
	}
	
	public static Project_Class valueof(int i) {
		return new Project_Class(Integer.toString(i).toCharArray());
	}
	
	public Project_Class print() {
		for(int i =0; i<this.length(); i++) 
		{
			System.out.print(this.data[i] + " ");
			
		}
		return this;
		
	}
	
	
}

 */

// output

/*
 Char at specified index charAt: a
Length of char: 7
SubString:
b 
a b c d e f g 
valueOf:
0 
false

 */



