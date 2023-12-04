package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestAdd {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	PreparedStatement ps = conn.prepareStatement("insert into marksheet values(16,'preet',22)");
	int i = ps.executeUpdate();
	System.out.println("Data inserted="+i);
}
}