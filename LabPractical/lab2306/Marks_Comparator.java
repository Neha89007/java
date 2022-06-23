package labsession2306;
import java.util.Comparator;
public abstract class Marks_Comparator implements Comparator <Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		
		return (int)(o1.marks-o2.marks);
	}
		
}
