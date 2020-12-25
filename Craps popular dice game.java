
import java.util.*;

 class  Practise {
	 
	public static void main(String[] args){
  
		
		calculateTheSum();
		
		
	}
	public static int FirstDice(){
		
		return (int)(Math.random()*6)+1;
	}
	public static int SecondDice(){
		 
		return (int)(Math.random()*6)+1;
	}
	public static void calculateTheSum(){
		 int first = FirstDice();
		 int Second = SecondDice();
		 int add = (first + Second);
		 
		 if(add == 2 || add== 3 || add== 12){ // called craps. I lose.
			System.out.println("You rolled " + first + " + " + Second + " = " + add);
			System.out.println("You lose.");
			
		 } else if(add == 7 || add == 11){ // this is called natural, I win.
			System.out.println(" You rolled " + first + " + " + Second + " = " + add);
			System.out.println("You Win.");
			
		 }else {
			 int value=0;
			 int value1 =0;
			 do{
				 
				 add = (first + Second);
				 System.out.println("You rolled " + first + " + " + Second + " = " + add);
				 value+= add;
				 System.out.println("Point is: " + add);
				 
				int randomgenerator = (int)(Math.random()*6)+1;
				int randomGenerator = (int)(Math.random()*6)+1;
				 
				 int add1 = (randomgenerator + randomGenerator);
				 System.out.println("You rolled " + randomgenerator + " + " + randomGenerator + " = " + add1);
				 value1 +=add1;
				 
				 if(value == value1)
					 System.out.println("You win.");
				 else 
					 System.out.println("You lose.");break;
			 }while(value != value1);
			 
			 
		 }
	}
 }
 
