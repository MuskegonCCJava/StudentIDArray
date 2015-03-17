
public class StudentArray_Service {
	
	private int[] studentID = {1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
	private String[] fname = {"Kyle", "Alex", "Chris", "Bob", "John", "Julie", "Kaitlyn", "Macinda", "David", "Sam"};
	private float[] gpa = {3.5f, 3.0f, 2.5f, 2.3f, 3.6f, 4.0f, 3.7f, 2.4f, 2.9f, 3.9f };
	
	public int[] getStudentID() {
		
		return studentID;
	}
	
	public void setStudentID(int[] studentID) {
		
		this.studentID = studentID;
	}

	public String[] getFname() {
	
		return fname;
	}

	public void setFname(String[] fname) {
		
		this.fname = fname;
	}

	public float[] getGpa() {
		
		return gpa;
	}

	public void setGpa(float[] gpa) {
		
		this.gpa = gpa;
	}

}


