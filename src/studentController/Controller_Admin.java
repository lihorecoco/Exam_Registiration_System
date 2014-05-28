package studentController;

import java.awt.CardLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import pdfCreater.PDFCreator;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import studentModel.Admin;
import studentModel.Classroom;
import studentModel.Exam;
import studentModel.ExamOrganizator;
import studentModel.Instructor;
import studentModel.OrganizedInstructorData;
import studentModel.OrganizedStudentData;
import studentModel.Session;
import studentModel.SessionClassroom;
import studentModel.Student;
import studentModel.StudentDAOImpl;
import studentView.AdminView;
import studentView.View;

public class Controller_Admin {

	private studentView.View view;
	private ActionListener actionListener;
	private Dialog dialog_control;
	private AdminView admin_view;
	private StudentDAOImpl dbOperation;
	private ExamOrganizator examOrganizator;
	private ArrayList<Admin> adminList;
	private PDFCreator pdfCreator; 
	
	public Controller_Admin(View view,AdminView admin_view) {
		super();
		
		dbOperation = new StudentDAOImpl();
		this.view = view;
		this.admin_view=admin_view;
		admin_view.setVisible(false);
		view.setVisible(true);
		
		ArrayList<Exam> exams = new ArrayList<Exam>();
		exams = dbOperation.showExams();
			
		for(Exam tmpExam : exams)
		{
			admin_view.getComboBox().addItem(tmpExam.getExamName());
			admin_view.getComboBoxNewSessionToExam().addItem(tmpExam.getExamName());
		}
		
		
	}
	
	public void control_Admin()
	{
		adminList=new ArrayList<Admin>();
		dbOperation = new StudentDAOImpl();
		actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource().equals(view.getBtnLogin())){
					adminList=dbOperation.getAdmins();
					boolean flag=false;
					for(Admin a:adminList){
						if(view.getTxtUsername().getText().trim().equalsIgnoreCase(a.getUsername())&&
								new String(view.getTxtPassword().getPassword()).equalsIgnoreCase(a.getPassword())){
							view.setVisible(false);
							admin_view.setVisible(true);
							flag=true;
							break;	
						}
						else{
							view.getMsgLoginSuccess().showMessageDialog(null, "Username or Password is wrong",
								      "Display Message", JOptionPane.INFORMATION_MESSAGE);
							
						}
					
					}

				}
				else if(e.getSource().equals(admin_view.getBtnBackToMenu())){
					
					view.setVisible(true);
					admin_view.setVisible(false);
				}
				else 
				{
					 adminPanelChanger(e);
					
				}
				
			}
		};

	view.getBtnLogin().addActionListener(actionListener);
	admin_view.getBtnBackToMenu().addActionListener(actionListener);
	admin_view.getBtnAddInstructor().addActionListener(actionListener);
	admin_view.getBtnAddNewClass().addActionListener(actionListener);
	admin_view.getBtnBackFromAddClass().addActionListener(actionListener);
	admin_view.getBtnBackToAdminPanel().addActionListener(actionListener);
	admin_view.getBtnNewInstructor().addActionListener(actionListener);
	admin_view.getBtnAddNewClassroom().addActionListener(actionListener);
	admin_view.getBtnOrganizeTheExam().addActionListener(actionListener);
	admin_view.getBtnShowClasses().addActionListener(actionListener);
	admin_view.getBtnShowInstructor().addActionListener(actionListener);
	admin_view.getBtnShowRegisteredStudents().addActionListener(actionListener);
	admin_view.getBtnBackSession().addActionListener(actionListener);
	admin_view.getBtnAddNewSession().addActionListener(actionListener);
	admin_view.getBtnAddSession().addActionListener(actionListener);
	admin_view.getBtnBackFromExam().addActionListener(actionListener);
	admin_view.getBtnNewExam().addActionListener(actionListener);
	admin_view.getBtnAddExam().addActionListener(actionListener);
	//admin_view.getComboBox().addActionListener(actionListener);
	}
	
	private void adminPanelChanger(ActionEvent e)
	{
		if(e.getSource().equals(admin_view.getBtnAddInstructor()))
		{
			admin_view.getAdminPanel().setVisible(false);
			admin_view.getAddInstructorPanel().setVisible(true);
		}
		else if (e.getSource().equals(admin_view.getBtnAddNewClass())){
				
			admin_view.getAdminPanel().setVisible(false);
			admin_view.getAdminClassPanel().setVisible(true);
		}
		else if(e.getSource().equals(admin_view.getBtnAddNewSession())){
			admin_view.getAdminPanel().setVisible(false);
			admin_view.getNewSessionPanel().setVisible(true);
			
		}
		else if(e.getSource().equals(admin_view.getBtnNewExam()))
		{
			admin_view.getAdminPanel().setVisible(false);
			admin_view.getNewExamPanel().setVisible(true);
		
		}
		
		
		else if( e.getSource().equals(admin_view.getBtnBackToAdminPanel()) || e.getSource().equals(admin_view.getBtnBackFromAddClass()) || e.getSource().equals(admin_view.getBtnBackSession()) || e.getSource().equals(admin_view.getBtnBackFromExam())){
			
			admin_view.getAdminPanel().setVisible(true);
			admin_view.getAdminClassPanel().setVisible(false);
			admin_view.getAddInstructorPanel().setVisible(false);
			admin_view.getNewSessionPanel().setVisible(false);
			admin_view.getNewExamPanel().setVisible(false);
		
		
			
		}
		else if( e.getSource().equals(admin_view.getBtnNewInstructor()))
		{
			Instructor newInstructor = new Instructor(admin_view.getTxtSSN().getText(), admin_view.getTxtAddInstructorName().getText(), admin_view.getTxtInstructorSurname().getText(), admin_view.getTxtInstructorPhone().getText());
			dbOperation.insertInstructor(newInstructor);
			
			
		}
		else if(e.getSource().equals(admin_view.getBtnAddNewClassroom()))
		{
			try{
				
			Classroom newClassroom = new Classroom(admin_view.getTxtClassName().getText() ,Integer.parseInt(admin_view.getTxtClassCapacity().getText()), Integer.parseInt(admin_view.getTxtFloor().getText()));
			dbOperation.insertClassroom(newClassroom);
			}catch(NumberFormatException exception)
			{
				System.out.println("Cannot parse truely");
			}
			
		}
		else if(e.getSource().equals(admin_view.getBtnOrganizeTheExam()))
		{
			
			int count=0;
			ArrayList<Instructor> instructors = new ArrayList<>();
			ArrayList<Student> students = new ArrayList<>();
		
			ArrayList<Classroom> classrooms = new ArrayList<>();
			ArrayList<Session> session = new ArrayList<>();
			String stringNamedSession = admin_view.getComboBox().getSelectedItem().toString();
			
			instructors = dbOperation.showInstructors();
			//students = dbOperation.showAddedStudent();
			//classrooms = dbOperation.showClassrooms();
			session = dbOperation.bringSectionsUptoExamName(stringNamedSession);
			
			
			
			Map<String, SessionClassroom> classroomSessions = new TreeMap<String, SessionClassroom>();
			
			for (Session tmpSession : session )
			{
				
				students = dbOperation.showAddedStudentupToClass(tmpSession.getClassFor());
				classrooms = dbOperation.showClassrooms();
				ArrayList<SessionClassroom> sessionClassrooms = new ArrayList<>();
				for (Classroom classTmp : classrooms)
				{
					count++;
					String name = ("sessionClassroom" + count);
					SessionClassroom s = new SessionClassroom(classTmp);
					classroomSessions.put(name,s);
					sessionClassrooms.add(classroomSessions.get("sessionClassroom" + count));
				
				}
				Session sessionNew = new Session(sessionClassrooms, tmpSession.getSessionDate(), tmpSession.getSessionName(), tmpSession.getClassFor());
				//Session sessionNew = new Session(sessionClassrooms, tmpSession.getSessionDate(), tmpSession.getClassFor());
				examOrganizator = new ExamOrganizator(sessionNew);
				 
				for(int i = 0 ; i < sessionClassrooms.size() ; i++){
					System.out.println("size : **** : "+sessionClassrooms.size());
					OrganizedInstructorData organizedInstructor = examOrganizator.addInstructorToclass(instructors.get(i));
					if(organizedInstructor != null)
					dbOperation.insertInstructorAssign(organizedInstructor); 
				}
			
				 for (Student studentTmp : students)
				 {
					 
					OrganizedStudentData organizedStudent = examOrganizator.addStudentToClass(studentTmp);
					dbOperation.insertEnrollment(organizedStudent); 
					
				 }
				pdfCreator = new PDFCreator();
				ArrayList<OrganizedStudentData> lastOrganizedStudentData = new ArrayList<>();
				lastOrganizedStudentData = dbOperation.bringOrganizedStudentToExamCard(); 
			
				for(OrganizedStudentData tmpEnroll : lastOrganizedStudentData)
				{
					
					System.out.println("first Name : "+ tmpEnroll.getFirstName());
					
					pdfCreator.createPDF(tmpEnroll);
				}
				
			}
			 
		}
	
		else if(e.getSource().equals(admin_view.getBtnShowClasses()))
		{
			String s ;
			ArrayList<Classroom> classrooms = dbOperation.showClassrooms();
			admin_view.getModel().removeAllElements();
			for(Classroom c : classrooms)
			{
				s="Class name : "+c.getName() + " " + " Capacity of Class : " + "" + c.getCapacity();
				admin_view.getModel().addElement(s);
				 
				
			}
			
		}
	
		else if (e.getSource().equals(admin_view.getBtnShowInstructor())){

			String s ;
			ArrayList<Instructor> instructors = dbOperation.showInstructors();
			admin_view.getModel().removeAllElements();
			for(Instructor c : instructors)
			{
				s="Instructor name : "+ c.getName() + " " + " Instructor surname : " + "" + c.getSurname();
				admin_view.getModel().addElement(s); 
				
			}
			
			
		}
		else if(e.getSource().equals(admin_view.getBtnAddSession()))
		{
			
			Session newSession = new Session(admin_view.getTxtSessionDate().getText() , admin_view.getTxtSessionName().getText(), admin_view.getTxtSessionForClass().getText());
			dbOperation.insertSession(newSession,admin_view.getComboBoxNewSessionToExam().getSelectedItem().toString());
			
		}
		
		
		else if(e.getSource().equals(admin_view.getBtnShowRegisteredStudents()))
		{
			
			String s ;
			ArrayList<Student> students = dbOperation.showAddedStudent();
			admin_view.getModel().removeAllElements();
			for( Student temp : students)
			{
				s="Student name : "+ temp.getName() + " " + " Student surname : " + "" + temp.getLastName();
				admin_view.getModel().addElement(s); 
				
			}
			
		}
	
		else if(e.getSource().equals(admin_view.getBtnAddExam()))
		{
			
			Exam examNew = new Exam(admin_view.getTxtExamName().getText(), admin_view.getTxtExamStartDate().getText(), admin_view.getTxtExamEndDate().getText());
			dbOperation.insertExam(examNew);
			
			
		}
		
	
	
	}
	    

	
	
}
