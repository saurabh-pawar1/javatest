
public class student {

	private int studentID;
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearofEngg;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	/**
	 * @return the yearofEngg
	 */
	public int getYearofEngg() {
		return yearofEngg;
	}

	/**
	 * @param yearofEngg the yearofEngg to set
	 */
	public void setYearofEngg(int yearofEngg) {
		this.yearofEngg = yearofEngg;
	}

	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void main (String[] args) {
		
		var s1 = new student();
		System.out.println(s1.name);
		System.out.println(s1.qualifyingExamMarks);
		System.out.println(s1.residentialStatus);
		System.out.println(s1.studentID);
		System.out.println(s1.yearofEngg);
		
	}
	
	
}
