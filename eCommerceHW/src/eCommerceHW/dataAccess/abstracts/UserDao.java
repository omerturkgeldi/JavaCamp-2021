package eCommerceHW.dataAccess.abstracts;

import java.util.List;

import eCommerceHW.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	void confirm(User user);
	void login(User user);
	User get(int id);
	List<User> getAll();
	
}
