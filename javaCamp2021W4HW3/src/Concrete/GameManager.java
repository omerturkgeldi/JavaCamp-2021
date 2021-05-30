package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println("New game added : " + game.getGameName());
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game updated : " + game.getGameName());
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Game deleted :" + game.getGameName());

		
	}


	
}
