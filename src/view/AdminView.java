package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.SystemColor;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
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
	private JButton btnOrganizeTheExam;
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
	private JTextField txtSSN;
	private DefaultListModel<String> model;
	private JPanel panel;
	
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
		btnShowInstructor.setBounds(80, 157, 301, 60);
		adminPanel.add(btnShowInstructor);
		
		

		btnShowRegisteredStudents = new JButton("Show Students");
		btnShowRegisteredStudents.setBackground(new Color(255, 255, 255));
		btnShowRegisteredStudents.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowRegisteredStudents.setForeground(new Color(30, 144, 255));
		btnShowRegisteredStudents.setBounds(80, 228, 301, 58);
		adminPanel.add(btnShowRegisteredStudents);
		
		btnShowClasses = new JButton("Show Classes");
		btnShowClasses.setForeground(new Color(30, 144, 255));
		btnShowClasses.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShowClasses.setBackground(new Color(255, 255, 255));
		btnShowClasses.setBounds(80, 297, 301, 60);
		adminPanel.add(btnShowClasses);
		
		btnAddInstructor = new JButton("Add New Instructor");
		btnAddInstructor.setForeground(new Color(30, 144, 255));
		btnAddInstructor.setBackground(new Color(255, 255, 255));
		btnAddInstructor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddInstructor.setBounds(80, 368, 301, 58);
		adminPanel.add(btnAddInstructor);
		
		btnAddNewClass = new JButton("Add New Class");
		btnAddNewClass.setForeground(new Color(30, 144, 255));
		btnAddNewClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddNewClass.setBackground(new Color(255, 255, 255));
		btnAddNewClass.setBounds(80, 437, 301, 60);
		adminPanel.add(btnAddNewClass);
		
		model = new DefaultListModel<String>();
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(580, 93, 288, 377); 
		adminPanel.add(scrollPane);
		//adminPanel.add(list);
		
		btnOrganizeTheExam = new JButton("Organize Exam");
		btnOrganizeTheExam.setBackground(new Color(255, 255, 255));
		btnOrganizeTheExam.setForeground(new Color(30, 144, 255));
		btnOrganizeTheExam.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOrganizeTheExam.setBounds(580, 494, 287, 58);
		adminPanel.add(btnOrganizeTheExam);
		
		btnBackToMenu = new JButton("");
		btnBackToMenu.setForeground(Color.WHITE);
		btnBackToMenu.setBackground(Color.WHITE);
		btnBackToMenu.setIcon(new ImageIcon("C:\\Users\\Canberk Dogan\\Downloads\\1398562730_back.png"));
		btnBackToMenu.setBounds(80, 494, 64, 58);
		btnBackToMenu.setOpaque(false);
		btnBackToMenu.setContentAreaFilled(false);
		btnBackToMenu.setBorderPainted(false);
		adminPanel.add(btnBackToMenu);
		
		JList list = new JList<String>(model);
		//adminPanel.add(list);
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(580, 93, 288, 377);
		list.setVisibleRowCount(16);
		list.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		list.setAutoscrolls(true);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 904, 40);
		adminPanel.add(panel);
		
		lblAdminPanel = new JLabel("Admin Panel");
		panel.add(lblAdminPanel);
		lblAdminPanel.setBackground(new Color(255, 0, 255));
		lblAdminPanel.setForeground(new Color(30, 144, 255));
		lblAdminPanel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
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
		
		txtSSN = new JTextField();
		txtSSN.setBounds(428, 189, 143, 20);
		addInstructorPanel.add(txtSSN);
		txtSSN.setColumns(10);
		
		JLabel lblSsn = new JLabel("SSN :");
		lblSsn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSsn.setForeground(new Color(30, 144, 255));
		lblSsn.setBounds(313, 189, 70, 20);
		addInstructorPanel.add(lblSsn);
		
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

	

	public JButton getBtnOrganizeTheExam() {
		return btnOrganizeTheExam;
	}

	public void setBtnOrganizeTheExam(JButton btnOrganizeTheExam) {
		this.btnOrganizeTheExam = btnOrganizeTheExam;
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

	public JTextField getTxtSSN() {
		return txtSSN;
	}

	public void setTxtSSN(JTextField txtSSN) {
		this.txtSSN = txtSSN;
	}

	public DefaultListModel<String> getModel() {
		return model;
	}

	public void setModel(DefaultListModel<String> model) {
		this.model = model;
	}
}
