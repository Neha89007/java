import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the prevous population");
	   int x  = sc.nextInt();
	   
	   System.out.println("Enter the population after a decade");
	   int y  = sc.nextInt();
	   
	   double pop = y - x;
	   System.out.println("population increased in 10 years ="+ pop);
	   System.out.println(" ");
	   
	   double IncPer =( pop / x ) * 100;
	   System.out.println("increased percentage in 10 years =" + IncPer+ "%");
	   System.out.println(" ");
	   
	   double per = IncPer/10;
	   System.out.println("increased percentage for 1 years =" + per+ "%");
	   System.out.println(" ");
	}
}
