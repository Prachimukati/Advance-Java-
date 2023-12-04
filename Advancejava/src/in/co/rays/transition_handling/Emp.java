package in.co.rays.transition_handling;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Type;


public class Emp {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	CallableStatement callstmt = conn.prepareCall("{Call empIn(?)}");
	callstmt.setInt(1, Type.INT);
	System.out.println(callstmt.getInt(1));
	
	
}
}
