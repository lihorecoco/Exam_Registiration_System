package testt;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import studentModel.Classroom;
import studentModel.ExamOrganizator;
import studentModel.Instructor;
import studentModel.OrganizedInstructorData;
import studentModel.OrganizedStudentData;
import studentModel.Session;
import studentModel.SessionClassroom;
import studentModel.Student;
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
