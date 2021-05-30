package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() 
		+ " buys the " + game.getGameName() + " game with the campaign of " 
				+ campaign.getCampaignName() + ", discount: " + campaign.getDiscount());
	}

}
