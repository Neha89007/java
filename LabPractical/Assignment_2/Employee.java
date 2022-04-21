class Employee
{
	Employee()
	{
		System.out.println("Employee name : Amit");
		System.out.println("Employee salary and location given below :");
	}
	
	Employee(int s , String l)
	{
		this();
		System.out.println(s+" "+l);	
	}
}

public class Main
{
	public static void main(String args[])
	{
		Employee e=new Employee(25000,"Mumbai");
	}
}