package javaCamp2021W3;

public class StudentManager extends UserManager{

	public void grading(Student student) {
		System.out.println("Grade of the student named "+ student.getName() + " " + student.getLastname()
				+ " is : " + student.getGrade());
	}
	

	public void info(Student student) {
		super.info(student);
		System.out.println("School: " + student.getSchool() + "\n"+
				"Department: " +student.getDepartment() + "\n"+
				"Grade: " + student.getGrade());
		System.out.print("************************");
	}
	
}
