package p1;

public class Account {
	
	private int balance;
	
	public Account()
	{
		balance = 5000;
	}
	
	public synchronized void deposit(int amount) 
			throws InterruptedException
	{
		System.out.println("Thread Name = "
	+Thread.currentThread().getName());
		int temp;
		temp = balance;
		temp = temp + amount;
		Thread.currentThread().sleep(500);
		balance = temp;
		System.out.println(Thread.currentThread().
				getName()+" "+balance);
	}
	
	public void getBalance()
	{
	System.out.println("Account Balance = "+balance);
	}

}
