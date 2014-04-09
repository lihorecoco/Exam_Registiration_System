package studentModel;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.plaf.synth.Region;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ExamOrganization {

  private Student student;
  private ArrayList<Classroom> classes= new ArrayList<Classroom>();
  private int counter=0;
  private int registerededInstructorCount=0;
  public ExamOrganization(ArrayList<Classroom> classes) {
	super();
	
	
	this.classes = classes;
	
	
	
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public ArrayList<Classroom> getClasses() {
	return classes;
}

public void setClasses(ArrayList<Classroom> classes) {
	this.classes = classes;
}



  public void examOrganization(Student student1)
  {
	  
	  student=student1;
	  boolean correction=false;
	 
	  Random rand = new Random();
	  int deskNumber=0;
	  int classNumber=0;
	  do{
		  correction=false;
		  deskNumber=rand.nextInt(15);
		  classNumber=rand.nextInt(4);
		  
		  if(classes.get(classNumber).getDesks()[deskNumber] != null )
		  {
			  correction=true;
			  
		  }
		  else
		  {
			  student.setDeskNumber(deskNumber+1);
			  student.setEnterenceClass(classes.get(classNumber));
			  classes.get(classNumber).getDesks()[deskNumber]=student;
		  }
			  
		  
	  }while(correction); 
	    
	  
  }

 
  
  private ArrayList<Integer> getFullClasses()
  {
	  counter=0;
	  ArrayList<Integer> fullClases = new ArrayList<Integer>();
	  
	  for(int j=0 ; j<classes.size() ; j++)
	  {
		  for(int i = 0 ; i< 16 ;i++){
		  if(classes.get(j).getDesks()[i] != null)
		  {
			  counter++;
			  fullClases.add(j);
			  break;  
			  
		  }
		  
		  }
	  }
	  
	  
	  for(int i = 0 ; i < fullClases.size() ; i++ )
	  {
		  for(int j = i+1 ; j < fullClases.size() ; j++)
		  {
			  if(fullClases.get(i) == fullClases.get(j))
			     fullClases.remove(j);
		  }
	  }
		
	  
	  
	  return fullClases;
	  
  }
  
  
  public void instructorAssignToClass(Instructor instructor)
  {
	  
	  ArrayList<Integer> fullClasses = new ArrayList<Integer>();
	  fullClasses = getFullClasses();
	    
	  
	  if(registerededInstructorCount < counter){	  
		  instructor.setStaffClassrom(classes.get(fullClasses.get(registerededInstructorCount))); 
		  classes.get(fullClasses.get(registerededInstructorCount)).setInstructor(instructor);
		  registerededInstructorCount++;
		  }
	  else
		  System.out.println("All class is full");
	  
	  
  }
  
  

}
