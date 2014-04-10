package testt;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

import studentView.*;
import studentModel.*;
import studentController.*;



public class Run {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
					
						Student	std=new Student();
						View view=new View();
						Controller cntrl=new Controller(std, view);
////////////////////////////
			
						
						//////////////
						cntrl.control();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
				
				
			
				
}
		
		
			


