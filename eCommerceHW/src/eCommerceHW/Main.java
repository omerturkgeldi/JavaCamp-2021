package eCommerceHW;

import eCommerceHW.business.concretes.UserManager;
import eCommerceHW.core.GoogleAuthManagerAdapter;
import eCommerceHW.dataAccess.concretes.HibernateUserDao;
import eCommerceHW.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAuthManagerAdapter());
		
		User user1 = new User(1, "Ömer", "Türkgeldi","omerturkgeldi@hotmail.com", "123545", false);
		User user2 = new User(1, "ad", "soyad","adsoyad@hotmail.com", "1235", true);
		
		userManager.register(user1);
		userManager.confirm(user1);
		userManager.login(user1);
		System.out.println("***************************");
		
		userManager.register(user2);
		userManager.confirm(user2);
		userManager.login(user2);

	}

}
