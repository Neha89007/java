import java.util.Scanner;

public class ReverseString
{
	public static void main(String args[])
	{
		
		String str="",revStr="";
		
		Scanner n = new Scanner(System.in);
		
		
		System.out.print("Enter a string :");
		str= n.nextLine();
		
		
		int len= str.length();

	
		for ( int i = len- 1 ; i >= 0 ; i-- )
			revStr= revStr+ str.charAt(i);

	
		System.out.println("Reverse String is: "+revStr);
	}
}