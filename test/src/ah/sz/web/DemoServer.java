package ah.sz.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServer extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		//System.out.println("doGet已被调用");
		String name = req.getParameter("name");
		String pwd = req.getParameter("pw");
//		System.out.println("name=" +name+ "pwd=" + pwd);
//		
//		List<String> data = new ArrayList<String>();
//		data.add("beijing");
//		data.add("nanjing");
//		data.add("nanjing");
//		req.setAttribute("cities", data);
		if(name.equals("t1"))
		{
			req.setAttribute("msg","恭喜你登录成功！");
			req.getRequestDispatcher("demo.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("msg","密码错误请从新登录");
			req.getRequestDispatcher("demo2.jsp").forward(req, resp);
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
 
