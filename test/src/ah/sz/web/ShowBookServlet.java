
package ah.sz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ah.sz.bean.Book;
import ah.sz.dao.BookDao;



public class ShowBookServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String idStr = req.getParameter("id");
		Long book_id = Long.parseLong(idStr);		
		BookDao dao = new BookDao();
		Book b = dao.getById(book_id);
		//System.out.println(b);
		req.setAttribute("book",  b);
		req.getRequestDispatcher("viewBook.jsp").forward(req, resp);
		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		doGet(req,resp);
		
	}

}
