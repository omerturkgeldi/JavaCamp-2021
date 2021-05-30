package Entities;

public class Game {
	
	int id;
	String gameName;
	String gameCategory;
	double price;
	
	
	public Game(int id, String gameName, String gameCategory, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameCategory() {
		return gameCategory;
	}


	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
}