package in.co.rays.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserModal {

	public void add(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
		ps.setInt(1,bean.getId());
		ps.setString(2,bean.getFirst_name());
		ps.setString(3, bean.getLast_name());
		ps.setString(4, bean.getLogin_id());
		ps.setString(5, bean.getPassword());
		ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(7, bean.getAddress());
		
		int i = ps.executeUpdate();
		System.out.println("Data inserted="+i);
	}	
	public List search(UserBean bean) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
	PreparedStatement ps = conn.prepareStatement("select * from marksheet");
	ResultSet rs = ps.executeQuery();
	List list = new ArrayList();
	
	while (rs.next()) {
		bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setPassword(rs.getString(7));
	}	
	return list;
		
	}
 }