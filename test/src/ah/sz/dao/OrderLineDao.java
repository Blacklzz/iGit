package ah.sz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ah.sz.bean.OrderLine;
import ah.sz.util.DBUtil;

public class OrderLineDao {
	
	public  void add(OrderLine line) throws SQLException
	{
		Connection conn = DBUtil.getConn();
		String sql = "insert into tbl_orderline(num,book_id,orderform_id) values(?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1,line.getNum());
		st.setLong(2, line.getBook().getBook_id());
		st.setLong(3, line.getOrderfrom_id());
		st.execute();
	}

}
