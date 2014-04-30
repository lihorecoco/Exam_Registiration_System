package testt;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import studentModel.Classroom;
import studentModel.Instructor;
import studentModel.OrganizedInstructorData;
import studentModel.OrganizedStudentData;
import studentModel.Student;
import studentModel.StudentDAOImpl;

public class QueryTests {

	StudentDAOImpl dbOperation = new StudentDAOImpl();
	
	@Test
	public void testInsertStudent() {
		Student student = new Student("Canberk", "Doðan", "12345");
		assertEquals("Must be 0" , 0 ,dbOperation.insertStudent(student));
	}

	@Test
	public void testInsertInstructor(){
		
		Instructor instructor = new Instructor("123", "Ali", "Veli", "12345");
		assertEquals("Must be 0" , 0 ,dbOperation.insertInstructor(instructor));
		
	}
	
	@Test
	public void testInsertClassroom(){
		
		Classroom classroom = new Classroom("1", 2, 3) ;
		assertEquals("Must be 0" , 1 ,dbOperation.insertClassroom(classroom));
		
	}

	@Test
	public void testInsertEnrollment(){
		
		OrganizedStudentData organizedStudentData = new OrganizedStudentData("asdfa", "14", 3);
		assertEquals("Must be 0" , 1 ,dbOperation.insertEnrollment(organizedStudentData));
		
	}
	
	@Test
	public void testInsertInstructorAssign(){
		
		OrganizedInstructorData organizedInstructionData = new OrganizedInstructorData("123", "14");
		assertEquals("Must be 0" , 1 ,dbOperation.insertInstructorAssign(organizedInstructionData));
		
	}
	
	@Test
	public void testShowInstructor()
	{
		ArrayList<Instructor> instructor = new ArrayList<>();
		instructor=dbOperation.showInstructors();	
		assertNotEquals("Must not be 0 ", 0, instructor.size());
		
	}
	
	@Test
	public void testShowAddedStudent()
	{
		ArrayList<Student> students = new ArrayList<>();
		students = dbOperation.showAddedStudent();
		assertNotEquals("Must not be 0 ", 0, students.size());
		
	}
	
	@Test
	public void testShowClasroom()
	{
		ArrayList<Classroom> classrooms = new ArrayList<>();
		classrooms = dbOperation.showClassrooms();
		assertNotEquals("Must not be 0 ", 0, classrooms.size());
		
	}
	
	
	
}
