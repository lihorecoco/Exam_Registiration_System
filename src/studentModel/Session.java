package studentModel;

import java.util.ArrayList;
import java.util.Date;

public class Session {

	private ArrayList<SessionClassroom> sectionClassrooms ;
	private String sessionDate;
	private String sessionName;
	private String classFor;
	
	public Session(ArrayList<SessionClassroom> sectionClassrooms,
			String sessionDate, String definition) {
		super();
		this.sectionClassrooms = new ArrayList<SessionClassroom>();
		this.sectionClassrooms = sectionClassrooms;
		this.sessionDate = sessionDate;
		this.classFor = definition;
	}

	public Session(String sessionDate ,String sessionName, String classfor)
	{
		this.sessionName=sessionName;
		this.sessionDate = sessionDate; 
		this.classFor=classfor;
		
	}
	
	
	public Session(ArrayList<SessionClassroom> sectionClassrooms,
			String sessionDate, String sessionName, String classFor) {
		super();
		this.sectionClassrooms = sectionClassrooms;
		this.sessionDate = sessionDate;
		this.sessionName = sessionName;
		this.classFor = classFor;
	}

	public ArrayList<SessionClassroom> getSectionClassrooms() {
		return sectionClassrooms;
	}

	public void setSectionClassrooms(ArrayList<SessionClassroom> sectionClassrooms) {
		this.sectionClassrooms = sectionClassrooms;
	}

	public String getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(String sessionDate) {
		this.sessionDate = sessionDate;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getClassFor() {
		return classFor;
	}

	public void setClassFor(String classFor) {
		this.classFor = classFor;
	}

	
	
	
	
	
}
