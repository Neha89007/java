import java.util.Scanner;
public class CheckNum 
{

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();

        if (a == b && a == c)
        {
            System.out.println("All numbers are equal");
        }
        else if ((a == b) || (a == c) || (c == b))
        {
            System.out.println("Neither all are equal or different");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }
}