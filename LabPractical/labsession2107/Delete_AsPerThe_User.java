package labsession2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Delete_AsPerThe_User {

	public static void main(String[] args) 
	{
		Map<Teacher,String> map = new LinkedHashMap <Teacher,String>();
		
		map.put(new Teacher("Samik","Java"),"Software Faculty");
		map.put(new Teacher("Swati","C"),"Assistent Prof.");
		map.put(new Teacher("Amrin","C++"),"Hod");
		map.put(new Teacher("Jasmin","Python"),"Co ordinator");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the teacher name : ");
		String tn = sc.nextLine();
		
		System.out.println("Enter the subject : ");
		String sb = sc.nextLine();
		
		System.out.println(map.remove (new Teacher(tn,sb)));
	}

}
