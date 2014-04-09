package studentModel;

import java.util.ArrayList;

public class Test {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Classroom> classes = new ArrayList<Classroom>(); 
		
		Student student1 = new Student("Canberk", "Doðan", "12345");
		Student student2 = new Student("Canberk1", "Doðan2", "12346");
		Student student3 = new Student("Canberk2", "Doðan2", "12347");
		
		Instructor instructor1 = new Instructor("Ýsmail", "Kurar", "12");
		Instructor instructor2 = new Instructor("Ýsmail1", "Kurar1", "13");
		Instructor instructor3 = new Instructor("Ýsmail2", "Kurar2", "14");
		Instructor instructor4= new Instructor("Ýsmail3", "Kurar3", "15");
		
		Classroom class1 = new Classroom(1);
		Classroom class2= new Classroom(2);
		Classroom class3= new Classroom(3);
		Classroom class4= new Classroom(4);
		
		classes.add(class1);
		classes.add(class2);
		classes.add(class3);
		classes.add(class4);
		
		
		
		
		
		ExamOrganization exam = new ExamOrganization(classes);
		
	
		
		exam.examOrganization(student1);
		exam.examOrganization(student2);
		exam.examOrganization(student3);
	
		exam.instructorAssignToClass(instructor1);
		exam.instructorAssignToClass(instructor2);
		exam.instructorAssignToClass(instructor3);
		exam.instructorAssignToClass(instructor4);
		
		
		System.out.println("student1 class : " + student1.getEnterenceClass().getName() + " student DeskNumber : "  + student1.getDeskNumber() + " Classrom instructer : " + student1.getEnterenceClass().getInstructor().getName());
		System.out.println("student2 class : " + student2.getEnterenceClass().getName() + " student DeskNumber : "  + student2.getDeskNumber() + " Classrom instructer : " + student2.getEnterenceClass().getInstructor().getName());
		System.out.println("student3 class : " + student3.getEnterenceClass().getName() + " student DeskNumber : "  + student3.getDeskNumber() + " Classrom instructer : " + student3.getEnterenceClass().getInstructor().getName());
		
	}

}
