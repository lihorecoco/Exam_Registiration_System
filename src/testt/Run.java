package testt;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

import model.*;
import controller.*;
import view.*;



public class Run {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
					
						Student	std=new Student();
						View view=new View();
						Controller cntrl=new Controller(std, view);
						cntrl.control();
						AdminView admin_view =new AdminView();
						Controller_Admin controller_admin= new Controller_Admin(view,admin_view);						
						controller_admin.control_Admin();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
				
				
			
				
}
		
		
			


