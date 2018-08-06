package ah.sz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ah.sz.bean.Book;
import ah.sz.bean.Cart;
import ah.sz.bean.OrderLine;
import ah.sz.dao.BookDao;

public class AddToCartServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String numStr = req.getParameter("num");
		String idStr = req.getParameter("id");
		 int num =  Integer.parseInt(numStr);
		 if(num>0)
		 {
		  long book_id=  Long.parseLong(idStr);
		   
		  BookDao bookDao =new BookDao();
		  Book book=bookDao.getById(book_id);
		  
		  HttpSession session = req.getSession();
		  Cart cart = (Cart)session.getAttribute("cart");
		  OrderLine line = cart.get(book_id); 
		  if(line==null)
		  {
			  line = new OrderLine(null,num,book,null);
			  cart.add(line);
			  System.out.println("新添一本书数量是" +num);
			  req.setAttribute("msg", "添加成功!");
		  }
		  else
		  {
			  int oldNum = line.getNum();
			  int newNum = oldNum + num;
			  line.setNum(newNum);
			  System.err.println("原数量已修改为" + newNum);
			  req.setAttribute("msg", "数量已修改");
		  }session.setAttribute("cart", cart);
		 // OrderLine line =  new OrderLine (null,num,book,null);
		 }
		 req.getRequestDispatcher("../index1.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		doGet(req,resp);
	}

}
