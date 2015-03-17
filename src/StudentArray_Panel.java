import java.awt.Color;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class StudentArray_Panel extends Panel {
	
	StudentArray_VariablesforGUI guiElements = new StudentArray_VariablesforGUI();
	private JTextField inputField = new JTextField();
	private JLabel inputLabel = new JLabel("Student ID:");

	
	public static ImageIcon image = new ImageIcon("id.png");
	
		public StudentArray_Panel(){
			
		this.setLayout(null);
		this.setBackground(Color.WHITE);

		JPanel imagePanel = new JPanel();
		imagePanel.setBackground(Color.white);
		imagePanel.add(new JLabel(image));
		
		imagePanel.setBounds(getX(),getY(),guiElements.getWidth()[1],guiElements.getHeight()[1]);
		
		inputField.setBounds(guiElements.getXalignment()[0],guiElements.getYalignment()[0],guiElements.getWidth()[2], guiElements.getHeight()[2]);
		
		inputLabel.setBounds(guiElements.getXalignment()[1], guiElements.getYalignment()[0], guiElements.getWidth()[2], guiElements.getHeight()[2]);
		
		add(inputLabel);
		add(inputField);
		add(imagePanel);
	}
}
