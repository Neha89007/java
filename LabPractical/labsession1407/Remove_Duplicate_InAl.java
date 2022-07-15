package labsession1407;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_InAl 
{

	public static void main(String[] args) 
	{
		Employee_Al e1 = new Employee_Al (101, "Sam", "abc");
		Employee_Al e2 = new Employee_Al (102, "Tony", "xyz");
		Employee_Al e3 = new Employee_Al (101, "Sam", "abc");
		Employee_Al e4 = new Employee_Al (104, "Jack", "pqr");
		Employee_Al e5 = new Employee_Al (105, "John", "lmn");
		
		ArrayList<Employee_Al> list = new ArrayList<Employee_Al>();
		 
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 list.add(e4);       
		 list.add(e5);
		 
		 System.out.println("Original list :");
		  Iterator<Employee_Al> itr = list.iterator();
			while(itr.hasNext())
			{
				Employee_Al E1 = (Employee_Al)itr.next();
				System.out.println(E1.getId()+" "+E1.getName()+" "+E1.getDept());
			}
			System.out.println(" ");
		 
			Set<Employee_Al> s = new LinkedHashSet<Employee_Al>(list);
			System.out.println("After removing duplicate element :");
			Iterator<Employee_Al> itr1 = s.iterator();
			while(itr1.hasNext())
			{
				Employee_Al E2 = (Employee_Al)itr1.next();
				System.out.println(E2.getId()+" "+E2.getName()+" "+E2.getDept());
			}
	}
}

