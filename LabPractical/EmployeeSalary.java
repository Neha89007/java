import java.util.Scanner;
class Main
{
    public static void main (String[] args) 
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the average of employees salary :");
        int avg = sc.nextInt() ;

	System.out.println("Enter first employee salary :");
        int E1 = sc.nextInt() ;

	System.out.println("Enter second employee salary :");
        int E2 = sc.nextInt() ;

        int E3 ;
        
        E3 = (avg * 3)-(E1 + E2);
        
        System.out.println("Salary of third empolyee is " +E3);
    }
}