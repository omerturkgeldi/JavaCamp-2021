package coffeeShopHW;

import java.util.Date;

import coffeeShopHW.Adapters.*;
import coffeeShopHW.Abstract.BaseCustomerManager;
import coffeeShopHW.Concrete.*;
import coffeeShopHW.Entities.Customer;



public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Gazi Mustafa Kemal", "Atatürk", new Date(1881, 07, 01), "10000000146"));
		
	}

}
