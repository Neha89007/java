import java.util.Scanner;
public class RoofTopPoolCafeManaging 
{
	Scanner sc=new Scanner(System.in);
	RoofTopPoolCafeMain getRoofTopPoolCafe()
	{
		System.out.println("Which cafe would you like to visit???");
		String cafe=sc.nextLine();
		if(cafe.equalsIgnoreCase("Nirmal"))
		{
			System.out.println("Welcome to Nirmal Cafe");
			return RoofTopPoolCafeManaging();
		}
		else 
		{
			System.out.println("Welcome to Neha Cafe");
			return RoofTopPoolCafeManaging();
		}
		
	}
	private RoofTopPoolCafeMain RoofTopPoolCafeManaging() {
		

	return null;
	}
	
}
