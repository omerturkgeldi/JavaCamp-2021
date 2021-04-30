package javaCamp2021W3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Ömer", "Türkgeldi", "omer@gmail.com", "CBU", "Computer Engineering");
		Student student2 = new Student(2, "Metin", "Taşkaya", "metin@gmail.com", "DEU", "Industrial Engineering");
		Student student3 = new Student(3, "Filiz", "Sungar", "filiz@gmail.com", "EU", "Computer Sciences");
		
		String[] courses1 = {"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
				"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
				"Programlamaya Giriş için Temel Kurs"};
		String[] courses2 = {"Angular - The Complete Guide (2021 Edition)","React Native - The Practical Guide [2021 Edition]"};

		
		Instructor instructor1 = new Instructor(4, "Engin", "Demiroğ", "engin@gmail.com", 86, 456, 15,courses1);
		Instructor instructor2 = new Instructor(5, "Maximilian", "Schwarzmüller", "maximilian@gmail.com", 0, 0, 0,courses2);
		
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		
		User[] users = {student1,student2,student3,instructor1,instructor2}; 
		userManager.addMultiple(users);
		userManager.login(instructor2);
		studentManager.grading(student1);
		studentManager.grading(student2);
		studentManager.grading(student3);
		instructorManager.displayCourses(instructor1);
		instructorManager.displayCourses(instructor2);

		instructorManager.info(instructor2);
		studentManager.info(student3);
		
	}

}
