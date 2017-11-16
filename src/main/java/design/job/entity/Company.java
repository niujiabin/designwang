package design.job.entity;

/**
 * 企业表
 * @author yaphetsBin
 *
 */
public class Company {


	public int id;
	
	public String name;
	
	public String address;

	public String username;

	public String password;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	
}
