package ah.sz.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ah.sz.bean.Customer;
import ah.sz.dao.CustomerDao;

public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		//System.out.println("登录注册");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String telephone = req.getParameter("telephone");
		String zip = req.getParameter("zip");
		String address = req.getParameter("address");
		String email = req.getParameter("email");
		Customer c= new Customer(null, name, password, telephone, email, address, zip);
		//System.out.println(c);//直接打印对象，调用对象toString方法 
		
		CustomerDao  dao = new CustomerDao();
		try {
			Customer c2 = dao.getByName(name);
			if(c2==null)
			{
				 dao.add(c);
				 req.setAttribute("msg", "注册成功请登录");
				 req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
     		else
			{
			    req.setAttribute("msg", "该用户名已被占用请重新选择");
			    req.getRequestDispatcher("register.jsp").forward(req, resp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("msg", "数据库异常");
		    req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
		
	}
    @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);
}
}
