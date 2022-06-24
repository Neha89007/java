package rectangle;

import java.util.Scanner;

public class Rectangle_Main {

	public static void main(String[] args) 
	{
		callRectangle();
	}
	
	private static void callRectangle() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle = ");
		int l = sc.nextInt();
		
		System.out.println("Enter the breadth of the rectangle = ");
		int b = sc.nextInt();
		
		Rectangle r1 = new Rectangle(l, b);
		
		System.out.println(r1);
	}

}
