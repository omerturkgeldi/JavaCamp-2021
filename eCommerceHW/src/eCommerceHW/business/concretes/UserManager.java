package eCommerceHW.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceHW.business.abstracts.UserService;
import eCommerceHW.core.GoogleAuthService;
import eCommerceHW.dataAccess.abstracts.UserDao;
import eCommerceHW.entities.concretes.User;

public class UserManager implements UserService{

	private List<String> emailList = new ArrayList<String>();

	private UserDao userDao;
	private GoogleAuthService googleAuthService;
	
	
	
	public UserManager(UserDao userDao, GoogleAuthService googleAuthService) {
		super();
		this.userDao = userDao;
		this.googleAuthService = googleAuthService;
	}
	
	

	public static boolean isValid(String email) {
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
		
	} 
		
	
	@Override
	public void register(User user) {

		user.setVerified(true);
		this.googleAuthService.register(user.getEmail() + " adresi doğrulandı.");
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parolanız en az 6 karakterden oluşmalıdır.");
			return;
		}
		
		if(!isValid(user.getEmail())) {
			System.out.println(user.getEmail() + " geçerli bir e-posta adresi değil!");
		}else {
			user.setVerified(true);
			this.googleAuthService.register(user.getEmail() + " adresi doğrulandı.");
		}
		/*
		for(User users: userDao.getAll()) {
			if(users.getEmail().equals(user.getEmail())) {
				System.out.println(user.getEmail() + " mail adresi kullanımda.");
			}
		}*/
		
		if (emailList.contains(user.getEmail())) {
			System.out.println(user.getEmail() + " mail adresi kullanımda.");
		}	

		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad en az 2 karakterden oluşmalıdır.");
		}
		
	}

	
	
	@Override
	public void login(User user) {
		
		if (user.isVerified() == true) {
			userDao.login(user);
		}else {
			System.out.println("Giriş başarısız... Lütfen e-posta adresinizi kontrol ediniz.");
		}
		
		
	}

	@Override
	public void confirm(User user) {

		if (user.isVerified() == true) {
			userDao.confirm(user);
			System.out.println("E-posta adresiniz doğrulandı.");
		}
		else {
			System.out.println("E-posta adresiniz doğrulanamadı.");
		}
		
	}

}
