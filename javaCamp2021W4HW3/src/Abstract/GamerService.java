package Abstract;

import Entities.Gamer;

public interface GamerService {

	default void save(Gamer gamer) {
		System.out.println("Saved to db : " +gamer.getFirstName() + " " + gamer.getDateOfBirth());
	}
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);
}
