package studentModel;

public class OrganizedStudentData {

	
	private String SSN;
	private String classNameToAttend;
	private int deskNumber;
	
	public OrganizedStudentData(String sSN, String classNameToAttend,
			int deskNumber) {
		super();
		SSN = sSN;
		this.classNameToAttend = classNameToAttend;
		this.deskNumber = deskNumber;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getClassNameToAttend() {
		return classNameToAttend;
	}

	public void setClassNameToAttend(String classNameToAttend) {
		this.classNameToAttend = classNameToAttend;
	}

	public int getDeskNumber() {
		return deskNumber;
	}

	public void setDeskNumber(int deskNumber) {
		this.deskNumber = deskNumber;
	}
	
	
	
	
	
}
