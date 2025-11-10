package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Game;
import main.GameStates;


public class MyKeyListener implements KeyListener{

	private Game game;
	
	public MyKeyListener(Game game) {
		this.game=game;
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_1){
			GameStates.gameState = GameStates.MENU;
		}
		if (e.getKeyCode() == KeyEvent.VK_2){
			GameStates.gameState = GameStates.PLAYING;
		}
		if (e.getKeyCode() == KeyEvent.VK_3){
			GameStates.gameState = GameStates.SETTINGS;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
