package labsession0707;

import java.util.Scanner;

public class Decimal_To_Binary 
{

	public static void main(String[] args) 
	{
		int n, a, index=1;
        int arr[] = new int[100];
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        n = sc.nextInt();
		
        a = n;
		
        while(a != 0)
        {
            arr [index++] = a%2;
            a = a/2;
        }
		
        System.out.print("Binary number is: ");
        for(int i=index-1; i>0; i--)
        {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
	}

}

/* 

OUTPUT :
Input a Decimal Number : 25
Binary number is: 11001

*/