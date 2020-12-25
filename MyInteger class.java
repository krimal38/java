package name;

public class CS_202 {
	

	public static void main(String[]args) {
	
		Project_Class int1 = new Project_Class(23);
		Project_Class int2 = new Project_Class(50);
		Project_Class int3 = new Project_Class(66);
		
		System.out.println("The number " + int1.getint() + " is Prime? " + int1.isPrime());
		System.out.println("The number " + int2.getint() + " is Prime? " + int2.isPrime());
		System.out.println("The number " + int3.getint() + " is Prime? " + int3.isPrime());
		
		System.out.println();
		System.out.println("The number " + int1.getint() + " is Even? " + int1.isEven());
		System.out.println("The number " + int2.getint() + " is Even? " + int2.isEven());
		System.out.println("The number " + int3.getint() + " is Even? " + int3.isEven());

		System.out.println();
		System.out.println("Is 93 odd? " + Project_Class.isOdd(93));
		
		System.out.println();
		System.out.println("Conversion from char array to int sum: " + Project_Class.parseInt(new char[] {'1', '2', '3'}));
		System.out.println("Conversion from string to int value: " + Project_Class.parseInt("555"));
		System.out.println();
		
		Project_Class int4 = new Project_Class(2373627);
		System.out.println("The number " + int4.getint() + " is Even? " + int4.isEven());
		
	}
}	

/*
 package name;

public class Project_Class {

	 int value;
	
	
	public Project_Class(int val) {
		this.value = val;
		
	}
	
	public int getint() {
		return this.value;
	}
	
	public boolean isEven() {
		int num = getint();
		
		if((num%2) == 0) return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		int num = getint();
	
		if(num%2 == 1) return true;
		else
			return false;
	}
	
	
	public boolean isPrime() {
		int num = getint();
		
		for(int i=2; i<num; i++) {
			
			if(num%2 ==0)
				return false;
		}
		return true;
		
	}
	
	
	
	
	
	
	public static boolean isEven(int val) {
		
		if((val%2) == 0) return true;
		else
			return false;
	}
	
	public static boolean isOdd(int val) {
		if(val%2 !=0) return true;
		else
			return false;
	}
	
	public static boolean isPrime(int val) {
		for(int i=2; i<val; i++) {
			
			if(val%2 ==0)
				return false;
		}
		return true;
	}
	
	
	
	
	
	
	public static boolean isEven(Integer val) {
		if((val%2) == 0) return true;
		else
			return false;
	
	}

	public static boolean isOdd(Integer val) {
		if(val%2 !=0) return true;
		else
			return false;
	}
	
	public static boolean isPrime(Integer val) {
		for(int i=2; i<val; i++) {
			
			if(val%2 ==0)
				return false;
		}
		return true;
	}

	
	public static int parseInt(String userInput) {
		
		return Integer.parseInt(userInput);
		
	}
	
	public static int parseInt(char[] userInput) {
		int sum =0;
		
		for(char i : userInput) {
			sum += Character.getNumericValue(i);
		}
		return sum;
		
	}
	
	
}

 */


// output
/*
 The number 23 is Prime? true
The number 50 is Prime? false
The number 66 is Prime? false

The number 23 is Even? false
The number 50 is Even? true
The number 66 is Even? true

Is 93 odd? true

Conversion from char array to int sum: 6
Conversion from string to int value: 555

The number 2373627 is Even? false
 */







