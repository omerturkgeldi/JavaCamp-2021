package coffeeShopHW.Concrete;

import coffeeShopHW.Abstract.BaseCustomerManager;
import coffeeShopHW.Abstract.CustomerCheckService;
import coffeeShopHW.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		

		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person!");
		}
		
	}
}
