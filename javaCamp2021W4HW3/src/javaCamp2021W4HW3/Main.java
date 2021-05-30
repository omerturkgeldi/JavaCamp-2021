package javaCamp2021W4HW3;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


		Game game = new Game(1, "F1 2020", "Sports", 90.99);
		Gamer gamer = new Gamer(1, "Ad", "Soyad", new Date(1999,01,01), "10000000146");
		Campaign campaign = new Campaign(1, "Yaz Kampanyası", 30);
		
		
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		gamerManager.update(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		gameManager.updateGame(game);
		gameManager.deleteGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game,gamer, campaign);
		
		
		
		
	}

}
