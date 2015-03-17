
public class StudentArray_VariablesforGUI {
	
	private int[] width = {/*Frame wSize*/400, StudentArray_Panel.image.getIconWidth(), /*TextField*/100 };
	private int[] height = {/*Frame hSize*/400, StudentArray_Panel.image.getIconHeight(), /*TextField*/20};
	private int[] Xalignment = {/*TextField*/ 210, 140, 50, 135, 100};
	private int[] Yalignment = {/*TextField*/ 100, 200, 240, 135};

	public int[] getWidth() {
		return width;
	}
	
	public int[] getHeight() {
		return height;
	}
	
	public int[] getXalignment() {
		return Xalignment;
	}
	
	public int[] getYalignment() {
		return Yalignment;
	}

}
