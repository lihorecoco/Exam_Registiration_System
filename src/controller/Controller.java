package controller;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Classroom;
import model.ExamOrganizator;
import model.Instructor;
import model.Session;
import model.SessionClassroom;
import model.Student;
import model.StudentDAO;
import model.StudentDAOFactory;
import model.StudentDAOImpl;

public class Controller  {
	
		private model.Student student;
		private view.View view;
		private ActionListener actionListener;
		private ExamOrganizator examOrganization;
		private String msg;
		private StudentDAOImpl dbOperation;
		
	public Controller(){
		
	}
	
	public Controller(model.Student student,view.View view){
		
		this.student=student;
		this.view=view;
		
	}
	
	public void control(){
		
		
		dbOperation = new StudentDAOImpl();
		ArrayList<SessionClassroom> sessionClassrooms = new ArrayList<SessionClassroom>();
		Session session = new Session(sessionClassrooms,"21/03/2013" , "Session1");
		
		
		
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
						
						
						dbOperation.insertStudent(student);
						
						
						//JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
						
					
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