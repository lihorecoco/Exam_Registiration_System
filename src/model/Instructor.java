package model;

public class Instructor {

	private String SSN;
	private String name;
	private String surname;
	private String phone;
	
	public Instructor(String sSN, String name, String surname, String phone) {
		super();
		SSN = sSN;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
