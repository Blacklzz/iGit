package ah.sz.bean;

public class ShipAddress {
      private Long shipAddress_id;
      private String adres;
      private String phoneNumber;
      private String shipuname;
      private Long customer_id;
	public Long getShipAddress_id() {
		return shipAddress_id;
	}
	public void setShipAddress_id(Long shipAddress_id) {
		this.shipAddress_id = shipAddress_id;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getShipuname() {
		return shipuname;
	}
	public void setShipuname(String shipuname) {
		this.shipuname = shipuname;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public ShipAddress(Long shipAddress_id, String adres, String phoneNumber,
			String shipuname, Long customer_id) {
		super();
		this.shipAddress_id = shipAddress_id;
		this.adres = adres;
		this.phoneNumber = phoneNumber;
		this.shipuname = shipuname;
		this.customer_id = customer_id;
	}
	public ShipAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ShipAddress [shipAddress_id=" + shipAddress_id + ", adres="
				+ adres + ", phoneNumber=" + phoneNumber + ", shipuname="
				+ shipuname + ", customer_id=" + customer_id + "]";
	}
      
      
      
}
