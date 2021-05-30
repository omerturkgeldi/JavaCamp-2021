package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager{


	private GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	
	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.save(gamer);
		}else {
			System.out.println("Not a valid person!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
