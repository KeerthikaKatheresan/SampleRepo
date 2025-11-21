package com.mphasis.Day1MavenProject;

public class BankingApp {
	public static void main(String args[]) {
		
		SavingAccount sa=new SavingAccount(245678944,"Keerthi","ICICI","IFSC000786","Thanjavur",1000);
		System.out.print(sa);
		//sa.withDraw(5000);
		sa.deposit(20000);
	}
}

		 
		 
		 
		 