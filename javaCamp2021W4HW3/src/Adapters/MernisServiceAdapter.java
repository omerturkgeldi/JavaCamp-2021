package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean serviceResult = false;
		try {
			serviceResult =  client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), 
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth());
			
		}
		catch (Exception e) {
			System.out.println("Not a valid person");
		}
		return serviceResult;
		
		
		
	}

}