package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test3 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	Statement stmt = conn.createStatement();
	
	int  i = stmt.executeUpdate("insert into marksheet values(8,'radhe',90,98,78,13)");
	System.out.println("Data inserted="+i);
}
}
