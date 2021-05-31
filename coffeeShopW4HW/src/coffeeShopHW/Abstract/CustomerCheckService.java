package coffeeShopHW.Abstract;


import coffeeShopHW.Entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
	
	
}
