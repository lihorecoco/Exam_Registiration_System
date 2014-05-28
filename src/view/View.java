package view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Component;

import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.corba.se.impl.protocol.giopmsgheaders.MessageBase;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Timer;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTextPane;

import model.Student;
import model.StudentDAOImpl;

public class View extends JFrame {
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtSSN;
	private JTextField txtAdress;
	private JTextField txtTelNo;
	private JLabel lblEmail;
	private JLabel lblAddress;
	private JLabel lblTelNo;
	
	private StudentDAOImpl dbOperation;
	private JOptionPane msgLoginSuccess;
	
	public JOptionPane getMsgLoginSuccess() {
		return msgLoginSuccess;
	}
	private JButton btnLogin;
	private JButton btnSave;
	private JButton btnClear;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblSystemAdministration;
	private JTextField txtClass;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblAddedStudents;
	private DefaultListModel<String> model;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JScrollPane scrollPane_1;
	private JTable table;

	private JTextField txtSelectedSsn;
	private JTextField txtSelectedName;
	private JTextField txtSelectedLastme;
	private JTextField txtSelClass;
	private JTextField txtSelemail;
	private JTextField txtSelAddres;
	private JTextField txtSelTelno;
	
	public JTextField getTxtSelClass() {
		return txtSelClass;
	}
	public void setTxtSelClass(JTextField txtSelClass) {
		this.txtSelClass = txtSelClass;
	}
	public JTextField getTxtSelemail() {
		return txtSelemail;
	}
	public void setTxtSelemail(JTextField txtSelemail) {
		this.txtSelemail = txtSelemail;
	}
	public JTextField getTxtSelAddres() {
		return txtSelAddres;
	}
	public void setTxtSelAddres(JTextField txtSelAddres) {
		this.txtSelAddres = txtSelAddres;
	}
	public JTextField getTxtSelTelno() {
		return txtSelTelno;
	}
	public void setTxtSelTelno(JTextField txtSelTelno) {
		this.txtSelTelno = txtSelTelno;
	}
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;

	private JLabel label_6;
	private JButton btnUpdate;
	
	
	public JTable getTable() {
		return table;
	}
	public JTextField getTxtSelectedSsn() {
		return txtSelectedSsn;
	}



	public JTextField getTxtSelectedName() {
		return txtSelectedName;
	}



	public JTextField getTxtSelectedLastme() {
		return txtSelectedLastme;
	}


	

	public void setTxtSelectedSsn(JTextField txtSelectedSsn) {
		this.txtSelectedSsn = txtSelectedSsn;
	}
	public void setTxtSelectedName(JTextField txtSelectedName) {
		this.txtSelectedName = txtSelectedName;
	}
	public void setTxtSelectedLastme(JTextField txtSelectedLastme) {
		this.txtSelectedLastme = txtSelectedLastme;
	}
	public JTextField getTxtClass() {
		return txtClass;
	}



	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JTextField getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(JTextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public JPasswordField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(JPasswordField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtAdress() {
		return txtAdress;
	}

	public void setTxtAdress(JTextField txtAdress) {
		this.txtAdress = txtAdress;
	}

	public JTextField getTxtTelNo() {
		return txtTelNo;
	}

	public void setTxtTelNo(JTextField txtTelNo) {
		this.txtTelNo = txtTelNo;
	}
		
	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}
	
	public void setModel(DefaultListModel<String> model) {
		this.model = model;
	}
	
	public DefaultListModel<String> getModel() {
		return model;
	}
	public JTextField getTxtLastName() {
		return txtLastName;
	}

	public void setTxtLastName(JTextField txtLastName) {
		this.txtLastName = txtLastName;
	}

	public JTextField getTxtSSN() {
		return txtSSN;
	}

	public void setTxtSSN(JTextField txtSSN) {
		this.txtSSN = txtSSN;
	}
	
	public JButton getBtnSave() {
		return btnSave;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	

    public View() {
    	
    	setVisible(true);
        
        setTitle("Exam Registration");
        setBounds(100, 100, 100, 100);
        setSize(950, 700);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
           
           JPanel pnlAdmin =new JPanel();
           pnlAdmin.setForeground(new Color(30, 144, 255));
           pnlAdmin.setBackground(Color.WHITE);
           tabbedPane.addTab("Admin", null, pnlAdmin, null);
           pnlAdmin.setLayout(null);
           
           panel_5 = new JPanel();
           panel_5.setBounds(10, 11, 909, 52);
           pnlAdmin.add(panel_5);
           
           lblSystemAdministration = new JLabel("System Administration");
           panel_5.add(lblSystemAdministration);
           lblSystemAdministration.setBackground(new Color(30, 144, 255));
           lblSystemAdministration.setFont(new Font("Tahoma", Font.BOLD, 30));
           lblSystemAdministration.setForeground(new Color(30, 144, 255));
           
           panel_6 = new JPanel();
           panel_6.setBackground(SystemColor.menu);
           panel_6.setBounds(224, 231, 417, 207);
           pnlAdmin.add(panel_6);
           panel_6.setLayout(null);
           
           JLabel lblUsername_1 = new JLabel("Username :");
           lblUsername_1.setBounds(22, 32, 115, 25);
           panel_6.add(lblUsername_1);
           lblUsername_1.setFont(new Font("Tahoma", Font.BOLD, 20));
           lblUsername_1.setForeground(SystemColor.textHighlight);
           
           txtUsername = new JTextField();
           txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
           txtUsername.setBounds(157, 32, 220, 38);
           panel_6.add(txtUsername);
           txtUsername.setColumns(10);
           
           JLabel lblPassword_1 = new JLabel("Password : ");
           lblPassword_1.setBounds(27, 94, 120, 21);
           panel_6.add(lblPassword_1);
           lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 20));
           lblPassword_1.setForeground(SystemColor.textHighlight);
           
           
           txtPassword = new JPasswordField();
           txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
           txtPassword.setBounds(157, 81, 220, 37);
           panel_6.add(txtPassword);
           
           btnLogin = new JButton("Login\r\n");
           btnLogin.setBounds(157, 145, 220, 51);
           panel_6.add(btnLogin);
           btnLogin.setForeground(new Color(30, 144, 255));
           btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
           btnLogin.setToolTipText("");
           


           JPanel pnlRegistration = new JPanel();
           pnlRegistration.setBackground(Color.WHITE);
           tabbedPane.addTab("Registration", null, pnlRegistration, null);
           
            pnlRegistration.setLayout(null);
               
               JPanel panel = new JPanel();
               panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
               panel.setBackground(Color.YELLOW);
               panel.setBounds(18, 11, 911, 39);
               pnlRegistration.add(panel);
               
               JLabel lblNewLabel = new JLabel("Exam Registration System");
               panel.add(lblNewLabel);
               
               lblNewLabel.setBackground(Color.WHITE);
               lblNewLabel.setForeground(SystemColor.textHighlight);
               lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
               lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
               
               JPanel panel_1 = new JPanel();
               panel_1.setBackground(SystemColor.menu);
               panel_1.setBounds(18, 61, 374, 571);
               pnlRegistration.add(panel_1);
               panel_1.setLayout(null);
               
               JLabel lblName = new JLabel("Name");
               lblName.setBounds(10, 98, 73, 14);
               panel_1.add(lblName);
               lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
               lblName.setHorizontalAlignment(SwingConstants.RIGHT);
               
               txtName = new JTextField();
               txtName.setBounds(93, 88, 224, 34);
               panel_1.add(txtName);
               txtName.setColumns(10);
               
               JLabel lblLastName = new JLabel("Last Name");
               lblLastName.setBounds(10, 143, 73, 14);
               panel_1.add(lblLastName);
               lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
               lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
               
               txtLastName = new JTextField();
               txtLastName.setBounds(93, 133, 224, 34);
               panel_1.add(txtLastName);
               txtLastName.setColumns(10);
               
               JLabel lblSsn = new JLabel("SSN");
               lblSsn.setBounds(10, 188, 73, 14);
               panel_1.add(lblSsn);
               lblSsn.setHorizontalAlignment(SwingConstants.RIGHT);
               lblSsn.setFont(new Font("Tahoma", Font.BOLD, 11));
               
               txtSSN = new JTextField();
               txtSSN.setBounds(93, 178, 224, 34);
               panel_1.add(txtSSN);
               txtSSN.setColumns(10);
               

                  JLabel lblGender = new JLabel("Class");
                  lblGender.setBounds(10, 233, 73, 14);
                  panel_1.add(lblGender);
                  lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
                  lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
                  
                  txtClass = new JTextField();
                  txtClass.setBounds(93, 223, 224, 34);
                  panel_1.add(txtClass);
                  txtClass.setColumns(10);
                  
                  lblEmail = new JLabel("E-Mail");
                  lblEmail.setBounds(10, 278, 73, 14);
                  panel_1.add(lblEmail);
                  lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
                  lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
                  
                  txtEmail = new JTextField();
                  txtEmail.setBounds(93, 268, 224, 34);
                  panel_1.add(txtEmail);
                  txtEmail.setColumns(10);
                  
                  lblAddress = new JLabel("Address");
                  lblAddress.setBounds(10, 323, 73, 14);
                  panel_1.add(lblAddress);
                  lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
                  lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
                  
                  txtAdress = new JTextField();
                  txtAdress.setBounds(93, 313, 224, 34);
                  panel_1.add(txtAdress);
                  txtAdress.setColumns(10);
                  
                  lblTelNo = new JLabel("Tel NO");
                  lblTelNo.setBounds(10, 368, 73, 14);
                  panel_1.add(lblTelNo);
                  lblTelNo.setHorizontalAlignment(SwingConstants.RIGHT);
                  lblTelNo.setFont(new Font("Tahoma", Font.BOLD, 11));
                  
                  txtTelNo = new JTextField();
                  txtTelNo.setBounds(93, 358, 224, 34);
                  panel_1.add(txtTelNo);
                  txtTelNo.setColumns(10);
                  
                  btnClear = new JButton("Clear");
                  btnClear.setBounds(93, 500, 102, 39);
                  panel_1.add(btnClear);
                  btnClear.setForeground(SystemColor.textHighlight);
                  btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
                  
                  btnSave = new JButton("Save");
                  btnSave.setBounds(215, 500, 102, 39);
                  panel_1.add(btnSave);
                  btnSave.setForeground(SystemColor.textHighlight);
                  btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
                  
                  JPanel panel_2 = new JPanel();
                  panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
                  panel_2.setBackground(Color.YELLOW);
                  panel_2.setBounds(10, 11, 354, 39);
                  panel_1.add(panel_2);
                  
                  JLabel lblNewLabel_1 = new JLabel("Student Informations");
                  lblNewLabel_1.setForeground(SystemColor.textHighlight);
                  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
                  panel_2.add(lblNewLabel_1);
                  lblNewLabel_1.setBackground(Color.YELLOW);
                  
                  panel_3 = new JPanel();
                  panel_3.setBounds(402, 61, 527, 571);
                  pnlRegistration.add(panel_3);
                  panel_3.setLayout(null);
                  
                  panel_4 = new JPanel();
                  panel_4.setBounds(10, 11, 507, 39);
                  panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
                  panel_4.setBackground(Color.YELLOW);
                  panel_3.add(panel_4);
                  
                  lblAddedStudents = new JLabel("Added Students");
                  lblAddedStudents.setForeground(SystemColor.textHighlight);
                  lblAddedStudents.setFont(new Font("Tahoma", Font.BOLD, 20));
                  lblAddedStudents.setBackground(Color.YELLOW);
                  panel_4.add(lblAddedStudents);
                  
                   
                 
                  model=new DefaultListModel<String>();
                  
                  panel_7 = new JPanel();
                  panel_7.setBounds(10, 61, 507, 232);
                  panel_3.add(panel_7);
                  panel_7.setLayout(null);
                  
   
                  //////////////
                  dbOperation = new StudentDAOImpl();
                  ArrayList<Student> students = dbOperation.showAddedStudent();
          		//view.getModel().removeAllElements();
          		String columns[]={"SSN","NAME","LAST NAME","PHONE NUMBER"};
          		String[][] datas=new String[students.size()][4];
                 for(int i=0;i<students.size();i++){
                	 datas[i][0]=students.get(i).getSSN();
                	 datas[i][1]=students.get(i).getName();
                	 datas[i][2]=students.get(i).getLastName();
                	 datas[i][3]=students.get(i).getTelNo();
                 }
                 
          	     scrollPane_1 = new JScrollPane();
                 scrollPane_1.setBounds(10, 5, 487, 216);
                 panel_7.add(scrollPane_1);
                 
                 table = new JTable(datas,columns);
                 JTableHeader header = table.getTableHeader();
                 table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                /* table.getSelectionModel().addListSelectionListener(
                         new ListSelectionListener() {

                         @Override
                         public void valueChanged(ListSelectionEvent e) {
                             if (!e.getValueIsAdjusting()) {
                                 System.out.println(table.getValueAt(table.getSelectedRow(), 0));
                             }
                         }
                     });*/
                 header.setBackground(Color.yellow);
                 scrollPane_1.setViewportView(table);
                 
                 txtSelectedSsn = new JTextField();
                 txtSelectedSsn.setForeground(SystemColor.textHighlight);
                 txtSelectedSsn.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelectedSsn.setBounds(87, 319, 176, 30);
                 panel_3.add(txtSelectedSsn);
                 txtSelectedSsn.setColumns(20);
                 
                 txtSelectedName = new JTextField();
                 txtSelectedName.setForeground(SystemColor.textHighlight);
                 txtSelectedName.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelectedName.setColumns(20);
                 txtSelectedName.setBounds(87, 360, 176, 30);
                 panel_3.add(txtSelectedName);
                 
                 txtSelectedLastme = new JTextField();
                 txtSelectedLastme.setForeground(SystemColor.textHighlight);
                 txtSelectedLastme.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelectedLastme.setColumns(20);
                 txtSelectedLastme.setBounds(87, 401, 176, 30);
                 panel_3.add(txtSelectedLastme);
                 
                 label = new JLabel("Name");
                 label.setHorizontalAlignment(SwingConstants.RIGHT);
                 label.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label.setBounds(26, 369, 51, 14);
                 panel_3.add(label);
                 
                 label_1 = new JLabel("Last Name");
                 label_1.setHorizontalAlignment(SwingConstants.RIGHT);
                 label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label_1.setBounds(10, 410, 73, 14);
                 panel_3.add(label_1);
                 
                 label_2 = new JLabel("SSN");
                 label_2.setHorizontalAlignment(SwingConstants.RIGHT);
                 label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label_2.setBounds(26, 328, 51, 14);
                 panel_3.add(label_2);
                 
                 txtSelClass = new JTextField();
                 txtSelClass.setForeground(SystemColor.textHighlight);
                 txtSelClass.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelClass.setColumns(10);
                 txtSelClass.setBounds(87, 442, 73, 30);
                 panel_3.add(txtSelClass);
                 
                 txtSelemail = new JTextField();
                 txtSelemail.setForeground(SystemColor.textHighlight);
                 txtSelemail.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelemail.setColumns(20);
                 txtSelemail.setBounds(334, 319, 158, 30);
                 panel_3.add(txtSelemail);
                 
                 label_3 = new JLabel("Class");
                 label_3.setHorizontalAlignment(SwingConstants.RIGHT);
                 label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label_3.setBounds(10, 453, 73, 14);
                 panel_3.add(label_3);
                 
                 label_4 = new JLabel("E-Mail");
                 label_4.setHorizontalAlignment(SwingConstants.RIGHT);
                 label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label_4.setBounds(273, 330, 51, 14);
                 panel_3.add(label_4);
                 
                 label_5 = new JLabel("Tel NO");
                 label_5.setHorizontalAlignment(SwingConstants.RIGHT);
                 label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label_5.setBounds(279, 371, 45, 14);
                 panel_3.add(label_5);
                 
                 txtSelTelno = new JTextField();
                 txtSelTelno.setForeground(SystemColor.textHighlight);
                 txtSelTelno.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelTelno.setColumns(20);
                 txtSelTelno.setBounds(334, 360, 158, 30);
                 panel_3.add(txtSelTelno);
                 
                 label_6 = new JLabel("Address");
                 label_6.setHorizontalAlignment(SwingConstants.RIGHT);
                 label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
                 label_6.setBounds(273, 412, 51, 14);
                 panel_3.add(label_6);
                 
                 txtSelAddres = new JTextField();
                 txtSelAddres.setForeground(SystemColor.textHighlight);
                 txtSelAddres.setFont(new Font("Tahoma", Font.BOLD, 14));
                 txtSelAddres.setColumns(100);
                 txtSelAddres.setBounds(334, 401, 158, 30);
                 panel_3.add(txtSelAddres);
                 
                 btnUpdate = new JButton("UPDATE");
                 btnUpdate.setBounds(349, 489, 143, 39);
                 panel_3.add(btnUpdate);
                 
                 
    }
	public JButton getBtnUpdate() {
		return btnUpdate;
	}
}
