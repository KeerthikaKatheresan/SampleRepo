package com.mphasis.Maven_JDBC;

public class BankAccount {

	private double balance=15000;
	
	//synchronization at method level
	public synchronized void withDraw(double amount)	//let 1 thread complete full then only other thread comes
	{
		if(amount>balance)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance=balance-amount;
			System.out.println(Thread.currentThread().getName()+" is withdrawing ");
			System.out.println("Updated balance :"+balance);
		}
		
		//synchronization at block level-ipo nama method name pakathula synchronized keyword use panna vendam
		/*System.out.println(Thread.currentThread().getName()+" is withdrawing ");//not critical line so can be placed outside
		synchronized(this) //this->mutex ->refers to the current obj(Thread)
		{
			if(amount>balance)
			{
				System.out.println("Insufficient balance");
			}
			else
			{
				balance=balance-amount;
				
				System.out.println("Updated balance :"+balance);
				System.out.println("Hehe by "+Thread.currentThread().getName());
			}
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc=new BankAccount();
		Runnable r=()->{
			acc.withDraw(1000);
		};
		Thread t1=new Thread(r,"user-1");
		Thread t2=new Thread(r,"user-2");
		t1.start();
		t2.start();
	}
	

}

