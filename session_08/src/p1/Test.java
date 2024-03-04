package p1;

public class Test {
	
	public static void main(String[] args) 
			throws InterruptedException {
		
		Account a = new Account();//only one Object
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(a);
		t1.start();
		t2.start();
		Thread.currentThread().sleep(1000);
		a.getBalance();
	}

}
