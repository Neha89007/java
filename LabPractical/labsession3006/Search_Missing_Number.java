package labsession3006;

import java.util.Scanner;

public class Search_Missing_Number 
{ 
	static int missingNumber (int arr[], int n)
	{
		int temp = 0;
		int sum = 0;
		
		for (int i=0; i<n-1; i++)
		{
			sum += arr[i];
		}
		temp = n * (n + 1) / 2;
		
	return (temp-sum);
	}

	public static void main(String[] args) 
	{
		 @SuppressWarnings("resource")
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the n value: ");
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      System.out.println("Enter (n-1) numbers: ");
	      for(int i=0; i<n-1; i++)
	      {
	         arr[i] = sc.nextInt();
	      }
	      for (int i = 0; i < n ; i++) 
	      {
	    	     for (int j = i + 1 ; j < n ; j++) 
	    	     {
	    	          if (arr[i]==(arr[j])) 
	    	          {
	    	        	  throw new IllegalArgumentException("There is duplicate number in a series");
	    	          }
	    	     }
	    	 }

	      System.out.println("The missing number in the series is :");
	      System.out.println(missingNumber(arr,n));
	}
}
