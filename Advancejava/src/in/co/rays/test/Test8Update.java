package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test8Update {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	Statement stmt = conn.createStatement();
	int i = stmt.executeUpdate("update marksheet set roll_num = 9 where id = 2");
	System.out.println("Data inserted="+i);
}
}
