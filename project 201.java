import java.io.BufferedReader;
import java.io.FileReader;


 class Practise {
 

	public static void main(String[] args)  throws Exception{
					
		
	FileReader fileName = new FileReader("C:/Users/kshit/Desktop/Documents/Text File/src/input.txt");
		
		BufferedReader reader = new BufferedReader(fileName);
		String line = reader.readLine();
		StringObject(line);
		
		
		reader.close();
		
		
			
		
	}
	public static void StringObject(String ArrayOfCharacters){
		char[]ch = ArrayOfCharacters.toCharArray();// Changing String to array of characters
		int letter = 0; // Initialize
		int space = 0;// Initialize
		int Digit =0;// Initialize
		int SpecialCharacters =0;// Initialize
		int WhiteSpace = 0;
		
		
		for(int i=0; i<ArrayOfCharacters.length();i++){
			if(Character.isLetter(ch[i])){ 
				letter++;
			}else if(Character.isSpaceChar(ch[i])){
				space++;
			}else if (Character.isDigit(ch[i])){
				Digit++;
			}else if(Character.isWhitespace(ch[i])){
				WhiteSpace++;
			} else
				SpecialCharacters++;
		}
		
        System.out.println("The Length of the String is:" + ArrayOfCharacters.length() ); // output
        System.out.println("Letters:" + letter); // output
		System.out.println("Space:" + space); // output
		System.out.println("Digits:" + Digit); // output
		System.out.println("Special Characters:" + SpecialCharacters); // output
		System.out.println("The number of White Space: " +WhiteSpace);
		
		int gcd = gcd(space,SpecialCharacters); // Passing method gcd
		System.out.println("The ratio of space and special characters: " + space/gcd + ":" + SpecialCharacters/gcd); // // output
		
		int gcd1 = gcd1(Digit, letter); // Passing method gcd1
		System.out.println("The ratio of letters and digits: " + Digit/gcd1 + ":" + letter/gcd1);
		
		System.out.println("The first occurance of 'a' is at: " +ArrayOfCharacters.indexOf('a'));
		
		System.out.println("The position of character 'a' after 15th character is at " + ArrayOfCharacters.indexOf('a',15) + "th place.");
        System.out.println(ArrayOfCharacters.substring(0,1).toUpperCase());		
        System.out.println("The position of $ is at: " + ArrayOfCharacters.indexOf('$') + "th");
       
	}	
	
	
	public static int gcd(int space, int SpecialCharacters){ // computing the ratio of space and Special characters
		if(SpecialCharacters==0)return space;
		else return gcd(SpecialCharacters, space%SpecialCharacters);
	}
	
	
	public static int gcd1(int digit, int letter){ // computing the ratio of digits and letters
		if(letter==0)return digit;
		else return gcd1(letter, digit%letter);
	}
	


}	
		
		
		
 /**
  *The Length of the String is:560
  *Letters:439
  *Space:92
  *Digits:10
  *Special Characters:16
  *The number of White Space: 3
  *The ratio of space and special characters: 23:4
  *The ratio of letters and digits: 10:439
  *The first occurance of 'a' is at: 8
  *The position of character 'a' after 15th character is at 17th place.
  *M
  *The position of $ is at: 536th
  *
  *
  */
		
		
 
		
		
 		

