package ah.sz.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ah.sz.bean.Cart;

public class DeleteOrderLineServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
    	 String idStr = req.getParameter("id");
    	 long book_id = Long.parseLong(idStr);
        HttpSession session = req.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        cart.remove(book_id);
        session.setAttribute("cart", cart); 
        resp.sendRedirect("loginAfter/shopCart.jsp");
    }
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doPost(req, resp);
    	 doGet(req,resp);
    }
}
