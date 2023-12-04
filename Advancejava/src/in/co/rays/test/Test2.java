package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root" );
	Statement stmt = conn.createStatement();
	int i = stmt.executeUpdate("delete from marksheet where id = 3");
	//int i = stmt.executeUpdate("insert into marksheet values(7,'vijay',80,80,70,13)");
	System.out.println("data inserted ="+i);
	
}
}
