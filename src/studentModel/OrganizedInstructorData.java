package studentModel;

public class OrganizedInstructorData {

	private String SSN;
	private String ClassName;
	private String Session;
	private String Date;
	
	public OrganizedInstructorData(String sSN, String className) {
		super();
		SSN = sSN;
		ClassName = className;
	}



	public OrganizedInstructorData(String sSN, String className,
			String session, String date) {
		super();
		SSN = sSN;
		ClassName = className;
		Session = session;
		Date = date;
	}




	public String getDate() {
		return Date;
	}




	public void setDate(String date) {
		Date = date;
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


	public String getSession() {
		return Session;
	}


	public void setSession(String session) {
		Session = session;
	}
	
	
	
}
