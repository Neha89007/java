package loading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Loading {

	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		 Connection cn = null;
		try 
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			
			cn = DriverManager.getConnection(url, "root", "password123");
			System.out.println("Connection Establish successfully");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Problem while loading/connecting the driver");
			e.printStackTrace();
		} 
		
		try 
		{
			cn.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
