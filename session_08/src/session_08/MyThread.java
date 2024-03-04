package session_08;
public class MyThread extends Thread{
	public void run()
	{
		/*
		 * System.out.println("Current Thread = " +Thread.currentThread().getName());
		 */
	for(int i=1;i<=5;i++)
	{
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("i = "+i+" Thread name = "
				+ ""+Thread.currentThread().getName() 
		+" ID = "+Thread.currentThread().getId());
	}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}

/*t1,t2 t3 - born state

queue - t1, t2, t3 - Runnable

Thread Schedular - part of JVM

t2 - Running 
- I/O,sleep,wait - Non-Runnable
t2 -dead
*/




