package labsession0707;

public class Emp_ObjectCheck 
{
	private int Id;  
	private String name;
	private double sal;  
	private String des;
	
	public Emp_ObjectCheck(int id, String name, double sal, String des) 
	{
		this.Id = id;
		this.name = name;
		this.sal = sal;
		this.des = des;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj == null)   
			return false;  
		if (obj == this)  
			return true;  
		
		return this.getId() == ((Emp_ObjectCheck) obj). getId(); 
	}  
	
	
	
}
