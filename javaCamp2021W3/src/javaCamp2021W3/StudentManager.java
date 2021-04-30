package javaCamp2021W3;

public class StudentManager extends UserManager{

	public void grading(Student student) {
		System.out.println("Grade of the student named "+ student.getName() + " " + student.getLastname()
				+ " is : " + student.getGrade());
	}
	

	public void info(Student student) {
		super.info(student);
		System.out.println("Score: " + student.getSchool() + "\n"+
				"Total students: " +student.getDepartment() + "\n"+
				"Experience: " + student.getGrade());
		System.out.print("************************");
	}
	
}
