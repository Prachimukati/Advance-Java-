package in.co.rays.Marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) throws Exception {
	
	
	//testAdd();
	//testfindbyid();
	testsearch();
}
private static void testAdd() throws Exception {
	
	
	Bean bean = new Bean();
	bean.setName("vedant");
	bean.setRoll_num(121);
	
	Model md = new Model();
	md.add1(bean);
}


private static void testsearch() throws Exception {
	Model md = new Model();
	Bean bean = new Bean();
	List list = md.search(bean,1,10);
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		
		Bean bn = (Bean) it.next();
		System.out.println(bn.getId());
		System.out.println(bn.getName());
		System.out.println(bn.getRoll_num());
		
		
	}
	
}

private static void testfindbyid() throws Exception {
  Model md = new Model();
  Bean bn  =  (Bean) md.findbyId(6);
  if (bn!=null) {
	
	  System.out.print(bn.getId());
	  System.out.print("\t"+bn.getName());
	  System.out.println(bn.getRoll_num()); 
	  
} else {
     System.out.println("Id does not exist....!");
}
	
}
}
