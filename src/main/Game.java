package main;




import javax.swing.JFrame;

import Scenes.Menu;
import Scenes.Playing;
import Scenes.Settings;

//overarching class with all classes in it, from what I can tell
//i think also where everything is init but also not
public class Game extends JFrame{

	private GameScreen gameScreen;
	private Render render;
	private Menu menu;
	private Playing playing;
	private Settings settings;
	
	public Game() {
		
		//1: pre settings
		setSize(640, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("worlds best td game");
		setResizable(false);

		//2: make objects
		makeObjects();
		
		//3: post settings
		add(gameScreen);
		setVisible(true);
		
		//4: start the game
		gameScreen.startGameLoop();

	}
	
	private void makeObjects() {
		gameScreen = new GameScreen(this);
		render = new Render(this);
		menu = new Menu(this);
		playing = new Playing(this);
		settings = new Settings(this);
		
	}

	public static void main(String[] args) {
		//Constructs JPanel()
		Game game = new Game();
	}
	
	public Render getRender() {
		return render;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public Playing getPlaying() {
		return playing;
	}
	
	public Settings getSettings() {
		return settings;
	}	
	
	

	


}
