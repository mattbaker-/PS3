package MainPackage;

import java.util.Date;

//import CISC181.Week3.Package4.InsufficientFundsException;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		setID(0);
		setBalance(0);
		setAnnualIntRate(0);
		dateCreated = new Date();
		System.out.println(getDate());
	}

	public Account(int id, double b) {
		this.id = id;
		this.balance = b;
		setAnnualIntRate(0);
		dateCreated = new Date();
	}

	void setID(int id) {
		this.id = id;
	}

	void setBalance(double b) {
		this.balance = b;
	}

	void setAnnualIntRate(double i) {
		this.annualInterestRate = i;
	}

	int getID() {
		return id;
	}

	double getBalance() {
		return balance;
	}

	double getAnnualIntRate() {
		return annualInterestRate;
	}

	double getMonthlyIntRate() {
		return annualInterestRate / 12;
	}

	String getDate() {
		return dateCreated.toString();
	}

	void withdraw(double amount) throws InsufficientFundsException
	{
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	void deposit(double dp) {
		this.balance = balance + dp;
	}
	
	void properties() {
		System.out.println("\nAccount Balance: $" + getBalance());
		System.out.println("Account Interest: " + getAnnualIntRate() + "%");
		System.out.println("Account Created: " + getDate());
	}

}
