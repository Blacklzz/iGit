package ah.sz.bean;

import java.util.Date;

public class OrderForm {
	
	private Long orderForm_id;
	private Long customer_id;
	private Long shipAddress_id;
	private Double cost;
	private Date orderDate;
	public Long getOrderForm_id() {
		return orderForm_id;
	}
	public void setOrderForm_id(Long orderForm_id) {
		this.orderForm_id = orderForm_id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public Long getShipAddress_id() {
		return shipAddress_id;
	}
	public void setShipAddress_id(Long shipAddress_id) {
		this.shipAddress_id = shipAddress_id;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public OrderForm(Long orderForm_id, Long customer_id, Long shipAddress_id,
			Double cost, Date orderDate) {
		super();
		this.orderForm_id = orderForm_id;
		this.customer_id = customer_id;
		this.shipAddress_id = shipAddress_id;
		this.cost = cost;
		this.orderDate = orderDate;
	}
	public OrderForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderForm [orderForm_id=" + orderForm_id + ", customer_id="
				+ customer_id + ", shipAddress_id=" + shipAddress_id
				+ ", cost=" + cost + ", orderDate=" + orderDate + "]";
	}

}
