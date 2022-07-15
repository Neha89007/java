package labsession1407;

import java.util.Collections;
import java.util.LinkedList;

public class Reverse_LL {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		  
        list.add("Ajay");
        list.add("Vijay");
        list.add("Chandu");
        list.add("Surya");
        System.out.println("ORIGINAL LIST :");
        System.out.println(list);
        System.out.println(" ");
        
        list.addFirst("Lokesh");
        list.addLast("Harsh");
        System.out.println("LIST AFTER ADDING THE FIRST AND LAST ELEMENT : ");
        System.out.println(list);
        System.out.println(" ");
  
        Collections.reverse(list);
  
        System.out.println("REVERSED LIST : ");
        System.out.println(list);
	}

}
