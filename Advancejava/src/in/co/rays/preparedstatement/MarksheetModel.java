package in.co.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoll_num());
		int i = ps.executeUpdate();
		System.out.println("Data inserted=" + i);
		
	}

	public void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps1 = conn.prepareStatement("delete from marksheet where id=?");
		ps1.setInt(1, id);
		int i = ps1.executeUpdate();
		System.out.println("Data deleted=" + i);
	}

	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps = conn.prepareStatement("update marksheet set name = ?,roll_num=? where id=?");

		ps.setInt(3, bean.getId());
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getRoll_num());

		int i = ps.executeUpdate();
		System.out.println("Data Updated=" + i);

	}
}
