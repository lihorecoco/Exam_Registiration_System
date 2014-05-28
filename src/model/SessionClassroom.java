package model;

import java.util.ArrayList;

public class SessionClassroom {

	private ArrayList<Student> students;
	private Classroom classroom;
	private Instructor instructor;
	
	public SessionClassroom(Classroom classroom) {
		super();
		
		students = new ArrayList<Student>();
		this.classroom = classroom;
		
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


	public Classroom getClassroom() {
		return classroom;
	}


	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
	
	
	
	
}
