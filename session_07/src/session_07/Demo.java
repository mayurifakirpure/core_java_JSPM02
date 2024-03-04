package session_07;

public class Demo {
	
	public static void msg()
	{
		getMsg();
	}
	
	public static void getMsg()
	{
		int a = 10/0;
	}
	
	public static void main(String[] args) {
		
		Demo.msg();
		
	}

}
