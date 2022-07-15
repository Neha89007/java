package labsession1407;

import java.util.ArrayList;
import java.util.List;

public class Check_Elements_InTwoAl {

	public static void main(String[] args) 
	{
		ArrayList<String> firstList=new ArrayList<String>();   
		firstList.add("Anjali");  
		firstList.add("Neha");  
		firstList.add("Iqra");  
		firstList.add("Sabreen");  
		System.out.println(firstList);  
     
		List<String> secondList=new ArrayList<String>();  
		  
		secondList.add("Anjali");  
		secondList.add("Neha");  
		secondList.add("Iqra");  
		secondList.add("Sabreen");  
		System.out.println(secondList);  
  
		boolean b1 = firstList.equals(secondList);  //returns true because lists are equal 
		System.out.println("Comparing both the list : "+b1); 
		System.out.println(" ");
		
		secondList.add("Afsha");
		System.out.println("After adding an element : " +secondList);
		boolean b2 = firstList.equals(secondList); //returns false because lists are not equal   
		System.out.println("Again comparing both the list : "+b2);  

	}

}
