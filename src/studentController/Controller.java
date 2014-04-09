package studentController;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import studentModel.Classroom;
import studentModel.ExamOrganization;
import studentModel.Instructor;
import studentModel.Student;
import studentModel.StudentDAO;
import studentModel.StudentDAOFactory;

public class Controller  {
	
		private studentModel.Student student;
		private studentView.View view;
		private ActionListener actionListener;
		private ExamOrganization exam;
		private Dialog msg;
		
	public Controller(){
		
	
	}
	
	public Controller(studentModel.Student student,studentView.View view){
		
		this.student=student;
		this.view=view;
		
	}
	
	public void control(){
		ArrayList<Classroom> classes = new ArrayList<Classroom>(); 

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
		
		
		
		
		
		exam = new ExamOrganization(classes);
		
	
		
		//exam.examOrganization(student);

	  /*
		exam.instructorAssignToClass(instructor1);
		exam.instructorAssignToClass(instructor2);
		exam.instructorAssignToClass(instructor3);
		exam.instructorAssignToClass(instructor4);
	 */	
		
		System.out.println("student class : " + student.getEnterenceClass().getName() + " student DeskNumber : "  + student.getDeskNumber() + " Classrom instructer : " + student.getEnterenceClass().getInstructor().getName());
		//System.out.println("student2 class : " + std.getEnterenceClass().getName() + " student DeskNumber : "  + std.getDeskNumber() + " Classrom instructer : " + std.getEnterenceClass().getInstructor().getName());
		//System.out.println("student3 class : " + std.getEnterenceClass().getName() + " student DeskNumber : "  + std.getDeskNumber() + " Classrom instructer : " + std.getEnterenceClass().getInstructor().getName());
		actionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==view.getBtnSave()){
					if(view.getTxtName().getText()==""||view.getTxtLastName().getText()==""||view.getTxtSSN().getText()==""){
						JOptionPane.showMessageDialog(null, "Fil the whole infos. !!!","Display Message",JOptionPane.ERROR_MESSAGE);
						//Student student = new Student( view.getTxtName().getText(), view.getTxtLastName().getText(), view.getTxtSSN().getText());
					    //exam.examOrganization(student);
						//return;
					}
					else{
						Student student1 = new Student( view.getTxtName().getText(), view.getTxtLastName().getText(), view.getTxtSSN().getText());
						student=student1;
						exam.examOrganization(student);
						//student.setName(view.getTxtName().getText());
						//student.setLastName(view.getTxtLastName().getText());
						//student.setSSN(view.getTxtSSN().getText());
						student.setAddres(view.getTxtAdress().getText());
						student.setTelNo(view.getTxtTelNo().getText());
						student.setEmail(view.getTxtEmail().getText());
						//String msg=student.getName()+"\n "+student.getLastName()+"\n"+student.getSSN();
						//JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
					   
						String msg=student.getName()+"\n "+student.getLastName()+"\n"+student.getSSN()+"\n " + student.getEnterenceClass().getName();
						JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
						//StudentDAO stdDao=StudentDAOFactory.getStudentDAO();
						//stdDao.showAddedStudent(student);
						
					
						/*int result = stdDao.insertStudent(student);
						stdDao.getStudent("");
						if (result==1) {
							JOptionPane.showMessageDialog(null, " Ekleme iþlemi Baþarýlý !!!","Success",JOptionPane.INFORMATION_MESSAGE);
						} else 
							JOptionPane.showMessageDialog(null, " Ekleme iþlemi BAÞARISIZ !!!","Error",JOptionPane.ERROR_MESSAGE);
					*/}
				}else if(e.getSource()==view.getBtnClear()){
					view.getTxtName().setText("");
					view.getTxtLastName().setText("");
					view.getTxtSSN().setText("");
					view.getTxtAdress().setText("");
					view.getTxtEmail().setText("");
					view.getTxtTelNo().setText("");
					
					
					
				}
					
			
			}
		};
		
		view.getBtnSave().addActionListener(actionListener);
		view.getBtnClear().addActionListener(actionListener);
	}

	
	
	
	
	
	
}
