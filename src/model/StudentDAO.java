package model;

import java.util.ArrayList;

public interface StudentDAO {
	
	public int insertStudent(Student newStudent);
	public Student getStudent(String SSN);
	public ArrayList<Student> showAddedStudent();
	
	
	
	
}
