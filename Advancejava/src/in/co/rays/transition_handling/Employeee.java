package in.co.rays.transition_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employeee {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	Statement stmt = conn.createStatement();
	conn.setAutoCommit(false);
	
	int i = stmt.executeUpdate("insert into emp values(2,'pratha',120000)");
	i = stmt.executeUpdate("insert into emp values(2,'madhu',130000)");
	i = stmt.executeUpdate("insert into emp values(3,'vedant',140000)");
	
	conn.commit();
	System.out.println("Data inserted="+i);
	
}
}
