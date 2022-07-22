package labsession2107;

import java.util.Objects;

import labsession1407.Employee_Al;

public class Teacher 
{
	private String name;
	private String sub;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Teacher(String name, String sub) 
	{
		this.name = name;
		this.sub = sub;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,sub);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof Employee_Al) 
		{
            return (((Teacher) obj).name == name && ((Teacher) obj).sub == sub);
        }
        return false;
	}
	
	
	
}
