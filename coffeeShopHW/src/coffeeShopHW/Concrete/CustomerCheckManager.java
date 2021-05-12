package coffeeShopHW.Concrete;

import coffeeShopHW.Abstract.CustomerCheckService;
import coffeeShopHW.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;		
	}

}
