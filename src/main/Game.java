package main;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Game extends JFrame{

	private GameScreen gameScreen;


	
	
	
	public Game() {
		
		//notes to take later
		//render or repaint draws the current state of the game on the screen
		//may be changed by players
		//update()
		//moves objects, checks for events, checks for collisions
		//may not be changed by players!!
		
		
		
		
		
		
		setSize(640, 640);
		//if were using 32 pixel tiles, than tiles are 20x20 ss
		//something about pack()? fuck that we don't need that
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		gameScreen = new GameScreen();
		add(gameScreen);
		
	
		setVisible(true);
		
		//after everything is visible, then the game loop will start
		gameScreen.startGameLoop();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		//game is made yay :| now I make a thread for the game loop
		//FUCK the above statement Im done with this nanosecond bullshit
		//I'm using javax timer its SOOOOmuch easier so fuck the while true loop
		//fuck this twice I'm doing it in game constructor cuz thats not static
			
		
		
	}
	
	

	


}
