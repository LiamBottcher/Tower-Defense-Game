package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.Game;
import main.GameStates;

public class MyMouseListener implements MouseMotionListener, MouseListener{

	private Game game;
	public MyMouseListener(Game game) {
		this.game=game;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			switch(GameStates.gameState) {
			case GameStates.MENU:
				game.getMenu().mouseClicked(e.getX(), e.getY());
				break;
			case GameStates.PLAYING:
				break;
			case GameStates.SETTINGS:
				break;
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		switch(GameStates.gameState) {
		case GameStates.MENU:
			game.getMenu().mouseMoved(e.getX(), e.getY());
			break;
		case GameStates.PLAYING:
			break;
		case GameStates.SETTINGS:
			break;
		}
		
	}

}
