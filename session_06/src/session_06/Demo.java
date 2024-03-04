package session_06;

public class Demo {
	public static void main(String[] args) {
		//ArithmeticCal a = new ArithmeticCal();
		
		AllCalculations a = new AllCalculations();
		a.add(10, 20);
		a.sub(20, 10);
		a.avg(10, 20);
		System.out.println("Max = "+a.compare(30, 40));
		System.out.println("Factorial of 5 = "+a.fact(5));
	}
}
