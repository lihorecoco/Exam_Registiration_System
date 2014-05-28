package controller;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
		/*eeeee*/
	}
	
	public Controller(model.Student student,view.View view){
		
		this.student=student;
		this.view=view;
		
	}
	
	public void control(){
				
		dbOperation = new StudentDAOImpl();
	
		ArrayList<SessionClassroom> sessionClassrooms = new ArrayList<SessionClassroom>();
		Session session = new Session(sessionClassrooms,"21/03/2013" , "Session1");

		view.getTable().getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                       String index= view.getTable().getValueAt(view.getTable().getSelectedRow(), 0).toString();
                       // view.getTxtSelectedSsn().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(), 0).toString());
                       // view.getTxtSelectedName().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(), 1).toString());
                       // view.getTxtSelectedLastme().setText(view.getTable().getValueAt(view.getTable().getSelectedRow(), 2).toString());
                       Student std=dbOperation.getStudent(index);
                       view.getTxtSelectedSsn().setText(std.getSSN());
                       view.getTxtSelectedName().setText(std.getName());
                       view.getTxtSelectedLastme().setText(std.getLastName());
                       view.getTxtSelAddres().setText(std.getAddres());
                       view.getTxtSelClass().setText(std.getStdClass());
                       view.getTxtSelemail().setText(std.getEmail());
                       view.getTxtSelTelno().setText(std.getTelNo());
                       
                    }
                }
            });
		
		
		actionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==view.getBtnSave()){
					boolean flag;
					if(view.getTxtName().getText().equalsIgnoreCase("") || view.getTxtLastName().getText().equalsIgnoreCase("") || view.getTxtSSN().getText().equalsIgnoreCase("")){
						JOptionPane.showMessageDialog(null, "Fill The Entire of Info !!","Guide",JOptionPane.ERROR_MESSAGE);
					}
					else{			
						/*for(int i=1;i<20;i++){
							String ssn="SSN_"+i;
							String name="NAME_"+i;
							String lastname="LASTNAME_"+i;
							String classs="CLASS_"+i;
							String telno="PHONE_"+i;
							String adres="ADDRESS_"+i;
							String email="EMAIL_"+i;
							Student s=new Student(name,lastname,ssn,email,adres,telno,classs);
							dbOperation.insertStudent(s);
						}*/
						
					
						Student student_tmp = new Student(view.getTxtName().getText(), view.getTxtLastName().getText(), view.getTxtSSN().getText(),
								view.getTxtEmail().getText(),view.getTxtAdress().getText(),view.getTxtTelNo().getText(),view.getTxtClass().getText());
						student=student_tmp;
						flag=true;
						for(Student s:dbOperation.showAddedStudent()){
							if(student.getSSN().equals(s.getSSN())){
								view.getMsgLoginSuccess().showMessageDialog(null, "Student has already been added",
									      "Display Message", JOptionPane.INFORMATION_MESSAGE);
								flag=false;
								break;
							}							
						}
						if(flag){
							
							dbOperation.insertStudent(student);
							msg="Student Name:"+student.getName()+"\n"+"Student LastName:"+student.getLastName()+"\n"+"Student SSN:"+student.getSSN()+"\n"+
									"Student Adress:"+student.getAddres()+"\n"+"Student TelNo:"+student.getTelNo()+"\n"+"Student E-Mail:"+student.getEmail()+"\n";
							JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
							
							view.getTxtName().setText("");
							view.getTxtLastName().setText("");
							view.getTxtSSN().setText("");
							view.getTxtAdress().setText("");
							view.getTxtEmail().setText("");
							view.getTxtTelNo().setText("");
							view.getTxtClass().setText("");
						}
					
					}
				}else if(e.getSource()==view.getBtnClear()){
					view.getTxtName().setText("");
					view.getTxtLastName().setText("");
					view.getTxtSSN().setText("");
					view.getTxtAdress().setText("");
					view.getTxtEmail().setText("");
					view.getTxtTelNo().setText("");
					view.getTxtClass().setText("");
	
				}else if(e.getSource().equals(view.getBtnUpdate())){
					
					Student student_tmp = new Student(view.getTxtSelectedName().getText(), view.getTxtSelectedLastme().getText(), view.getTxtSSN().getText(),
							view.getTxtSelemail().getText(),view.getTxtSelAddres().getText(),view.getTxtSelTelno().getText(),view.getTxtSelClass().getText());
					dbOperation.updateStudentInfos(student_tmp,view.getTxtSelectedSsn().getText());
					
					
				}
				
			}
		};
		
		view.getBtnSave().addActionListener(actionListener);
		view.getBtnClear().addActionListener(actionListener);
		view.getBtnUpdate().addActionListener(actionListener);
	}
	public void listAddedStudents(){
		
		String s ;
		ArrayList<Student> students = dbOperation.showAddedStudent();
		view.getModel().removeAllElements();
		for( Student temp : students)
		{
			s="STUDENT SSN : "+ temp.getSSN() + " " +"STUDENT NAME : "+ temp.getName() + " " + " STUDENT LASTNAME : " + "" + temp.getLastName();
			view.getModel().addElement(s); 
			
		}
		
	}

	
	
	
}
