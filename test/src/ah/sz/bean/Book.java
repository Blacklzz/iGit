package ah.sz.bean;

public class Book {
	private long book_id;
	private String name;
	private Double price;
	public long getBook_id() {
		return book_id;
	}
	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book(long book_id, String name, Double price) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "Book [book_id=" + book_id + ",name=" + name + ", price=" + price + "]";
	}
}
