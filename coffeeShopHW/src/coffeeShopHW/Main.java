package coffeeShopHW;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import coffeeShopHW.Abstract.BaseCustomerManager;
import coffeeShopHW.Concrete.*;
import coffeeShopHW.Entities.Customer;

public class Main {

	public static void main(String[] args) {


		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Gazi Mustafa Kemal", "Atatürk", new Date(1881, 07, 01), "10000000146"));
		
	}

}
