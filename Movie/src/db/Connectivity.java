package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
	public static Connection dbConnect() {
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Movie", "root", "root");
		System.out.println(con);
		
	} catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
	return con;
	
 }
	
}
