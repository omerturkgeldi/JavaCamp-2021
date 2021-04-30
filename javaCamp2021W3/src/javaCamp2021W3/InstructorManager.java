package javaCamp2021W3;

public class InstructorManager extends UserManager{

	
	
	public void displayCourses(Instructor instructor) {
		System.out.println("Total number of courses of " + instructor.getName() + " " + instructor.getLastname()
		+ ": " + instructor.getCourses().length);
	}
	
	
	public void info(Instructor instructor) {
		super.info(instructor);
		System.out.println("Score: " + instructor.getScore() + "\n"+
				"Total students: " +instructor.getNumberOfStudents() + "\n"+
				"Experience: " + instructor.getYearsOfExperience() + " years\n"+
				"Courses: " + instructor.getCourses().length);
		System.out.print("************************");
	}
	
}
