package labsession2306;
import java.util.Comparator;
public abstract class Name_Comparator implements Comparator <Student> 
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.name.compareToIgnoreCase(o2.name);
	}
	
}
