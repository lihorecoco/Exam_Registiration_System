package studentController;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import studentModel.Classroom;

import studentModel.ExamOrganizator;
import studentModel.Instructor;
import studentModel.Session;
import studentModel.SessionClassroom;
import studentModel.Student;
import studentModel.StudentDAO;
import studentModel.StudentDAOFactory;

public class Controller  {
	
		private studentModel.Student student;
		private studentView.View view;
		private ActionListener actionListener;
		private ExamOrganizator examOrganization;
		private String msg;
		
		
	public Controller(){
		
	}
	
	public Controller(studentModel.Student student,studentView.View view){
		
		this.student=student;
		this.view=view;
		
	}
	
	public void control(){
		
		Instructor instructor = new Instructor("Ali", "Veli", "12");
		Instructor instructor1 = new Instructor("Ali1", "Veli1", "12");
		Instructor instructor2 = new Instructor("Ali2", "Veli2", "12");
		
		Classroom classroom = new Classroom(1, 13, 4);
		Classroom classroom1 = new Classroom(2, 13, 4);
		Classroom classroom2 = new Classroom(3, 13, 4);
		
		SessionClassroom sessionClassroom = new SessionClassroom(classroom);
		SessionClassroom sessionClassroom1 = new SessionClassroom(classroom1);
		SessionClassroom sessionClassroom2 = new SessionClassroom(classroom2);
		
		ArrayList<SessionClassroom> sessionClassrooms = new ArrayList<SessionClassroom>();
		sessionClassrooms.add(sessionClassroom);
		sessionClassrooms.add(sessionClassroom1);
		sessionClassrooms.add(sessionClassroom2);
		
		
		
		Session session = new Session(sessionClassrooms,"21/03/2013" , "Session1");
		
		
		examOrganization = new ExamOrganizator(session);
		examOrganization.addInstructorToclass(instructor);
		examOrganization.addInstructorToclass(instructor1);
		examOrganization.addInstructorToclass(instructor2);
		
		actionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==view.getBtnSave()){
					if(view.getTxtName().getText().equalsIgnoreCase("") || view.getTxtLastName().getText().equalsIgnoreCase("") || view.getTxtSSN().getText().equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Fill The Entire of Info !!","Guide",JOptionPane.ERROR_MESSAGE);
						
					
					}
					else{
						
						Student student_tmp = new Student(view.getTxtName().getText(), view.getTxtLastName().getText(), view.getTxtSSN().getText());
						student=student_tmp;
						
						
						student.setAddres(view.getTxtAdress().getText());
						student.setTelNo(view.getTxtTelNo().getText());
						student.setEmail(view.getTxtEmail().getText());
						
						msg= examOrganization.addStudentToClass(student).toString();
						
						JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
						
					
					}
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
