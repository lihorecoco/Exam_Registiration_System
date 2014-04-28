package studentController;

import java.awt.CardLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import studentView.AdminView;
import studentView.View;

public class Controller_Admin {

	private studentView.View view;
	private ActionListener actionListener;
	private Dialog dialog_control;
	private AdminView admin_view;
	
	
	public Controller_Admin(View view,AdminView admin_view) {
		super();
		this.view = view;
		this.admin_view=admin_view;
		admin_view.setVisible(false);
		view.setVisible(true);
		
	}
	
	public void control_Admin()
	{
		
		actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getSource().equals(view.getBtnLogin())){
					
					view.setVisible(false);
					admin_view.setVisible(true);
					
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
		else if( e.getSource().equals(admin_view.getBtnBackToAdminPanel()) || e.getSource().equals(admin_view.getBtnBackFromAddClass())){
			
			admin_view.getAdminPanel().setVisible(true);
			admin_view.getAdminClassPanel().setVisible(false);
			admin_view.getAddInstructorPanel().setVisible(false);
		}
		
	}
	
}
