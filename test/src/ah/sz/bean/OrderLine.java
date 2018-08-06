package ah.sz.bean;

public class OrderLine {
   private Long orderline_id;
   private Integer num;
   private Book book;
   private Long orderfrom_id;
public Long getOrderline_id() {
	return orderline_id;
}
public void setOrderline_id(Long orderline_id) {
	this.orderline_id = orderline_id;
}
public Integer getNum() {
	return num;
}
public void setNum(Integer num) {
	this.num = num;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public Long getOrderfrom_id() {
	return orderfrom_id;
}
public void setOrderfrom_id(Long orderfrom_id) {
	this.orderfrom_id = orderfrom_id;
}
public OrderLine(Long orderline_id, Integer num, Book book, Long orderfrom_id) {
	super();
	this.orderline_id = orderline_id;
	this.num = num;
	this.book = book;
	this.orderfrom_id = orderfrom_id;
}
public OrderLine() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "OrderLine [orderline_id=" + orderline_id + ", num=" + num
			+ ", book=" + book + ", orderfrom_id=" + orderfrom_id + "]";
}
   
   

}
