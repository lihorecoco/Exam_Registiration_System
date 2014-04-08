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

public class View extends JFrame {
	private JTextField txtName;
	private JTextField txtLastName;
	private JTextField txtSSN;
	
	private JButton btnSave;
	private JButton btnClear;
	
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

    public View() {
    	setResizable(false);
    	
    	setVisible(true);
        
        setTitle("Exam Registration");
        setBounds(100, 100, 100, 100);
        setSize(470, 500);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
        JPanel pnlRegistration = new JPanel();
        pnlRegistration.setBackground(Color.WHITE);
        tabbedPane.addTab("Registration", null, pnlRegistration, null);
        
        JLabel lblNewLabel = new JLabel("Exam Registration System");
        
        lblNewLabel.setBackground(Color.ORANGE);
        lblNewLabel.setForeground(SystemColor.textHighlight);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel lblName = new JLabel("Name");        
        lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblName.setHorizontalAlignment(SwingConstants.RIGHT);
        
        txtName = new JTextField();
        txtName.setColumns(10);
        
        txtLastName = new JTextField();
        txtLastName.setColumns(10);
        
        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        txtSSN = new JTextField();
        txtSSN.setColumns(10);
        
        JLabel lblSsn = new JLabel("SSN");
        lblSsn.setHorizontalAlignment(SwingConstants.RIGHT);
        lblSsn.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        btnClear = new JButton("Clear");
        btnClear.setForeground(SystemColor.textHighlight);
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        btnSave = new JButton("Save");
        btnSave.setForeground(SystemColor.textHighlight);
        btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        GroupLayout gl_pnlRegistration = new GroupLayout(pnlRegistration);
        gl_pnlRegistration.setHorizontalGroup(
        	gl_pnlRegistration.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlRegistration.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        				.addGroup(gl_pnlRegistration.createSequentialGroup()
        					.addGap(8)
        					.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblSsn, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(gl_pnlRegistration.createSequentialGroup()
        							.addComponent(btnClear)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addComponent(txtLastName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        						.addComponent(txtName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        						.addComponent(txtSSN, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)))
        			.addContainerGap(10, Short.MAX_VALUE))
        );
        gl_pnlRegistration.setVerticalGroup(
        	gl_pnlRegistration.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlRegistration.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        			.addGap(8)
        			.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblName)
        				.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.TRAILING)
        				.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblLastName))
        			.addGap(18)
        			.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.TRAILING)
        				.addComponent(txtSSN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblSsn))
        			.addGap(26)
        			.addGroup(gl_pnlRegistration.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(218, Short.MAX_VALUE))
        );
        pnlRegistration.setLayout(gl_pnlRegistration);
        
        JPanel pnlAdmin = new JPanel();
        tabbedPane.addTab("Admin", null, pnlAdmin, null);
       
        
    }
}
