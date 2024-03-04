package session_06;

public class Employee extends Object{
	
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee = "+empId+" "+empName;
	}

	@Override
	public boolean equals(Object obj)//Object obj = e2;
	{
		Employee e =(Employee) obj;
		if((this.empId==e.empId)&&
				(this.empName.equals(e.empName)))
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(111,"Rahul");
		Employee e2= new Employee(111, "Tejas");
		
		/*if(e1==e2)//checks equality of references
		{
			System.out.println("Are Equal");
		}
		else
		{
			System.out.println("Are not equal");
		}*/
		
		if(e1.equals(e2))
		{
			System.out.println("Objects are equal");
		}
		else
			System.out.println("Objects are not equal");
		
	}
}
