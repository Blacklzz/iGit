package ah.sz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ah.sz.bean.Book;
import ah.sz.util.DBUtil;



public class BookDao {
	
       public  List<Book> getAll(){ 	 
    	   Connection conn = DBUtil.getConn();
    	   List<Book> books = new ArrayList<Book>();
    	   Book b = null;
    	   
 	       try {
			Statement st = conn.createStatement();
	    	   String sql = "select * from tbl_book";
	    	   ResultSet rs  =st.executeQuery(sql);
	    	   while(rs.next())
	    	   {
	    		   b= new Book();
	    		   b.setBook_id(rs.getLong("book_id"));
	    		   b.setName(rs.getString("name"));
	    		   b.setPrice(rs.getDouble("price"));
	    		   books.add(b);
	    	   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}   	    	   
   	  return books;   
    }
       
       public void insert(Book b)              //插入
       {
    	  Connection conn = DBUtil.getConn();  //ctrl+2 L
    	  String sql = "insert into tbl_book(book_id,name,price) values(?,?,?)";
    	  try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setLong(1, b.getBook_id());
			st.setString(2, b.getName());
			st.setDouble(3, b.getPrice());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
       
       public void update(Book b)              //更新
       {
    	  Connection conn = DBUtil.getConn();  //ctrl+2 L
    	  String sql = "update tbl_book  set name =?,price=? where book_id =?";
    	  try 
    	  {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, b.getName());
			st.setDouble(2, b.getPrice());
			st.setLong(3, b.getBook_id());
			st.execute();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
       
       public void delete(Long book_id)         //删除
       {
    	  Connection conn = DBUtil.getConn();  //ctrl+2 L
    	  String sql = "delete from tbl_book where book";
    	  try 
    	  {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setLong(1, book_id);
			st.execute();
		} catch (SQLException e)
       {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
     
       
       public  Book getById(Long book_id) throws RuntimeException
       { 	 
    	   Connection conn = DBUtil.getConn();
    	   Book b = null;
    	   
 	       try {
			Statement st = conn.createStatement();
	    	   String sql = "select * from tbl_book where book_id ="+ book_id;
	    	   ResultSet rs  =st.executeQuery(sql);
	    	   if(rs.next())
	    	   {
	    		   b= new Book();
	    		   b.setBook_id(rs.getLong("book_id"));
	    		   b.setName(rs.getString("name"));
	    		   b.setPrice(rs.getDouble("price"));
	    
	    	   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException ("SQL语句出错");
		}   	    	   
   	  return b;   
    }
           
}