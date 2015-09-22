/*
 * @Author Michael Cisternino
 * Practice Set 3
 * September 23, 2015
 */

package main;


// AccountDemo tests methods in the Account class and InsufficientFundsException class
public class AccountDemo {

	public static void main(String[] args) {
		Account n = new Account(1122, 20000.00, 4.50);
		System.out.println("Date Created: " +n.getDateCreated());
		System.out.println("Monthly Interest Rate: %" +n.getMonthlyInterestRate());
		System.out.println("Account Holder ID: " +n.getId());
		System.out.println("Depositing $3,000...");
		n.deposit(3000.00);
		System.out.println("Your balance is now $" +n.getBalance());
		try
		{
			System.out.println("\nWithdrawing $2,500...");
			n.withdraw(2500.00);
			System.out.println("\nYour balance is now $" +n.getBalance());
			System.out.println("\nWithdrawing $20,501...");
			n.withdraw(20501.00);
		}catch(InsufficientFundsException e)
		{
			System.out.println("Sorry, but you are short $"
								+ e.getAmount());
			e.printStackTrace();				
		}
		
	}

}
