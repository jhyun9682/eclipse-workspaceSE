package dao.address.forth;

public class Address {
	private int no;
	private String id;
	private String name;
	private String phone;
	private String address;
	public Address(){
		
	}
	public Address(int no,String id, String name, String phone,String address){
		super();
		this.no=no;
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.address=address;
		
	}

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "주소록한개행의데이타를담을클래스 [no=" + no + ", id=" + id + ", name=" + name + ", phone=" + phone + ", address="
				+ address + "]\n";
	}

	
}
