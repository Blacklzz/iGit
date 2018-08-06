package ah.sz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ah.sz.bean.ShipAddress;
import ah.sz.util.DBUtil;

public class ShipAddressDao {
    public void add(ShipAddress sa) throws SQLException
    {
    	Connection conn = DBUtil.getConn();
    	String sql = "insert into tbl_shipaddress(adres,phonenumber,shipuname,customer_id)  values(?,?,?,?)";
    	PreparedStatement st = conn.prepareStatement(sql );
    	st.setString(1, sa.getAdres());
    	st.setString(2, sa.getPhoneNumber());
    	st.setString(3, sa.getShipuname());
    	st.setLong(4, sa.getCustomer_id());
    	st.execute();
    	
    }

	public Long get(ShipAddress sa) throws SQLException {
		// TODO Auto-generated method stub
	    	Connection conn = DBUtil.getConn();
	    	String sql = "select shipaddress_id  from tbl_shipaddress  where adres=? and phonenumber=? and shipuname=? and customer_id =?";
	    	PreparedStatement st = conn.prepareStatement(sql );
	    	st.setString(1, sa.getAdres());
	    	st.setString(2, sa.getPhoneNumber());
	    	st.setString(3, sa.getShipuname());
	    	st.setLong(4, sa.getCustomer_id());
	    	ResultSet rs = st.executeQuery();
		  //return null;
	    	Long shipaddress_id = -1L;
	    	if(rs.next())
	    	{
	    		shipaddress_id = rs.getLong("shipaddress_id");
	    	}
	    	return shipaddress_id;
	}
}
