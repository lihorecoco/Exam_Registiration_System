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
						ArrayList<Classroom> classes = new ArrayList<Classroom>(); 
						
 						/*Student student1 = new Student("Canberk", "Doðan", "12345");
						Student student2 = new Student("Canberk1", "Doðan2", "12346");
						Student student3 = new Student("Canberk2", "Doðan2", "12347");*/
						
						//////////////
						cntrl.control();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
				
				
			
				
}
		
		
			


