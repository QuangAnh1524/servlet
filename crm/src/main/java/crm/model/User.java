package crm.model;

public class User {
	
	private int id;
	private String email;
	private String password;
	private String fullname;
	private String address;
	private String phone;
	private int role_id;
	
	
	public User() {}


	public User(int id, String email, String password, String fullname, String address, String phone, int role_id) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.address = address;
		this.phone = phone;
		this.role_id = role_id;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
	
}
