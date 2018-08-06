package ah.sz.test;

import java.sql.Connection;


import java.sql.SQLException;

import ah.sz.util.DBUtil;

@SuppressWarnings("unused")
public class ConnectionTest {

	public static void main(String[] args)   {
     Connection conn = DBUtil.getConn();
     if(conn!=null)
     {
    	 System.out.println("链接数据库成功");
     }
     else
     {
    	 System.out.println("链接数据库失败"); 
     }
	}

}
