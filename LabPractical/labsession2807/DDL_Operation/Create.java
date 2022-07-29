package DDL_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Create {

		public static void main(String[] args) 
		{
			String url = "jdbc:mysql://localhost:3306/project1";
			String driver = "com.mysql.cj.jdbc.Driver";
			String create="CREATE TABLE `project1`.`employees` (`emp_id` INT NOT NULL,`Name` CHAR(45) NOT NULL, `dept` CHAR(45) NOT NULL,`sal` DECIMAL(12,2) NOT NULL,PRIMARY KEY(`emp_id`), UNIQUE INDEX `emp_id_UNIQUE` (`emp_id` ASC) VISIBLE);";
			
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
				
				stmt.execute(create);
				System.out.println("Table created");

			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				
				e.printStackTrace();
			}
	}

}
