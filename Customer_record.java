public class Customer_record extends Record {

	private String name;
	private String surname;
	private String adress;
	private String email;
	private int telephone;
	private int code;
	public Customer_record(String name, String surname, String adress, String email, int telephone, int code) {
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.email = email;
		this.telephone = telephone;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	
}