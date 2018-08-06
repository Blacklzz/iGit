package ah.sz.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {

	private Map<Long,OrderLine> cart = new HashMap<Long, OrderLine>();
	
	public Map<Long,OrderLine> getMap()
	{
		return cart;
	}
	
	public void add(OrderLine line)
	{
		cart.put(line.getBook().getBook_id(), line);
		
	}
	
	public OrderLine get(Long book_id)
	{
		return cart.get(book_id);
	}
	public int size()
	{
		return cart.size();
	}
	
	public double totalPrice()
	{
		double sum=0.0;
		Collection<OrderLine> values = cart.values();
		for(OrderLine line : values)
		{
			sum +=(line.getNum()) * (line.getBook().getPrice());
		}
	
		return sum;
		}

	public void remove(long book_id) {
		// TODO Auto-generated method stub
		cart.remove(book_id);
	}
}
