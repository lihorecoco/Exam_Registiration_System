package model;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.StyledEditorKit.BoldAction;

import sun.security.x509.AVA;

public class ExamOrganizator {

	private Session session;

	public ExamOrganizator(Session session) {
		super();
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	
	private boolean checkFullNessOfClassesForInstructors()
	{
		boolean availableToAssign=false;
		for(SessionClassroom sessionClass : session.getSectionClassrooms())
		{
			if(sessionClass.getInstructor() == null) 
			{
				availableToAssign = true;
			}
		}
		
		return availableToAssign;
		
	}
	
	
	public OrganizedStudentData addStudentToClass(Student student)
	{
		String dialogMessage;
		int classNumber=0;
		int deskNumber=0;
		Random rand = new Random();
		
		
		do{
			
			classNumber=rand.nextInt(session.getSectionClassrooms().size());
			
		
		}while(session.getSectionClassrooms().get(classNumber).getClassroom().getCapacity() == 0);
		
		
			session.getSectionClassrooms().get(classNumber).getStudents().add(student);
			deskNumber=session.getSectionClassrooms().get(classNumber).getClassroom().getCapacity();
			OrganizedStudentData studentOrganized = new OrganizedStudentData(student.getSSN() ,  session.getSectionClassrooms().get(classNumber).getClassroom().getName(), deskNumber);
			
			deskNumber--;
			session.getSectionClassrooms().get(classNumber).getClassroom().setCapacity(deskNumber);
			dialogMessage="Student : " +  student.getName() + " has been added to class " +  session.getSectionClassrooms().get(classNumber).getClassroom().getName() + "Desk Number : " +deskNumber;
			System.out.println(dialogMessage);
			
			return studentOrganized;
			
			
	}
	
	public OrganizedInstructorData addInstructorToclass(Instructor instructor)
	{
		boolean checkInstructor=true;
		int classNumber = 0 ; 
		Random rand = new Random();
		OrganizedInstructorData organizedInstructorData=null;
		
		if(checkFullNessOfClassesForInstructors()){
		do{
			
			classNumber=rand.nextInt(session.getSectionClassrooms().size());
			if(session.getSectionClassrooms().get(classNumber).getInstructor() == null){
				session.getSectionClassrooms().get(classNumber).setInstructor(instructor);
				
				organizedInstructorData = new OrganizedInstructorData(instructor.getSSN(), session.getSectionClassrooms().get(classNumber).getClassroom().getName());
				System.out.println("Instructor "+ instructor.getName() +" has been added to : " + session.getSectionClassrooms().get(classNumber).getClassroom().getName());
				checkInstructor=false;
				
			}
			
		}while(checkInstructor);
		
	}
		else {
			
			
			System.out.println("All classes are full !!!");
		}
	return organizedInstructorData;
	}
	 
}



	

