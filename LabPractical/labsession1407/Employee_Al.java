package labsession1407;

import java.util.Objects;

public class Employee_Al 
{
	 private int id;
	 private String name;
	 private String dept;
	 
	public Employee_Al(int id, String name, String dept) 
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof Employee_Al) 
		{
            return (((Employee_Al) obj).name == name && ((Employee_Al) obj).dept == dept);
        }
        return false;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name,dept);
	}


}
