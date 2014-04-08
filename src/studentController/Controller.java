package studentController;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller  {
	
		private studentModel.Student student;
		private studentView.View view;
		private ActionListener actionListener;
		
		private Dialog msg;
		
	public Controller(){
		
		System.out.print("asd");
	}
	
	public Controller(studentModel.Student student,studentView.View view){
		
		this.student=student;
		this.view=view;
		
		
	}
	
	public void control(){
		actionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource()==view.getBtnSave()){
					student.setName(view.getTxtName().getText());
					student.setLastName(view.getTxtLastName().getText());
					student.setSSN(view.getTxtSSN().getText());
					String msg=student.getName()+"\n "+student.getLastName()+"\n"+student.getSSN();
					JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
					
				}else if(e.getSource()==view.getBtnClear()){
					view.getTxtName().setText("");
					view.getTxtLastName().setText("");
					view.getTxtSSN().setText("");
					
					
					
				}
			
			}
		};
		
		view.getBtnSave().addActionListener(actionListener);
		view.getBtnClear().addActionListener(actionListener);
	}

	
	
	
	
	
	
}
