package practice;

public class Students 
{
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Percentage who are below 8years of AGE");
		int a=sc.nextInt();
		
		int b=100-a;
		System.out.println("The number of student below 8 years:"+b);
		
		double y= 48 + (48/4);
		System.out.println("The number of student above 8 years:"+y);
		
		double z= (100/y)*b;
		System.out.println("Total number of students in the school:"+z);
		}
}