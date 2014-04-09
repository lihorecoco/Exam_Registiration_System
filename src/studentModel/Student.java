package studentModel;

public class Student {

	private String name;
	private String lastName;
	private String SSN;
	private int deskNumber;
	private Classroom enterenceClass;
	
	
	public Classroom getEnterenceClass() {
		return enterenceClass;
	}

	public void setEnterenceClass(Classroom enterenceClass) {
		this.enterenceClass = enterenceClass;
	}

	public int getDeskNumber() {
		return deskNumber;
	}

	public void setDeskNumber(int deskNumber) {
		this.deskNumber = deskNumber;
	}

	public Student(){
		
	}
	
	public Student(String name,String lastName,String SSN){
		this.name=name;
		this.lastName=lastName;
		this.SSN=SSN;
		
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
