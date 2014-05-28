package studentModel;

import java.util.ArrayList;

public class Exam {

	private String examName;
	private String startDate;
	private String endDate;
	private ArrayList<Session> sessions;
	
	public Exam(String examName, String startDate, String endDate) {
		super();
		this.examName = examName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Exam(String examName, String startDate, String endDate,
			ArrayList<Session> sessions) {
		
		this.sessions = new ArrayList<Session>();
		this.examName = examName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sessions = sessions;
	}

	public ArrayList<Session> getSessions() {
		return sessions;
	}

	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}

	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
}
