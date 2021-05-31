package coffeeShopHW.Abstract;

import coffeeShopHW.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {

		System.out.println("Saved to db!");
		System.out.println("Name: " + customer.getFirstName());
		System.out.println("Surname: " + customer.getLastName());
		System.out.println("Year of Birth: " + customer.getDateOfBirth());
		System.out.println("National ID: " + customer.getNationalityId());

	}

}