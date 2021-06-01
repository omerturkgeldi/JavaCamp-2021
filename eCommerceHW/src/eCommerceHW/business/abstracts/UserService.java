package eCommerceHW.business.abstracts;

import eCommerceHW.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(User user);
	void confirm(User user);
}
