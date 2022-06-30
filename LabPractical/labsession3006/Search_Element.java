package labsession3006;

import java.util.Scanner;

public class Search_Element 
{

	public static void main(String[] args) 
	{
		int n, a, i;
		int index = 0;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter array elements = ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element you want to find = ");
        a = sc.nextInt();
        
        for(i = 0; i < n; i++)
        {
            if(arr[i] == a)
            {
                index = 1;
                break;
            }
            else
            {
                index = 0;
            }
        }
        if(index == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
        	System.out.println("Element not found");
        }
       
	}

}
