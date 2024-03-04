package session_07;
public class Test2 {
	public static void main(String[] args) {
		try
		{
		int c = 0;
		int a = Integer.parseInt(args[0]);
		int b =  Integer.parseInt(args[1]);
		c = a/b;
		System.out.println("c = "+c);
		}
		catch (Exception e) {
			if(e instanceof ArithmeticException)
			{
				e.printStackTrace();
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println(e);
			}
		else if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println(e.getMessage());
			}
			else
			{
				System.out.println("EXCEPTION!!!");
			}
		}
	}

}
