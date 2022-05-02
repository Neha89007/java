package Practice;

public class StringBuilderS1
{
	public static void main(String[] args)
	{
		String s1= "Neha";
		StringBuilder sb1 = new StringBuilder("Iqra");
		
		s1.concat("Ansari");
		sb1.append("Khan");
		
		System.out.println(s1);
		System.out.println(sb1);
		
		System.out.println("String is immutable and StringBuilder is not immutable");
		
		
	}
}