package javaCamp2021W2;
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Engin Demiroğ");
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demiroğ");
		Course course3 = new Course(3, "Programlamaya Giriş için Temel Kurs", "Engin Demiroğ");
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager = new CourseManager();
		
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
		Instructor[] instructors = {instructor1};
		

		for (Course course : courses) {
			System.out.println(course.name + " --- " + course.instructor);
		}
		
		for (Instructor instructor : instructors) {
			System.out.print("Eğitmenlerimiz: " + instructor.name + " ");
			System.out.println();
		}
		
		
		courseManager.addCourse(course3);
		courseManager.completeCourse(course2);
		
	}

}

