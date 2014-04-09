package studentView;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class View extends JFrame {
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtSSN;
	
	private JButton btnSave;
	private JButton btnClear;
	private JTextField txtEmail;
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
	private JTextField txtAdress;
	private JTextField txtTelNo;
	private JLabel lblEmail;
	private JLabel lblAddress;
	private JLabel lblTelNo;
	
	private JRadioButton rdMale;
	private JRadioButton rdFemale;
	
	
	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
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

	
	  public JRadioButton getRdMale(){ return rdMale;}
      public JRadioButton getRdFemale(){ return rdFemale;}
    public View() {
    	setResizable(false);
    	
    	setVisible(true);
        
        setTitle("Exam Registration");
        setBounds(100, 100, 100, 100);
        setSize(950, 700);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
        JPanel pnlAdmin = new JPanel();
        pnlAdmin.setBackground(Color.WHITE);
        tabbedPane.addTab("Admin", null, pnlAdmin, null);
        
        JPanel pnlRegistration = new JPanel();
        pnlRegistration.setBackground(Color.WHITE);
        tabbedPane.addTab("Registration", null, pnlRegistration, null);
        
        JLabel lblNewLabel = new JLabel("Exam Registration System");
        lblNewLabel.setBounds(10, 11, 929, 49);
        
        lblNewLabel.setBackground(Color.green);
        lblNewLabel.setForeground(SystemColor.textHighlight);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblName = new JLabel("Name");        
        lblName.setBounds(18, 74, 93, 14);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblName.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtName = new JTextField();
        txtName.setBounds(121, 68, 191, 20);
        txtName.setColumns(10);
        
        txtLastName = new JTextField();
        txtLastName.setBounds(121, 106, 191, 20);
        txtLastName.setColumns(10);
        
        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setBounds(18, 112, 93, 14);
        lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        txtSSN = new JTextField();
        txtSSN.setBounds(121, 144, 191, 20);
        txtSSN.setColumns(10);
        
        JLabel lblSsn = new JLabel("SSN");
        lblSsn.setBounds(18, 150, 93, 14);
        lblSsn.setHorizontalAlignment(SwingConstants.RIGHT);
        lblSsn.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(137, 352, 81, 39);
        btnClear.setForeground(SystemColor.textHighlight);
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        btnSave = new JButton("Save");
        btnSave.setBounds(228, 352, 84, 39);
        btnSave.setForeground(SystemColor.textHighlight);
        btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        txtEmail = new JTextField();
        txtEmail.setBounds(121, 220, 191, 20);
        txtEmail.setColumns(10);
        
        txtAdress = new JTextField();
        txtAdress.setBounds(121, 258, 191, 20);
        txtAdress.setColumns(10);
        
        txtTelNo = new JTextField();
        txtTelNo.setBounds(121, 296, 191, 20);
        txtTelNo.setColumns(10);
        
        lblEmail = new JLabel("E-Mail");
        lblEmail.setBounds(18, 223, 93, 14);
        lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        lblAddress = new JLabel("Address");
        lblAddress.setBounds(18, 261, 93, 14);
        lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        lblTelNo = new JLabel("Tel NO");
        lblTelNo.setBounds(18, 299, 93, 14);
        lblTelNo.setHorizontalAlignment(SwingConstants.RIGHT);
        lblTelNo.setFont(new Font("Tahoma", Font.BOLD, 11));
        pnlRegistration.setLayout(null);
        pnlRegistration.add(lblNewLabel);
        pnlRegistration.add(lblName);
        pnlRegistration.add(lblLastName);
        pnlRegistration.add(lblSsn);
        pnlRegistration.add(lblEmail);
        pnlRegistration.add(lblAddress);
        pnlRegistration.add(lblTelNo);
        pnlRegistration.add(btnClear);
        pnlRegistration.add(btnSave);
        pnlRegistration.add(txtSSN);
        pnlRegistration.add(txtLastName);
        pnlRegistration.add(txtName);
        pnlRegistration.add(txtEmail);
        pnlRegistration.add(txtAdress);
        pnlRegistration.add(txtTelNo);
        
        rdMale = new JRadioButton("Male");
        rdMale.setBackground(Color.WHITE);
        rdMale.setSelected(true);
        rdMale.setBounds(121, 184, 63, 23);
        pnlRegistration.add(rdMale);
        
        rdFemale = new JRadioButton("Female");
        rdFemale.setBackground(Color.WHITE);
        rdFemale.setBounds(197, 184, 81, 23);
        pnlRegistration.add(rdFemale);
        
          
           
           JLabel lblGender = new JLabel("Gender");
           lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
           lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
           lblGender.setBounds(18, 188, 93, 14);
           pnlRegistration.add(lblGender);
       
        
    }
}
