package labsession2107;

import java.util.HashMap;

public class Retrieve_From_HashMap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,MapData> hm = new HashMap<Integer,MapData>();
		
		MapData m1=new MapData(25, "John"); 
		MapData m2=new MapData(39, "Roman"); 
		MapData m3=new MapData(42, "Rock"); 
		MapData m4=new MapData(18, "Khali"); 
		
		hm.put(1,m1);
		hm.put(2,m2);
		hm.put(3,m3);
		hm.put(4,m4);
		
		 for(HashMap.Entry<Integer, MapData> entry : hm.entrySet())
		 {
			 int key = entry.getKey();  
			 MapData m = entry.getValue();  
		     System.out.println(key+" Details:");   
		     System.out.println(m.id+" "+m.name); 
		     System.out.println(" ");
		 }
		

	}

}
