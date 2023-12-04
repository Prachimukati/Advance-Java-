package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test7Alter {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	Statement stmt  = conn.createStatement();
	int i = stmt.executeUpdate("alter table marksheet add total int");
	System.out.println("Data inserted="+i);
}
}
