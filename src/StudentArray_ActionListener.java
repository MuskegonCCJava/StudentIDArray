import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class StudentArray_ActionListener implements ActionListener {
	
	int StudentID;
	String x;
	Float y;
	boolean isFound = false;
	
	StudentArray_Service service = new StudentArray_Service();

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == StudentArray_Panel.submitButton)
		{
			String StudentIDString = StudentArray_Panel.inputField.getText();
			StudentID = Integer.parseInt(StudentIDString);
			
			int i = 0;
			
			do {
				
				
				if(StudentID == service.getStudentID()[i])
				{
					
					isFound = true;
					x = service.getFname()[i];
					y = service.getGpa()[i];
					String yString = String.valueOf(y);
					
					StudentArray_Panel.fnameLabel.setVisible(true);
					StudentArray_Panel.gpaLabel.setVisible(true);
					
					StudentArray_Panel.fnameOutput.setText(x);
					StudentArray_Panel.gpaOutput.setText(yString);

					
				}

				else
				{
					
					i++;
				
				}
				
				
				} while(isFound == false && i < service.getStudentID().length);
			
			if(isFound == false)
			{
				
				JOptionPane.showMessageDialog(null, "Student ID " + StudentID + " does not exist","Error", JOptionPane.CLOSED_OPTION);
				
			}
			
			if(isFound == true)
			{
				isFound = false;
			}
			

			
			
			
			
			
		}

	}

}
