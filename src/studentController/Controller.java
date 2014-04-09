package studentController;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import studentModel.StudentDAO;
import studentModel.StudentDAOFactory;

public class Controller  {
	
		private studentModel.Student student;
		private studentView.View view;
		private ActionListener actionListener;
		
		private Dialog msg;
		
	public Controller(){
		
	
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
					if(view.getTxtName().getText()==""||view.getTxtLastName().getText()==""||view.getTxtSSN().getText()==""){
						JOptionPane.showMessageDialog(null, "Fil the whole infos. !!!","Display Message",JOptionPane.ERROR_MESSAGE);
						//return;
					}
					else{
						student.setName(view.getTxtName().getText());
						student.setLastName(view.getTxtLastName().getText());
						student.setSSN(view.getTxtSSN().getText());
						//String msg=student.getName()+"\n "+student.getLastName()+"\n"+student.getSSN();
						//JOptionPane.showMessageDialog(null, msg, "Display Message", JOptionPane.INFORMATION_MESSAGE);
					
						StudentDAO stdDao=StudentDAOFactory.getStudentDAO();
					
						int result = stdDao.insertStudent(student);
						stdDao.getStudent("");
						if (result==1) {
							JOptionPane.showMessageDialog(null, " Ekleme iþlemi Baþarýlý !!!","Success",JOptionPane.INFORMATION_MESSAGE);
						} else 
							JOptionPane.showMessageDialog(null, " Ekleme iþlemi BAÞARISIZ !!!","Error",JOptionPane.ERROR_MESSAGE);
					}
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
