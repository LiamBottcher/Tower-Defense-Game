package Scenes;

import main.Game;

public class Scene {
	private Game game;
	public Scene(Game game){
		this.game = game;
	}
	
	public Game getGame() {
		return game;
	}
}
