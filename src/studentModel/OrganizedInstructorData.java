package studentModel;

public class OrganizedInstructorData {

	private String SSN;
	private String ClassName;
	
	public OrganizedInstructorData(String sSN, String className) {
		super();
		SSN = sSN;
		ClassName = className;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}
	
	
	
}
