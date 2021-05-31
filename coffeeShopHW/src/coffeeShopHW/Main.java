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
		customerManager.save(new Customer(1, "Ad", "Soyad", new Date(1955, 01, 01), "10000000046"));
	}

}
