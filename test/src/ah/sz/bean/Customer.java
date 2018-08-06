package ah.sz.bean;

public class Customer {
    private Long customer_id;
    private String name;
    private String password;
    private String telephone;
    private String email;
    private String address;
    private String zip;
    
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name
				+ ", password=" + password + ", telephone=" + telephone
				+ ", email=" + email + ", address=" + address + ", zip=" + zip
				+ "]";
	}
	public Customer(Long customer_id, String name, String password,
			String telephone, String email, String address, String zip) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
		this.zip = zip;
	}

	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
    
    
}
