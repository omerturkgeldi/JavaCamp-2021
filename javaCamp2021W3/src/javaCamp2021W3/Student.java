package javaCamp2021W3;

public class Student extends User{

	private String school;
	private String department;
	
	public Student(int id, String name, String lastname, String email, String school, String department) {
		super(id, name, lastname, email);
		this.school = school;
		this.department = department;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getGrade() {
		return (int)(Math.random() * 100);
	}


	
}
