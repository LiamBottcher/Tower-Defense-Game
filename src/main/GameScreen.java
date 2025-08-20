package main;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import inputs.MyMouseListener;
import inputs.MyKeyListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;



public class GameScreen extends JPanel{
	//tutorial has me make isntances of inputs classes and add them with add
	//methods, but it makes more sense to just implement them into the panel
	//nvm im an idiot theyre classes they can't be implemented
	private Random random;
	
	private BufferedImage img;
	private int count;
	private long start;

	
	private ArrayList<BufferedImage> sprites = new ArrayList<>();
	
	
	public GameScreen() {
		setFocusable(true); // Make sure the panel can receive focus
		random = new Random();
		try {
		img = ImageIO.read(new File("res/spriteatlas.png"));
		} catch (IOException e) {}
		
		
		loadSprites();
		//self explanatory adding the listeners this method prob meant for this
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseListener());
		addKeyListener(new MyKeyListener());
		
		//after all is added myPanel.requestFocus() for keylistener
		requestFocusInWindow(); // tries to grab focus
;
		
		
		
		
		
	}
	
	void startGameLoop() {
		Timer timer = new Timer(16, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//repaint();
				//where my update function would be
				
				repaint();
				
			}
			
		});
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				
				g.drawImage(sprites.get(random.nextInt(100)), i * 32, j * 32, null);
			}
		}
		
		
		printFPS();
	
		
	}
	
	public void printFPS() {
		count++;
		if (System.currentTimeMillis() - start > 1000) {
			System.out.println(count);
			count = 0;
			start = System.currentTimeMillis();
		}
	}
	
	
	public void loadSprites() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				sprites.add(img.getSubimage(j * 32, i * 32, 32, 32));
			}
		}
	}
	
}
