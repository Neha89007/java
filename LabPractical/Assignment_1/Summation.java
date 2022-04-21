//Question No.4

import java.util.Scanner;
public class Summation
{
    public static void main(String[] args)
    {
        int sum=0 , digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        
        while(n > 0)  
        {  
  
            digit = n % 10;  
            sum = sum + digit;  
            n = n / 10;  
        }  
 
            System.out.println("Sum of Digits: "+sum);  
    }
}

*/
OUTPUT:-

Enter the number:456
Sum of Digits: 15
*/