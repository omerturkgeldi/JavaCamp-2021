package eCommerceHW.dataAccess.concretes;

import java.util.List;

import eCommerceHW.dataAccess.abstracts.UserDao;
import eCommerceHW.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+ " adlı kullanıcı eklendi. (Id = " + user.getId() + ")");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+ " adlı kullanıcı güncellendi. (Id = " + user.getId() + ")");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+ " adlı kullanıcı silindi. (Id = " + user.getId() + ")");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail() + " adlı e-posta adresiniz onaylandı.");
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " adlı kullanıcı başarıyla giriş yaptı.");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
