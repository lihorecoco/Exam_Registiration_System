package model;

import java.util.ArrayList;
import java.util.Date;

public class Session {

	private ArrayList<SessionClassroom> sectionClassrooms ;
	private String sessionDate;
	private String definition;
	
	public Session(ArrayList<SessionClassroom> sectionClassrooms,
			String sessionDate, String definition) {
		super();
		this.sectionClassrooms = new ArrayList<SessionClassroom>();
		this.sectionClassrooms = sectionClassrooms;
		this.sessionDate = sessionDate;
		this.definition = definition;
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

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	
	
	
	
}
