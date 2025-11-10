package Scenes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import main.Game;
import main.GameStates;
import ui.MyButton;

public class Menu extends Scene implements SceneMethods{

	private BufferedImage img;
	private ArrayList<BufferedImage> sprites = new ArrayList<>();
	
	private MyButton bPlaying;
	private MyButton bSettings;
	private MyButton bQuit;
	
	public Menu(Game game) {
		super(game);
		importAtlas();
		loadSprites();
		
		bPlaying = new MyButton("Play", 100, 100, 100, 30);
	}

	@Override
	public void render(Graphics g) {
		drawButtons(g);
	}
	
	private void drawButtons(Graphics g) {
		
		bPlaying.draw(g);
		
	}

	private void loadSprites() {
	    int spriteSize = 32; // since 320/10 = 32

	    for (int y = 0; y < 10; y++) {        // rows
	        for (int x = 0; x < 10; x++) {    // columns
	            BufferedImage sub = img.getSubimage(
	                    x * spriteSize, 
	                    y * spriteSize, 
	                    spriteSize, 
	                    spriteSize
	            );
	            sprites.add(sub);
	        }
	    }
	}
	
	private void importAtlas() {
	    try {
	        img = ImageIO.read(new File("res/spriteatlas.png"));
	    } catch (IOException e) {
	        e.printStackTrace();
	        System.out.println("Could not load sprite atlas!");
	    }
	}

	@Override
	public void mouseClicked(int x, int y) {
		if (bPlaying.getBounds().contains(x, y)) {
			GameStates.gameState = GameStates.PLAYING;
		}
		
	}

	public void mouseMoved(int x, int y) {
		if (bPlaying.getBounds().contains(x, y)) {
			bPlaying.setMouseOver(true);
		}
		else {
			bPlaying.setMouseOver(false);
		}
		
	}

}
