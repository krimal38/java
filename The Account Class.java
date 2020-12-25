package name;
import java.util.Date;

public class CS_202 {
	
	public static void main(String[] args) {
	
		Project_Class DefaultAmount = new Project_Class();
		System.out.println("The default amount ID is " + DefaultAmount.getid() + ".Its balance is $" + DefaultAmount.getbalance() + ",and its interest rate is " + DefaultAmount.getannualIntrestRate()+"%");
		System.out.println();
		
		Project_Class parametrized = new Project_Class(1122,20000,4.5);
		parametrized.setannualIntrestrate(4.5);
		System.out.println("The parametrized amount. ID is " + parametrized.getid() + ".The balance is $"+ parametrized.getbalance() + ",and intrest rate is " + parametrized.getannualIntrestRate()+"%");
		System.out.println();
		
		Project_Class withdraw_and_deposit_obj = new Project_Class(2500,3000);
		double withdraw = parametrized.withdrawAmount(2500);
		double deposit = parametrized.deposit(3000);
		
		
		System.out.println("The amount withdraw from account $"+ withdraw_and_deposit_obj.getWithdraw() + ".You deposited amount $"+ withdraw_and_deposit_obj.getDeposit());
		System.out.println();
		System.out.println("The amount in your bank after withdraw $"+ withdraw + ".The current amount in your bank is $"+ deposit);	
		
	}		
	
}


/*

package name;
import java.util.Date;

public class Project_Class {
	
	private int id;  // for the account
	private double balance;   //for the account
	private double annualIntrestRate =0;   //to store current interest rate
	private Date dateCreated; // stores the date when account was created
	private double withdraw;
	private double deposit;
	
	public Project_Class() {
		id =0;
		balance =0;
		annualIntrestRate =0;
	}
	public Project_Class(int ID, double BALANCE, double intrestRate) {
		this.id = ID;
		this.balance = BALANCE;
		this.annualIntrestRate = intrestRate;
	}
	
	public Project_Class(double Withdraw, double Deposit) {
		this.withdraw = Withdraw;
		this.deposit = Deposit;
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
	
	
	public Date getDate() {
		return dateCreated;
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
	
	
	public double withdrawAmount(double withdraw) {
		this.balance -= withdraw;
		return balance;
	}
	
	
	public double deposit(double deposit) {
		this.balance += deposit;
		return balance;
	}
		
}	


 */


// Result:
/*
The default amount ID is 0.Its balance is $0.0,and its interest rate is 0.0%

The parametrized amount. ID is 1122.The balance is $20000.0,and intrest rate is 0.045%

The amount withdraw from account $2500.0.You deposited amount $3000.0

The amount in your bank after withdraw $17500.0.The current amount in your bank is $20500.0
 */





















