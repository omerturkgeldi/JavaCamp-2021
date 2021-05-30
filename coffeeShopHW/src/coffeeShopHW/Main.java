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
	//	customerManager.save(new Customer(1, "Tugay", "Türkgeldi", new Date(1994, 05, 29), "55261087284"));
		customerManager.save(new Customer(1, "Ömer", "Türkgeldi", new Date(1999, 05, 29), "55258087358"));
	}

}
