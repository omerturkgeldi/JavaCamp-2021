package coffeeShopHW.Adapters;

import coffeeShopHW.Abstract.CustomerCheckService;
import coffeeShopHW.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean serviceResult = false;
		try {
			serviceResult =  client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
			
		}
		catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return serviceResult;
		
		
		
	}

}
