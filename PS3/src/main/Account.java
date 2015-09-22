/*
 * @Author Michael Cisternino
 */
package main;

import java.text.SimpleDateFormat;
import java.util.Date;

	// class Account creates a representation of a user's account based on given inputs
public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	// to parse a date into a variable
	public SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
	private Date dateCreated = null;
	
	public Account() {
	}
	// instantiates an account
	public Account(int anId, double initialBalance, double annualRate) {
		this.id = anId;
		this.balance = initialBalance;
		this.annualInterestRate = annualRate;
	}
	// returns account ID
	public int getId() {
		return id;
	}
	// sets instance's ID to given ID
	public void setId(int id) {
		this.id = id;
	}
	// returns account balance
	public double getBalance() {
		return balance;
	}
	// sets instance's balance to given balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// returns account annual interest rate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	// sets instance's annual interest rate to given interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	// returns instance's date of account creation
	public Date getDateCreated() {
		return dateCreated;
	}
	// returns instance's monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	// deposits funds into instance's account balance
	public void deposit(double amount) {
		balance += amount;
	}
	// withdraws funds from instance's account balance and builds and throws an exception if there are insufficient funds
	public void withdraw(double amount) throws 
	InsufficientFundsException 
	{
		if (amount <= balance) {
			balance -= amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
}
