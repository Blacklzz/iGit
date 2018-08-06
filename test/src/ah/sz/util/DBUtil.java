package ah.sz.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/estore?serverTimezone=UTC&characterEncoding=utf8";
	private static String user = "root";
	private static String password = "szxy";
	  public static Connection  getConn() 
	  {
		  Connection conn = null;
			try {
				Class.forName(driver);
				conn =DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return conn;
			}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return conn;
		}
	return conn;
	  }
}
