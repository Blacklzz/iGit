package ah.sz.web;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ah.sz.bean.Book;
import ah.sz.dao.BookDao;

public class ServletContextListenerImpl implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
//     System.out.println("服务器已停用");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
//		System.out.println("服务器已启用");
		BookDao dao=new BookDao();
		List<Book> books = dao.getAll();
		event.getServletContext().setAttribute("books", books);

	}

}
