package helperMethods;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadSave {
	
	public static BufferedImage getSpriteAtlas() {
		BufferedImage img = null;
		try {
	        img = ImageIO.read(new File("res/spriteatlas.png"));
	    } catch (IOException e) {
	        e.printStackTrace();
	        System.out.println("Could not load sprite atlas!");
	    }
		return img;
	}
	
}
