package coffeeShopHW.Abstract;

import coffeeShopHW.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {

		System.out.println("Saved to db : " +customer.getFirstName() + " " + customer.getDateOfBirth());
		
	}

}