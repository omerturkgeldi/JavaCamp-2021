package javaCamp2021W3;

public class Instructor extends User {

	private double score;
	private int numberOfStudents;
	private int yearsOfExperience;
	private String[] courses;
	
	public Instructor(int id, String name, String lastname, String email, double score, int numberOfStudents,
			int yearsOfExperience,String[] courses) {
		super(id, name, lastname, email);
		this.score = score;
		this.numberOfStudents = numberOfStudents;
		this.yearsOfExperience = yearsOfExperience;
		this.courses = courses;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}


}
