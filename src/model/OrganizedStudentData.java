package model;

public class OrganizedStudentData {


	private String SSN;
	private String firstName;
	private String lastName;
	private String classNameToAttend;
	private int deskNumber;
	private String sessionName;
	private String sessionDate;

	public OrganizedStudentData(String sSN, String classNameToAttend,
			int deskNumber) {
		super();
		SSN = sSN;
		this.classNameToAttend = classNameToAttend;
		this.deskNumber = deskNumber;
	}



	public OrganizedStudentData(String firstName, String lastName,
			String classNameToAttend, int deskNumber, String sessionName,
			String sessionDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.classNameToAttend = classNameToAttend;
		this.deskNumber = deskNumber;
		this.sessionName = sessionName;
		this.sessionDate = sessionDate;
	}


	public String getSessionName() {
		return sessionName;
	}




	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getSessionDate() {
		return sessionDate;
	}


	public void setSessionDate(String sessionDate) {
		this.sessionDate = sessionDate;
	}




	public OrganizedStudentData(String sSN, String classNameToAttend,
			int deskNumber, String sessionName, String sessionDate) {
		super();
		SSN = sSN;
		this.classNameToAttend = classNameToAttend;
		this.deskNumber = deskNumber;
		this.sessionName = sessionName;
		this.sessionDate = sessionDate;
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



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





}