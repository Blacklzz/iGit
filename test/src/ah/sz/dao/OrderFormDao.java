package ah.sz.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ah.sz.bean.OrderForm;
import ah.sz.util.DBUtil;

public class OrderFormDao {
	
	public void add(OrderForm form) throws SQLException
	{
		Connection conn = DBUtil.getConn();
		
		String sql = "insert into tbl_orderform(cost,orderdate,customer_id,shipaddress_id)  values(?,?,?,?)";
    	PreparedStatement st = conn.prepareStatement(sql);
    	st.setDouble(1,form.getCost());
    	Date newFormatDate = new Date(form.getOrderDate().getTime());
    	st.setDate(2,newFormatDate);
    	st.setLong(3,form.getCustomer_id());
    	st.setLong(4,form.getShipAddress_id());
    	
    	st.execute();
	}
	
	public  Long getId(OrderForm form) throws SQLException
	{
		Connection conn = DBUtil.getConn();
		
		String sql = "select orderform_id from tbl_orderform where cost=? and orderdate=? and customer_id=? and shipaddress_id=?";
    	PreparedStatement st = conn.prepareStatement(sql);
    	st.setDouble(1, form.getCost());
    	Date newFormatDate = new Date(form.getOrderDate().getTime());
    	st.setDate(2,newFormatDate);
    	st.setLong(3,form.getCustomer_id());
    	st.setLong(4,form.getShipAddress_id());
    	
    	ResultSet rs= st.executeQuery();
    	Long orderForm_id = -1L;
    	if(rs.next())
    	{
    		orderForm_id =  rs.getLong("orderform_id");	
    	}
		return orderForm_id;
    	
	}

}
