package ah.sz.test;



import ah.sz.bean.Book;
import ah.sz.dao.BookDao;

public class CURDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao dao = new BookDao();
//		List<Book> books=dao.getAll();
//		for(Book book : books){
//			System.out.println(book);
//		}
//		dao.insert(new Book(11L,"android",78.0));
 //    	dao.update(new Book(11L,"newandroid",98.0));
//		dao.delete(11L);
		try{
		     Book b = dao.getById(1L);
				if(b!=null)
				{
					  System.out.println(b);
				}
	                 }catch(RuntimeException e)
	                 {
	                	 System.out.println(e.getMessage());
	                 }
		}

}
