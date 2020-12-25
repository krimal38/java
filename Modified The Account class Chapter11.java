package name;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
public class CS_202 {
	
	
	public static void main(String[]args)  {
	
		Project_Class obj = new Project_Class("George", 1122, 1000, 1.5);
		obj.deposit(30);
		obj.deposit(40);
		obj.deposit(50);
		obj.withdrawAmount(5);
		obj.withdrawAmount(4);
		obj.withdrawAmount(2);
		obj.withdrawAmount(7);
		System.out.println(obj.toString());
		System.out.println();
		
		for(int i =0; i<obj.getTransaction().size(); i++) {
			System.out.println("Date: " + obj.getTransaction().get(i).getDate());
			System.out.println("Type: " + obj.getTransaction().get(i).getType());
			System.out.println("Amount: " + obj.getTransaction().get(i).getAmount());
			System.out.println("Balance: " + obj.getTransaction().get(i).getBalance());
			System.out.println("Description: " + obj.getTransaction().get(i).getdescription());
		}
			
		
	}
}	


// Account class

/*
 package name;
import java.util.ArrayList;

public class Project_Class{
	 
	private String name; // stores the name of the customer
	private int id;  // for the account
	private double balance;   //for the account
	private double annualIntrestRate =0;   //to store current interest rate
	private double withdraw;
	private double deposit;
	ArrayList<AnotherClass> transaction;
	
	public Project_Class() {
		name = " ";
		id =0;
		balance =0;
		annualIntrestRate =0;
		transaction = new ArrayList<AnotherClass>();
	}
	public Project_Class( String name, int ID, double BALANCE, double intrestRate) {
		this.name = name;
		this.id = ID;
		this.balance = BALANCE;
		this.annualIntrestRate = intrestRate;
		transaction = new ArrayList<AnotherClass>();
	}
	
	public Project_Class(double Withdraw, double Deposit) {
		this.withdraw = Withdraw;
		this.deposit = Deposit;
		transaction = new ArrayList<AnotherClass>();
	}
	
	// new constructor added
	public Project_Class(String name, int ID, double balance) {
		this.name = name;
		this.id = ID;
		this.balance = balance;
		transaction = new ArrayList<AnotherClass>();
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		id = this.id;
	}
	
	
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		balance = this.balance;
	}
	
	
	public double getannualIntrestRate() {
		return annualIntrestRate;
	}
	public void setannualIntrestrate(double IR) {
	    annualIntrestRate = IR/100;
		return;
	}
	
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDesposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	
	public double getMonthlyInterestRate() {
		double monthlyIntrestRate = (this.annualIntrestRate/12);
		return monthlyIntrestRate;
	}
	
	
	public double getMonthlyIntrest() {
		double MonthlyIR = getMonthlyInterestRate();
		
		double getMonthlyIntrest = this.balance * MonthlyIR;
		return getMonthlyIntrest;
		
	}
	
	public ArrayList<AnotherClass> getTransaction(){
		return this.transaction;
	}
	
	public void withdrawAmount(double withdraw) {
		this.balance -= withdraw;
		this.transaction.add(new AnotherClass('W', withdraw, balance, "Withdraw the amount"));
	}
	
	
	public void deposit(double deposit) {
		this.balance += deposit;
		this.transaction.add(new AnotherClass('D', deposit, balance, "Deposit the amount"));
	}
	
	
	public String toString() {
		return "Name of the account holder: " + getName() + "\nIntrest Rate: " + this.annualIntrestRate + "%" + "\nTotal Balance: " + getbalance();
	}
		
}	
 
 */

// Transaction class
/*
 package name;


import java.util.Date;


public class AnotherClass{
	
	 private char type;
	 private double amount; 
	 private double balance;
	 private String description;
	 
	 
	public AnotherClass (char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		
	}
	 
	 // date getter method
	public Date getDate() {
		return new java.util.Date();
	}
	
	
	public char getType() {
		return this.type;
	}
	public void setType(char type) {
		this.type = type;
	}
	
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balc) {
		this.balance = balc;
	}
	
	

	public String getdescription() {
		return this.description;
	}
	 
	 public void setDescription(String desc) {
		 this.description = desc;
	 }

	 
 }


 */


// output
/*
 Name of the account holder: George
Intrest Rate: 1.5%
Total Balance: 1102.0

Date: Sat Jan 12 21:58:16 EST 2019
Type: D
Amount: 30.0
Balance: 1030.0
Description: Deposit the amount
Date: Sat Jan 12 21:58:16 EST 2019
Type: D
Amount: 40.0
Balance: 1070.0
Description: Deposit the amount
Date: Sat Jan 12 21:58:16 EST 2019
Type: D
Amount: 50.0
Balance: 1120.0
Description: Deposit the amount
Date: Sat Jan 12 21:58:16 EST 2019
Type: W
Amount: 5.0
Balance: 1115.0
Description: Withdraw the amount
Date: Sat Jan 12 21:58:16 EST 2019
Type: W
Amount: 4.0
Balance: 1111.0
Description: Withdraw the amount
Date: Sat Jan 12 21:58:16 EST 2019
Type: W
Amount: 2.0
Balance: 1109.0
Description: Withdraw the amount
 */


