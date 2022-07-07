package labsession0707;

public class Check_Equal_Objects {

	public static void main(String[] args) 
	{
		Emp_ObjectCheck emp1 = new Emp_ObjectCheck(918, "Maria", 25000, "abc");  
		Emp_ObjectCheck emp2 = new Emp_ObjectCheck(918, "Maria", 25000, "abc");
		Emp_ObjectCheck emp3 = new Emp_ObjectCheck(919, "Hira", 35000, "xyz");
		Emp_ObjectCheck emp4 = new Emp_ObjectCheck(917, "Sonu", 27000, "pqr");
		  
		int a=emp1.hashCode();  
		int b=emp2.hashCode();
		int c=emp2.hashCode();
		int d=emp2.hashCode();
		
		System.out.println("hashcode of emp1 = " + a);  
		System.out.println("hashcode of emp2 = " + b);
		System.out.println("hashcode of emp3 = " + c);  
		System.out.println("hashcode of emp4 = " + d);  
		
		System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));
		System.out.println("Comparing objects emp1 and emp2 = " + emp3.equals(emp4));

	}

}

/*

OUTPUT :
hashcode of emp1 = 1072591677
hashcode of emp2 = 1523554304
hashcode of emp3 = 1523554304
hashcode of emp4 = 1523554304
Comparing objects emp1 and emp2 = true
Comparing objects emp1 and emp2 = false

*/

