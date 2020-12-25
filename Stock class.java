package name;

import java.util.*;

public class CS_202 {
	public static void main(String[] args) {
	
		Project_Class stock = new Project_Class("ORCL","Oracle Corporation");
		System.out.println(stock.symbol + "(" + stock.name + ")" + "");
		
		double new1 = stock.getChangePercentage(34.5, 34.35);
		
		System.out.printf("The price-change percentage is %f",new1);
		System.out.println("%");
	
	}
	
}


// This is Project_Class.
/*
package name;

public class Project_Class {
	String symbol = "ORCL";
	String name = "Oracle Corporation";
	double PreviousClosingPrice;
	double currentPrice;
	
	Project_Class(String symbol, String name){
		this.symbol = symbol;
		this.name = name;	
	}
	
	double getChangePercentage(double previous, double current) {
		this.PreviousClosingPrice = previous;
		this.currentPrice = current;
		double change = (current - previous)/previous;
		double multiply = change *100;
		return multiply;
	}
	
}
*/