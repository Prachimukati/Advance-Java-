package in.co.rays.Marksheet_1;

import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) throws Exception {
	//testadd();
	//testupdate();
	//testdelete();
	//testfindbyid();
	testsearch();
	
}

private static void testsearch() throws Exception {
	MarksheetModal modal = new MarksheetModal();
	MarksheetBean bean = new MarksheetBean();
	List list = modal.search();
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		 bean = (MarksheetBean) it.next();
		
		System.out.println(bean.getId());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getRoll_num());
		
		
	}
	
}

private static void testfindbyid() throws Exception {
	MarksheetModal modal = new MarksheetModal();
	MarksheetBean bean =modal.findbyId(2);
	if (bean!=null) {
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getRoll_num());
		
	} else {
		System.out.println("Id does not exsist........!!!!");
	}
	
	
}

private static void testdelete() throws Exception {
	MarksheetModal modal = new MarksheetModal();
	modal.delete(11);
	
}

private static void testupdate() throws Exception {
	MarksheetBean bean = new MarksheetBean();
	bean.setId(10);
	bean.setName("chetan");
	bean.setRoll_num(19);
	
	MarksheetModal modal = new  MarksheetModal();
	modal.update(bean);
	
}

private static void testadd() throws Exception {
MarksheetBean bean = new MarksheetBean();
	bean.setId(12);
	bean.setName("ram");
	bean.setRoll_num(21);
	
	MarksheetModal modal = new MarksheetModal();
	modal.add(bean);
}

}
