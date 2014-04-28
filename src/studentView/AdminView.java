package studentView;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminView extends JFrame {

	private JPanel contentPane;
	private JButton btnShowInstructor;
	private	JButton btnShowRegisteredStudents;
	private JButton btnShowClasses;
	private JButton btnAddInstructor;
	private JButton btnAddNewClass; 
	private JLabel lblAdminPanel;
	private JButton btnAddToExam;
	private JButton btnBackToMenu;
	private JTextField txtAddInstructorName;
	private JTextField txtInstructorSurname;
	private JTextField txtInstructorPhone;
	private JTextField txtClassName;
	private JTextField txtClassCapacity;
	private JLabel lblCapacity;
	private JTextField txtFloor;
	private JLabel lblFloor;
	private JLabel lblAddClass;
	private JButton btnAddNewClassroom;
	private JButton btnBackFromAddClass;
	private JButton btnNewInstructor;
	private JButton btnBackToAdminPanel;
	private JPanel adminPanel;
	private JPanel addInstructorPanel;
	private JPanel adminClassPanel;
	
	public AdminView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(100, 100, 100, 100);
		  setSize(950, 700);
		
		
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		adminPanel = new JPanel();
		adminPanel.setBackground(Color.WHITE);
		contentPane.add(adminPanel, "name_85769629647892");
		adminPanel.setLayout(null);
		//adminPanel.setVisible(true);
		
		btnShowInstructor = new JButton("Show Instructors");
		btnShowInstructor.setBackground(new Color(255, 255, 255));
		btnShowInstructor.setForeground(new Color(30, 144, 255));
		btnShowInstructor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowInstructor.setBounds(80, 157, 301, 33);
		adminPanel.add(btnShowInstructor);
		
		

		btnShowRegisteredStudents = new JButton("Show Registered Students");
		btnShowRegisteredStudents.setBackground(new Color(255, 255, 255));
		btnShowRegisteredStudents.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowRegisteredStudents.setForeground(new Color(30, 144, 255));
		btnShowRegisteredStudents.setBounds(80, 228, 301, 33);
		adminPanel.add(btnShowRegisteredStudents);
		
		btnShowClasses = new JButton("Show Classes");
		btnShowClasses.setForeground(new Color(30, 144, 255));
		btnShowClasses.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowClasses.setBackground(new Color(255, 255, 255));
		btnShowClasses.setBounds(80, 297, 301, 33);
		adminPanel.add(btnShowClasses);
		
		btnAddInstructor = new JButton("Add New Instructor");
		btnAddInstructor.setForeground(new Color(30, 144, 255));
		btnAddInstructor.setBackground(new Color(255, 255, 255));
		btnAddInstructor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddInstructor.setBounds(80, 368, 301, 33);
		adminPanel.add(btnAddInstructor);
		
		btnAddNewClass = new JButton("Add New Class");
		btnAddNewClass.setForeground(new Color(30, 144, 255));
		btnAddNewClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddNewClass.setBackground(new Color(255, 255, 255));
		btnAddNewClass.setBounds(80, 437, 301, 33);
		adminPanel.add(btnAddNewClass);
		
		lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setForeground(new Color(30, 144, 255));
		lblAdminPanel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPanel.setBounds(344, 57, 199, 25);
		adminPanel.add(lblAdminPanel);
		
		JList list = new JList();
		list.setBackground(new Color(169, 169, 169));
		list.setBounds(580, 142, 288, 334);
		adminPanel.add(list);
		
		btnAddToExam = new JButton("Add to Exam");
		btnAddToExam.setBackground(new Color(255, 255, 255));
		btnAddToExam.setForeground(new Color(30, 144, 255));
		btnAddToExam.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddToExam.setBounds(580, 494, 287, 39);
		adminPanel.add(btnAddToExam);
		
		btnBackToMenu = new JButton("");
		btnBackToMenu.setForeground(Color.WHITE);
		btnBackToMenu.setBackground(Color.WHITE);
		btnBackToMenu.setIcon(new ImageIcon("C:\\Users\\Canberk Dogan\\Downloads\\1398562730_back.png"));
		btnBackToMenu.setBounds(80, 494, 64, 58);
		btnBackToMenu.setOpaque(false);
		btnBackToMenu.setContentAreaFilled(false);
		btnBackToMenu.setBorderPainted(false);
		adminPanel.add(btnBackToMenu);
		
		
		addInstructorPanel = new JPanel();
		addInstructorPanel.setBackground(Color.WHITE);
		contentPane.add(addInstructorPanel, "name_85772097131518");
		addInstructorPanel.setLayout(null);
		//addInstructorPanel.setVisible(false);
		
		txtAddInstructorName = new JTextField();
		txtAddInstructorName.setBounds(428, 229, 143, 20);
		addInstructorPanel.add(txtAddInstructorName);
		txtAddInstructorName.setColumns(20);
		
		JLabel lblInstructorName = new JLabel("Name :");
		lblInstructorName.setForeground(new Color(30, 144, 255));
		lblInstructorName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInstructorName.setBounds(313, 232, 84, 17);
		addInstructorPanel.add(lblInstructorName);
		
		txtInstructorSurname = new JTextField();
		txtInstructorSurname.setBounds(428, 269, 143, 20);
		addInstructorPanel.add(txtInstructorSurname);
		txtInstructorSurname.setColumns(20);
		
		JLabel lblInstructorSurname = new JLabel("Surname :");
		lblInstructorSurname.setForeground(new Color(30, 144, 255));
		lblInstructorSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblInstructorSurname.setBounds(313, 272, 105, 17);
		addInstructorPanel.add(lblInstructorSurname);
		
		txtInstructorPhone = new JTextField();
		txtInstructorPhone.setBounds(428, 313, 143, 20);
		addInstructorPanel.add(txtInstructorPhone);
		txtInstructorPhone.setColumns(20);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setForeground(new Color(30, 144, 255));
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhone.setBounds(313, 316, 84, 17);
		addInstructorPanel.add(lblPhone);
		
		JLabel lblAddInstructor = new JLabel("Add Instructor");
		lblAddInstructor.setForeground(new Color(30, 144, 255));
		lblAddInstructor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddInstructor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddInstructor.setBounds(372, 108, 162, 20);
		addInstructorPanel.add(lblAddInstructor);
		
		btnNewInstructor = new JButton("Add");
		btnNewInstructor.setForeground(new Color(30, 144, 255));
		btnNewInstructor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewInstructor.setBounds(754, 510, 89, 33);
		addInstructorPanel.add(btnNewInstructor);
		
		btnBackToAdminPanel = new JButton("Back");
	
			
		btnBackToAdminPanel.setForeground(new Color(30, 144, 255));
		btnBackToAdminPanel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackToAdminPanel.setBounds(636, 510, 89, 33);
		addInstructorPanel.add(btnBackToAdminPanel);
		
		adminClassPanel = new JPanel();
		adminClassPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(adminClassPanel, "name_85776853642640");
		adminClassPanel.setLayout(null);
		//adminClassPanel.setVisible(false);
		
		txtClassName = new JTextField();
		txtClassName.setBounds(440, 250, 111, 20);
		adminClassPanel.add(txtClassName);
		txtClassName.setColumns(10);
		
		JLabel lblClassName = new JLabel("Class Name : ");
		lblClassName.setForeground(new Color(30, 144, 255));
		lblClassName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClassName.setBounds(280, 253, 153, 17);
		adminClassPanel.add(lblClassName);
		
		txtClassCapacity = new JTextField();
		txtClassCapacity.setBounds(440, 298, 111, 20);
		adminClassPanel.add(txtClassCapacity);
		txtClassCapacity.setColumns(10);
		
		lblCapacity = new JLabel("Capacity :");
		lblCapacity.setForeground(new Color(30, 144, 255));
		lblCapacity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCapacity.setBounds(280, 289, 132, 30);
		adminClassPanel.add(lblCapacity);
		
		txtFloor = new JTextField();
		txtFloor.setBounds(440, 342, 111, 20);
		adminClassPanel.add(txtFloor);
		txtFloor.setColumns(10);
		
		lblFloor = new JLabel("Floor : ");
		lblFloor.setForeground(new Color(30, 144, 255));
		lblFloor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFloor.setBounds(280, 345, 116, 17);
		adminClassPanel.add(lblFloor);
		
		lblAddClass = new JLabel("Add Class");
		lblAddClass.setForeground(new Color(30, 144, 255));
		lblAddClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddClass.setBounds(387, 116, 138, 30);
		adminClassPanel.add(lblAddClass);
		
		btnAddNewClassroom = new JButton("Add");
		btnAddNewClassroom.setForeground(new Color(30, 144, 255));
		btnAddNewClassroom.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddNewClassroom.setBounds(726, 509, 89, 30);
		adminClassPanel.add(btnAddNewClassroom);
		
		btnBackFromAddClass = new JButton("Back");
		btnBackFromAddClass.setForeground(new Color(30, 144, 255));
		btnBackFromAddClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackFromAddClass.setBounds(609, 509, 89, 30);
		adminClassPanel.add(btnBackFromAddClass);
	}

	public JButton getBtnShowInstructor() {
		return btnShowInstructor;
	}

	public void setBtnShowInstructor(JButton btnShowInstructor) {
		this.btnShowInstructor = btnShowInstructor;
	}

	public JButton getBtnShowRegisteredStudents() {
		return btnShowRegisteredStudents;
	}

	public void setBtnShowRegisteredStudents(JButton btnShowRegisteredStudents) {
		this.btnShowRegisteredStudents = btnShowRegisteredStudents;
	}

	public JButton getBtnShowClasses() {
		return btnShowClasses;
	}

	public void setBtnShowClasses(JButton btnShowClasses) {
		this.btnShowClasses = btnShowClasses;
	}

	public JButton getBtnAddInstructor() {
		return btnAddInstructor;
	}

	public void setBtnAddInstructor(JButton btnAddInstructor) {
		this.btnAddInstructor = btnAddInstructor;
	}

	public JButton getBtnAddNewClass() {
		return btnAddNewClass;
	}

	public void setBtnAddNewClass(JButton btnAddNewClass) {
		this.btnAddNewClass = btnAddNewClass;
	}

	public JButton getBtnAddToExam() {
		return btnAddToExam;
	}

	public void setBtnAddToExam(JButton btnAddToExam) {
		this.btnAddToExam = btnAddToExam;
	}

	public JButton getBtnBackToMenu() {
		return btnBackToMenu;
	}

	public void setBtnBackToMenu(JButton btnBackToMenu) {
		this.btnBackToMenu = btnBackToMenu;
	}

	public JTextField getTxtAddInstructorName() {
		return txtAddInstructorName;
	}

	public void setTxtAddInstructorName(JTextField txtAddInstructorName) {
		this.txtAddInstructorName = txtAddInstructorName;
	}

	public JTextField getTxtInstructorSurname() {
		return txtInstructorSurname;
	}

	public void setTxtInstructorSurname(JTextField txtInstructorSurname) {
		this.txtInstructorSurname = txtInstructorSurname;
	}

	public JTextField getTxtInstructorPhone() {
		return txtInstructorPhone;
	}

	public void setTxtInstructorPhone(JTextField txtInstructorPhone) {
		this.txtInstructorPhone = txtInstructorPhone;
	}

	public JTextField getTxtClassName() {
		return txtClassName;
	}

	public void setTxtClassName(JTextField txtClassName) {
		this.txtClassName = txtClassName;
	}

	public JTextField getTxtClassCapacity() {
		return txtClassCapacity;
	}

	public void setTxtClassCapacity(JTextField txtClassCapacity) {
		this.txtClassCapacity = txtClassCapacity;
	}

	public JTextField getTxtFloor() {
		return txtFloor;
	}

	public void setTxtFloor(JTextField txtFloor) {
		this.txtFloor = txtFloor;
	}

	public JButton getBtnAddNewClassroom() {
		return btnAddNewClassroom;
	}

	public void setBtnAddNewClassroom(JButton btnAddNewClassroom) {
		this.btnAddNewClassroom = btnAddNewClassroom;
	}

	public JButton getBtnBackFromAddClass() {
		return btnBackFromAddClass;
	}

	public void setBtnBackFromAddClass(JButton btnBackFromAddClass) {
		this.btnBackFromAddClass = btnBackFromAddClass;
	}

	public JButton getBtnNewInstructor() {
		return btnNewInstructor;
	}

	public void setBtnNewInstructor(JButton btnNewInstructor) {
		this.btnNewInstructor = btnNewInstructor;
	}

	public JButton getBtnBackToAdminPanel() {
		return btnBackToAdminPanel;
	}

	public void setBtnBackToAdminPanel(JButton btnBackToAdminPanel) {
		this.btnBackToAdminPanel = btnBackToAdminPanel;
	}

	public JPanel getAdminPanel() {
		return adminPanel;
	}

	public void setAdminPanel(JPanel adminPanel) {
		this.adminPanel = adminPanel;
	}

	public JPanel getAddInstructorPanel() {
		return addInstructorPanel;
	}

	public void setAddInstructorPanel(JPanel addInstructorPanel) {
		this.addInstructorPanel = addInstructorPanel;
	}

	public JPanel getAdminClassPanel() {
		return adminClassPanel;
	}

	public void setAdminClassPanel(JPanel adminClassPanel) {
		this.adminClassPanel = adminClassPanel;
	}

	

	
	
}
