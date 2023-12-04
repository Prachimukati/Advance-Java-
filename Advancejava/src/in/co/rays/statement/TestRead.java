package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestRead {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	PreparedStatement ps = conn.prepareStatement("select * from marksheet");
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		
		System.out.print(rs.getInt(1));
		System.out.print("\t"+rs.getString(2));
		System.out.println(rs.getInt(3));
		
	}
}
}
