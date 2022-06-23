package labsession2306;
import java.util.Arrays;
public class Student_Main 
{
	
	
	private static Student[] StudentArrayCreation() 
	 {
		Student s1=new Student ("Neha",1,"AI",89);
		Student s2=new Student ("Sanjivani",3,"MIS",87);
		Student s3=new Student ("Afsha",4,"ERP",90);
		Student s4=new Student ("Iqra",12,"IPR",72);
		Student[] arr = {s1,s2,s3,s4};
		
		 return arr;	
	 }

	
	private static void name_Comparator_Call(Student[] arr) 
	{
		  
		  System.out.println(" NAME");
		  
		  Arrays.sort(arr, new Name_Comparator());
		  
		  for(Student s : arr)
		  {
		   System.out.println(s + " ");
		  }
		  System.out.println();
		  System.out.println("-------------------------");
		 }
	
				
	private static void marks_Comparator_Call(Student[] arr) {
		  
		  System.out.println(" MARKS");
		  
		  Arrays.sort(arr, new Marks_Comparator());
		  
		  for(Student s : arr)
		  {
		   System.out.println(s + " ");
		  }
		  System.out.println();
		  System.out.println("-------------------------");
		 }
		 
			
	
	public static void main(String[] args) 
	{
		 Student[] arr = StudentArrayCreation();
		  
		  name_Comparator_Call(arr);
		  
		  marks_Comparator_Call(arr);
		
	}
	
}
