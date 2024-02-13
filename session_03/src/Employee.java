public class Employee {
	
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employee() {}

	public Employee(int empId, String empName, 
			float empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", "
				+ "empName=" + empName + ", "
						+ "empSal=" + empSal + "]";
	}
	
	static
	{
		System.out.println("Static Block Called!!!");
		count = 60;
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called!!");
	Employee e1 = new Employee(111,"rahul",56132.89f);
		System.out.println(e1);
	Employee e2 = new Employee(222,"Aishwarya",647364.9f);
		System.out.println(e2);
	Employee e3 = new Employee(333,"Pratik",728424.89f);
		System.out.println(e3);
		
	System.out.println("Employee Count = "
	+Employee.getCount());	
	}
}
