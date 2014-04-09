package studentModel;

public interface StudentDAO {
	
	public int insertStudent(Student newStudent);
	public Student getStudent(String SSN);
	public void showAddedStudent(Student student);
	
	
	
	
}
