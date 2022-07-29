package DML_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Data 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String update="update project1.employees set Name=\"Hello\";";
		
		Connection con=null;
		Statement stmt=null;
		try 
		{
			Class.forName(driver);
			System.out.println("Driver Loaded...");
			
			con=DriverManager.getConnection(url,"root","password123");
			System.out.println("Connection established succesfully ...");
			
			stmt=con.createStatement();
			System.out.println("Statement created succesfully ...");
			
			stmt.execute(update);
			System.out.println("Data updated");

	    }
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
