package ah.sz.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ah.sz.bean.Cart;
import ah.sz.bean.Customer;
import ah.sz.dao.CustomerDao;


public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
      String name = req.getParameter("name");
      String password = req.getParameter("password");
      CustomerDao dao = new CustomerDao();
      try {
		Customer c = dao.login(name,password);
	 
      if(c==null)
	{
		req.setAttribute("msg","账号密码不正确请重新登录");
		req.getRequestDispatcher("login.jsp").forward(req,resp);
	}
	else
	{
		HttpSession session = req.getSession();
		session.setAttribute("customer",c);
		Cart cart = new Cart();
		session.setAttribute("cart", cart);
		req.setAttribute("msg","登陆成功");
		req.getRequestDispatcher("index1.jsp").forward(req, resp);
	}
		
	}
     catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		req.setAttribute("msg","数据库异常请重新登录");
		req.getRequestDispatcher("login.jsp").forward(req,resp);
	 }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doPost(req, resp);
    	doGet(req,resp);
    }
}
