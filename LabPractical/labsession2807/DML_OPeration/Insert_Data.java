package DML_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_Data 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String insert="INSERT INTO `project1`.`employees`(`emp_id`,`Name`,`dept`,`sal`)VALUES(?,?,?,?)";
		
		Connection con=null;
		PreparedStatement pstmt=null;
		try 
		{
			Class.forName(driver);
			System.out.println("Driver Loaded...");
			
			con=DriverManager.getConnection(url,"root","password123");
			System.out.println("Connection established succesfully ...");
			
			pstmt=con.prepareStatement(insert);
			System.out.println("Statement created succesfully ...");
			
			for(int i=0; i<4;i++)
			{
				System.out.println("Enter Employee Id:");
				int id=s.nextInt();
				
				System.out.println("Enter Employee name:");
				String name=sc.nextLine();
				
				System.out.println("Enter Department:");
				String depart=sc.nextLine();
				
				System.out.println("Enter Salary:");
				int salary=sc.nextInt();
				
				pstmt.setInt(1,id);
				pstmt.setString(2, name);
				pstmt.setString(3, depart);
				pstmt.setInt(4, salary);
				
				pstmt.executeUpdate();
				System.out.println("Data Entered successfully...");
			}
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		s.close();
		sc.close();
	}

}
