import java.awt.Color;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class StudentArray_Panel extends Panel {
	
	StudentArray_VariablesforGUI guiElements = new StudentArray_VariablesforGUI();
	StudentArray_Service service = new StudentArray_Service();
	
	public static JTextField inputField = new JTextField();
	private JLabel inputLabel = new JLabel("Student ID:");
	public static JLabel fnameLabel = new JLabel("First Name:");
	public static JLabel gpaLabel = new JLabel("GPA:");
	
	public static JLabel fnameOutput = new JLabel();
	public static JLabel gpaOutput = new JLabel();
	
	static JButton submitButton = new JButton("Submit");

	public static ImageIcon image = new ImageIcon("id.png");
	
		public StudentArray_Panel(){
			
		StudentArray_ActionListener listener = new StudentArray_ActionListener();
			
		this.setLayout(null);
		this.setBackground(Color.WHITE);

		JPanel imagePanel = new JPanel();
		imagePanel.setBackground(Color.white);
		imagePanel.add(new JLabel(image));
		
		imagePanel.setBounds(getX(),getY(),guiElements.getWidth()[1],guiElements.getHeight()[1]);
		
		inputField.setBounds(guiElements.getXalignment()[0],guiElements.getYalignment()[0],guiElements.getWidth()[2], guiElements.getHeight()[2]);
		
		inputLabel.setBounds(guiElements.getXalignment()[1], guiElements.getYalignment()[0], guiElements.getWidth()[2], guiElements.getHeight()[2]);
		
		fnameLabel.setBounds(guiElements.getXalignment()[2], guiElements.getYalignment()[1], guiElements.getWidth()[2], guiElements.getHeight()[2]);
		fnameLabel.setVisible(false);
		
		gpaLabel.setBounds(guiElements.getXalignment()[2], guiElements.getYalignment()[2], guiElements.getWidth()[2], guiElements.getHeight()[2]);
		gpaLabel.setVisible(false);
		
		fnameOutput.setBounds(guiElements.getXalignment()[3], guiElements.getYalignment()[1], guiElements.getWidth()[2], guiElements.getHeight()[2]);
		
		gpaOutput.setBounds(guiElements.getXalignment()[4], guiElements.getYalignment()[2], guiElements.getWidth()[2], guiElements.getHeight()[2]);
		
		submitButton.setBounds(guiElements.getXalignment()[0],guiElements.getYalignment()[3],guiElements.getWidth()[2], guiElements.getHeight()[2]);
		submitButton.addActionListener(listener);
		
		
		add(submitButton);
		add(gpaOutput);
		add(fnameOutput);
		add(fnameLabel);
		add(gpaLabel);
		add(inputLabel);
		add(inputField);
		add(imagePanel);
	}
}
