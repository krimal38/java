package name;

public class CS_202 {
	
	
	public static void main(String[]args) {
		
		String str = "Hi, my name is kshitiz Rimal. where do you live?";
		String str1 = "I live no where. what about you?";
		String str3 = "kshitiz";
		AnotherClass newclass = new AnotherClass(str);
		
		System.out.println("Compare: " + newclass.compare(str1));
		
		System.out.println();
		System.out.println("substring:");
		newclass.substring(11).print();
		
		System.out.println();
		System.out.println("toUpperCase:");
		newclass.toUpperCase().print();
		
		char[] convert = newclass.toChars();
		System.out.println();
		System.out.println("Converting string to char[] array:");
		for(char output: convert) {
			System.out.print(output + " ");
		}
		
		boolean bol = str.contains(str3);
		System.out.println();
		System.out.println();
		System.out.println("Is there '" + str3 + "' in '" + str + "' ");
		newclass.valueOf(bol).print();
		
	}
	
}	

/*
 package name;

public class AnotherClass {
	
	String str;
	
	public AnotherClass(String s) {
		this.str = s;
	}
	
	public int compare(String s) {
		return this.str.compareTo(s);
	}
		
	public AnotherClass substring(int begin) {
		return new AnotherClass(this.str.substring(begin));
	}
	
	public AnotherClass toUpperCase() {
		return new AnotherClass(this.str.toUpperCase());
	}
	
	public char[] toChars() {
		char[] stringToCharArray = this.str.toCharArray();
		return stringToCharArray;
		
	}
	
	public static AnotherClass valueOf(boolean b) {
		return new AnotherClass(String.valueOf(b)); 
		
	}
	// prints the output
	public AnotherClass print() {
		System.out.println(this.str);
		return this;
	}
	

	
}

 */

// output


/*
Compare: -1

substring:
 is kshitiz Rimal. where do you live?

toUpperCase:
HI, MY NAME IS KSHITIZ RIMAL. WHERE DO YOU LIVE?

Converting string to char[] array:
H i ,   m y   n a m e   i s   k s h i t i z   R i m a l .   w h e r e   d o   y o u   l i v e ? 

Is there 'kshitiz' in 'Hi, my name is kshitiz Rimal. where do you live?' 
true

 
 */



