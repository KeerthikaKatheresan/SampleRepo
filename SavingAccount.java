package com.mphasis.Day1MavenProject;

public class SavingAccount extends Account {
	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankName, String ifsc, String branchName,
			double balance) {
		super(accNo, accHolderName, bankName, ifsc, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", getBalance()=" + getBalance() + ", getAccNo()=" + getAccNo()
				+ ", getAccHolderName()=" + getAccHolderName() + ", getBankName()=" + getBankName() + ", getIfsc()="
				+ getIfsc() + ", getBranchName()=" + getBranchName() + ", getPin()=" + getPin() + "]";
	}

	public void withDraw(double amount)
	{
		if(amount<this.balance)
		{
			this.balance=this.balance-amount;
			System.out.println("Amount withdrawn successfully");
		}
		else
		{
			System.err.println("Balance is low");
		}
	}
	
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Amount deposited successfully");
	}
	
	public double checkBalance()
	{
		return this.getBalance(); 
	}
	
}
