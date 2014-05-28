package testt;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.Classroom;
import model.ExamOrganizator;
import model.Instructor;
import model.OrganizedInstructorData;
import model.OrganizedStudentData;
import model.Session;
import model.SessionClassroom;
import model.Student;
import sun.print.resources.serviceui;

public class ExamOrganizatorTest {

	Classroom classroom = new Classroom("C11", 13, 5);
	SessionClassroom sessionClassroom = new SessionClassroom(classroom);
	ArrayList<SessionClassroom> classrooms = new ArrayList<SessionClassroom>();
	Session session;
	ExamOrganizator examOrganizator;
	
	
	@Test
	public void testAddStudentToClass() {
		
		classrooms.add(sessionClassroom);
		session = new Session(classrooms, "21/16/2014", "Session");
		examOrganizator = new ExamOrganizator(session);
		Student testStudent = new Student("Paul", "West", "12345");
		OrganizedStudentData testOrganizedStudent= examOrganizator.addStudentToClass(testStudent);
		assertNotNull(testOrganizedStudent);
		
		
	}


	@Test
	public void testAddInstructorToClass() {
		
		classrooms.add(sessionClassroom);
		session = new Session(classrooms, "21/16/2014", "Session");
		examOrganizator = new ExamOrganizator(session);
		Instructor instructor = new Instructor("1928435", "Ryan", "Donk", "862496534");
		OrganizedInstructorData testOrganizedInstructor= examOrganizator.addInstructorToclass(instructor);
		assertNotNull(testOrganizedInstructor);
		
		
	}
	
}
