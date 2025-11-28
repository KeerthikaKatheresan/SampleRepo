package com.mphasis.Maven_JDBC;

public class Chef extends Thread {

	private final String[] orders;

	public Chef(String... order) {
		this.orders = order;
	}
	
	@Override
	public void run()
	{
		for(String i:orders)
		{
			System.out.println(getName()+"is preparing "+i);
			try {
				Thread.sleep(5000);
			}
			catch( InterruptedException e)
			{
				System.out.println(getName() +"got interrupted");
			}
			System.out.println(getName()+"served" +i);
		}
	}

	public static void main(String args[]) throws InterruptedException {
		Chef c1 = new Chef("Briyani", "Sambar", "Chicken curry", "Curd");
		Chef c2 = new Chef("Briyani", "Ambur Briyani", "Chicken curry", "Payasam");
		Chef c3 = new Chef("Mutton curry", "Curd");
		Chef c4 = new Chef("Fish curry", "Chicken curry", "Curd");

		c1.setName("Chef-1");
		c2.setName("Chef-2");
		c3.setName("Chef-3");
		c4.setName("Chef-4");

		c1.start();
		c2.start();
		c3.start();
		c4.start();

		// join- atlast main thread elam thread um mudiya wait pannnu 
		c1.join();
		c2.join();
		c3.join();
		c4.join();

	}
}
