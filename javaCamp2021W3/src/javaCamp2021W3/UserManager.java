package javaCamp2021W3;

public class UserManager {
	
	
	public void login(User user) {
		System.out.println(user.getName() + " " + user.getLastname() + " is succesfully logged in!");
	}
	
	public void add(User user) {
		System.out.println(user.getName() + " " + user.getLastname() + " has registered!");
	}
	
	
	// bulk insert
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
	
	public void info(User user) {
		System.out.println("************************");
		System.out.println("User ID: " + user.getId()+ "\n"+
				"First Name: " + user.getName()+ "\n"+
				"Last Name: " + user.getLastname()+ "\n"+
				"E-mail: " + user.getEmail());
	}

}
