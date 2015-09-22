/*
 * @Author Michael Cisternino
 */
package main;
/* 
 * custom class for throwing an insufficient funds exception
 */
@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception 
{
	private double amount;
	/*
	 * creates an instance of the InsufficientFundsExcpetion to be thrown to the caller
	 */
	public InsufficientFundsException(double amount) 
	{
		this.amount = amount;
	}
	public double getAmount() 
	{
		return amount;
	}

}
