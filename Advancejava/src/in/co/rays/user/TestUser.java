package in.co.rays.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUser {
public static void main(String[] args) throws Exception {

	//testadd();
	testsearch();
}

private static void testsearch() throws Exception {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	UserBean bean = new UserBean();
	bean.setDob(sdf.parse("2023-11-1"));
	
	UserModal modal = new UserModal();
	List list = modal.search(bean);
	
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		bean =  (UserBean) it.next();
		
		System.out.print(bean.getId());
		System.out.print("\t"+bean.getFirst_name());
		System.out.print("\t"+bean.getLast_name());
		System.out.print("\t"+bean.getLogin_id());
		System.out.print("\t"+bean.getPassword());
		System.out.print("\t"+bean.getDob());
		System.out.println("\t"+bean.getAddress());
		
	}
	
}

private static void testadd() throws Exception {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
	
	UserBean bean = new UserBean();
	bean.setId(3);
	bean.setFirst_name("depanshi");
	bean.setLast_name("mukati");
	bean.setLogin_id("dipanshimukati@gmail.com");
	bean.setPassword("456");
	bean.setDob(sdf.parse("2005-06-02"));
	bean.setAddress("indore");
	
	UserModal modal= new UserModal();
	modal.add(bean);
	


}
}
