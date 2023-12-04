package in.co.rays.transition_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Emoyee2 {
public static void main(String[] args) throws Exception {
	
	Connection conn = null ;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into emp values(2,'pratha',120000)");
		i = stmt.executeUpdate("insert into emp values(2,'madhu',130000)");
		i = stmt.executeUpdate("insert into emp values(3,'vedant',140000)");
		
		conn.commit();
		System.out.println("Data inserted="+i);
	}
	catch (Exception e) {
	conn.rollback();
	}
}
	
}
