package ah.sz.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ah.sz.bean.Cart;
import ah.sz.bean.Customer;
import ah.sz.bean.OrderForm;
import ah.sz.bean.OrderLine;
import ah.sz.bean.ShipAddress;
import ah.sz.dao.OrderFormDao;
import ah.sz.dao.OrderLineDao;
import ah.sz.dao.ShipAddressDao;

public class SubmitServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
    	 String name = req.getParameter("name");
    	 String address = req.getParameter("address");
    	 String tel = req.getParameter("tel");
    	 
    	 ShipAddressDao shipAddressDao = new ShipAddressDao();
    	 OrderFormDao orderFormDao = new OrderFormDao();
    	 OrderLineDao orderLineDao = new OrderLineDao();
    	 
    	 
    	 HttpSession session = req.getSession();
    	 Customer c = (Customer) session.getAttribute("customer");
    	 Cart cart = (Cart) session.getAttribute("cart");
    	 	
    	 Long customer_id = c.getCustomer_id();
    	 
		ShipAddress sa = new ShipAddress(null, address, tel, name, customer_id);
		try {
			shipAddressDao.add(sa);
			Long shipAddress_id = shipAddressDao.get(sa);
			System.out.println("shipaddress_id ="+ shipAddress_id);
			
			OrderForm form = new OrderForm(null,customer_id,shipAddress_id,cart.totalPrice(),new Date());
			orderFormDao.add(form);
		    Long orderForm_id = orderFormDao.getId(form);
			System.out.println("orderFrom_id="+orderForm_id);
		    Map<Long,OrderLine> map =cart.getMap();
			 Collection<OrderLine> values = map.values();
			 for (OrderLine line : values) {
				OrderLine newLine = new OrderLine(null,line.getNum(),line.getBook(),orderForm_id);
				orderLineDao.add(newLine);
			}
			   resp.sendRedirect("loginAfter/comfirmSuc.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
