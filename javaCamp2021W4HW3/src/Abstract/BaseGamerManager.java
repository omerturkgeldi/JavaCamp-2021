package Abstract;

import Entities.Gamer;

public abstract class BaseGamerManager implements GamerService {

	@Override
	public void save(Gamer gamer) {

		System.out.println("Saved to db : " +gamer.getFirstName() + " " + gamer.getDateOfBirth());
		
	}
	
}
