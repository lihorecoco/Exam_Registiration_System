package model;

public class Student {

	private String name;
	private String lastName;
	private String SSN;
	private String email;
	private String addres;
	private String telNo;
	private String stdClass;
	
	



	public Student(String name,String lastName,String SSN,String email,String address,String telNo, String stdClass){
		this.name=name;
		this.lastName=lastName;
		this.SSN=SSN;
		this.email=email;
		this.addres=address;
		this.telNo=telNo;
		this.stdClass=stdClass;
		
	}
	
		
	public String getStdClass() {
		return stdClass;
	}


	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public Student(){
		
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	
	
	
}
