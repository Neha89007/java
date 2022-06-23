package labsession2306;

public class Student 
{
	String name;
	int rollno;
	String sub;
	int marks;
	
	public Student (String name,int rollno,String sub,int marks)
	{
		super();
		this.name=name;
		this.rollno=rollno;
		this.sub=sub;
		this.marks=marks;
	}

	@Override
	public String toString() 
	{
		return "String [name=" +name+ ", rollno="+rollno+", sub="+sub+", marks="+marks+"]";
	}	
}
