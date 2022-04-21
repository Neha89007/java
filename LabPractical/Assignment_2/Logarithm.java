import java.util.Scanner;
import java.io.*;
import java.lang.*;
 
class Logarithm 
{
    public static int log2(int N)
    {
        int result = (int)(Math.log(n) / Math.log(2));
        return result;
    }
 
    public static void main(String[] args)
    {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number");
        int n = a.nextInt();
 
        System.out.println("Log " + n + " to the base 2 = " + log2(n));
    }
}