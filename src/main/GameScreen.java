package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import inputs.MyKeyListener;
import inputs.MyMouseListener;



public class GameScreen extends JPanel{
	//tutorial has me make isntances of inputs classes and add them with add
	//methods, but it makes more sense to just implement them into the panel
	//nvm im an idiot theyre classes they can't be implemented
	
		private Game game;
	



	
	
	
	public GameScreen(Game game) {
		//here are the things done in gamescreen

		//1: pre-settings
		setFocusable(true); 

		//2: make objects
		this.game = game;
		
		//3: add actionlisteners to panel
		addMouseListener(new MyMouseListener(game));
		addMouseMotionListener(new MyMouseListener(game));
		addKeyListener(new MyKeyListener(game));
		
		//4: post-settings
		requestFocus();

	}
	
	void startGameLoop() {
		Timer timer = new Timer(16, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.getRender().render(g);
	}
	
	
	
}
