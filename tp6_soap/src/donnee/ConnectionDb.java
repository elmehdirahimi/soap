package donnee;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionDb { 

	private static Connection con = null; 

	static
	{ 
		String url = "jdbc:mysql://localhost:3306/ecole"; 
		String user = "root"; 
		String pass = ""; 
		try { 
			Class.forName("com.mysql.jdbc.Driver"); 
			con = (Connection) DriverManager.getConnection(url, user, pass); 
		} 
		catch (ClassNotFoundException | SQLException e) { 
			e.printStackTrace(); 
		} 
	} 
	public static Connection getConnection() 
	{ 
		return con; 
	} 
} 
