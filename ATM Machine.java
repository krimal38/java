package name;
import java.util.*;

public class CS_202 {
	
	
	public static void main(String[]args) {
		
		
		Project_Class[] obj = new Project_Class[10];
		Project_Class obj2 = new Project_Class();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an ID: Your ID is 10");
		
		int ID = scn.nextInt();
		
		for(int i =0; i< obj.length; i++) { // array that creates 10 accounts
			
			
		while(ID != 10) { // checks if the user ID is right or wrong
			System.out.println("Invalid ID. Enter an ID");
			ID = scn.nextInt();
		}
		printFunction();
		
		System.out.println("Enter a choice: ");
		
		int Prompt_choice = scn.nextInt();	
			
		while(Prompt_choice != 4){
			
		if(Prompt_choice == 1) {
			System.out.println("The balance is " + obj2.Initial_balance());
			System.out.println();
			}
			else if(Prompt_choice == 2) {
				System.out.println("Enter the amount to withdraw: ");
				double withdrawAmount = scn.nextDouble();
				obj2.WithdrawAmount(withdrawAmount);
				System.out.println();
			}
			else if(Prompt_choice == 3) {
				System.out.println("Enter the amount to deposit: ");
				double depositAmount = scn.nextDouble();
				obj2.depositAmount(depositAmount);
				System.out.println();
			}
		break;	
		}	
	
	}
		scn.close();
}		
	public static void printFunction() {
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
	}
}



/*
 package name;

public class Project_Class {

	private double balance;
	private double Withdraw;
	private double deposit;
	
	// default constructor 
	Project_Class(){
		balance = 100;
		Withdraw =0;
		deposit =0;
	}
	
	public double Initial_balance() {
		return balance;
	}
	
	
	public double Withdraw() {
		return Withdraw;
	}
	public void setWithdraw(double withdraw) {
		 withdraw = this.Withdraw;
	}
	
	
	public double deposit(){
		return deposit;
	}
	public void setdeposit(double deposit) {
		deposit = this.deposit;
	}
	
	
	
	public double WithdrawAmount(double withdraw) {
		this.balance -= withdraw;
		return balance;
	}
	
	
	public double depositAmount(double deposit){
		this.balance += deposit;
		return balance;
	}	
	
}
 */

// Output:
/*
 Enter an ID: Your ID is 10
10
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
1
The balance is 100.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
2
Enter the amount to withdraw: 
10

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
1
The balance is 90.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
3
Enter the amount to deposit: 
20

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
1
The balance is 110.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
3
Enter the amount to deposit: 
100

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
1
The balance is 210.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
2
Enter the amount to withdraw: 
10

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
1
The balance is 200.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 
4
 */

