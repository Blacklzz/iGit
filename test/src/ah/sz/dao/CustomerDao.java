package ah.sz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ah.sz.bean.Customer;
import ah.sz.util.DBUtil;

public class CustomerDao {
	
	public  Customer getByName(String name) throws SQLException
	{
		Customer c = null;
		Connection conn = DBUtil.getConn();
		String sql = "select * from tbl_customer where name=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, name);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			c = new Customer(rs.getLong("customer_id"), rs.getString("name"), rs.getString("password"),rs.getString("telephone"), rs.getString("email"), rs.getString("address"), rs.getString("zip"));	
		}
		return c;
	}

	public void add(Customer c) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConn();
		String sql = "insert into tbl_customer(name,password,telephone,email,address,zip)  values(?,?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql );
		st.setString(1,c.getName());
		st.setString(2,c.getPassword());
		st.setString(3,c.getTelephone());
		st.setString(4,c.getEmail());
		st.setString(5,c.getAddress());
		st.setString(6,c.getZip());
		st.execute();	
	}

	public Customer login(String name, String password) throws SQLException{
		// TODO Auto-generated method stub
		Customer c = null;
		Connection conn = DBUtil.getConn();
		String sql = "select * from tbl_customer where name =? and password=?";
		PreparedStatement st = conn.prepareStatement(sql );
		st.setString(1, name);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			c = new Customer(rs.getLong("customer_id"), rs.getString("name"), rs.getString("password"),rs.getString("telephone"), rs.getString("email"), rs.getString("address"), rs.getString("zip"));	
		}
		return c;
		//return null;
	}

}
