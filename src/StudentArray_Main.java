/*StudentArray_Main by Kyle Wolff and Brandon Vandermey*/

import java.awt.EventQueue;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.w3c.dom.events.EventException;


public class StudentArray_Main extends JFrame {
	
	 StudentArray_VariablesforGUI guiElements = new  StudentArray_VariablesforGUI();
	 StudentArray_Panel panel = new StudentArray_Panel();
	 
	 static Date today = new Date();

	public static void main (String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			
		@Override
		public void run() {
			
			try {
				
				JOptionPane.showMessageDialog(null, "StudentArray by Kyle Wolff and Brandon VanderMey " + today,"Message", JOptionPane.CLOSED_OPTION);
				StudentArray_Main frame = new StudentArray_Main();
				frame.setVisible(true);
			
				
				} catch(EventException e)
					{
						e.printStackTrace();
					}
			}
		});
	}
	
	
	public StudentArray_Main(){
		int[] width = guiElements.getWidth();
		int[] height = guiElements.getHeight();
	
		setTitle("ID");
		setSize(width[0],height[0]);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		getRootPane().setDefaultButton(StudentArray_Panel.submitButton);
		
				add(panel);
	}

}


