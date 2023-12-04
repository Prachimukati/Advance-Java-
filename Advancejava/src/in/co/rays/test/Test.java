package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	
public static void main(String[] args) throws Exception {
	
	//Class.forName("com.mysql.cj.jdbs.Driver");
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
	Statement stmt = conn.createStatement();
	int i = stmt.executeUpdate("insert into marksheet values(6,'meet',90,67,56,12)");
	System.out.println("Data inserted="+i);
	
}
}
