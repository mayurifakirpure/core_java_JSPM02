package p1;

public class MyThread2 extends Thread{
	
	private Account a;

	public MyThread2(Account a) {
		super();
		this.a = a;
	}
	
	public void run()
	{
		try {
			a.deposit(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
