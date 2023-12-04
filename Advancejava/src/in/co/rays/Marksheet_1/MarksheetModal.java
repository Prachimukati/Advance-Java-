package in.co.rays.Marksheet_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.Marksheet.Bean;

public class MarksheetModal {

	public void add(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?)");
		ps.setInt(1,bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoll_num());
		
		int i = ps.executeUpdate();
		System.out.println("Data inserted="+1);
		
	}	
	public void update(MarksheetBean bean ) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("update marksheet set name = ?,roll_num=? where id = ?");
		ps.setInt(3, bean.getId());
		ps.setString(1,bean.getName());
		ps.setInt(2, bean.getRoll_num());
		
		int  i =ps.executeUpdate();
		System.out.println("Data updated="+i);
	}
	public void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id=?");
		ps.setInt(1,id);
		int i = ps.executeUpdate();
		System.out.println("Data deleted="+i);
	}
	public MarksheetBean findbyId( int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet where id=?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;
		
		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoll_num(rs.getInt(3));
			
		}
		return bean;
	}
	public List search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet ");
		ResultSet rs= ps.executeQuery();
		List list = new ArrayList();
		
		while (rs.next()) {
			MarksheetBean bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoll_num(rs.getInt(3));
			list.add(bean);
		}
		return list;	
		
	}
	
	public Integer nextid() throws Exception {
		int id = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			id = rs.getInt(1);	
		}
		return id + 1;
		
		
	}
	
	
	
	
	
	
}
