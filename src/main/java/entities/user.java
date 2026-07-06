package entities;

public class user {

	private int id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getusername() {
		return username;
	}
	
	public void setusername(String username) {
		this.username=username;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
	
	public Address getaddress() {
		return address;
	}
	
	public void setaddress(Address address) {
		this.address= address;
	}
	
	public String getwebsite() {
		return website;
	}
	
	public void setwebsite(String website) {
		this.website=website;
	}
	
	public Company getcompany() {
		return company;
	}
	
	public void setcompany(Company company) {
		this.company= company;
	}
	
	public String getphone() {
		return phone;
	}
	
	public void setphone(String phone) {
		this.phone=phone;
	}
}
