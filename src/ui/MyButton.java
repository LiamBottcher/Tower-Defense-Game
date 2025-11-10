package ui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MyButton {
	
	private String text;
	private int x;
	private int y;
	private int width;
	private int height;
	private Rectangle bounds;
	private boolean mouseOver;
	
	public MyButton(String text, int x, int y, int width, int height) {
		this.text=text;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		initBounds();
	}
	
	private void initBounds() {
		this.bounds = new Rectangle(x, y, width, height);
	}
	
	public void draw(Graphics g) {
	    // body
		drawBody(g);
	    
	    // border
	    drawBorder(g);

	    // center text
	    FontMetrics fm = g.getFontMetrics();
	    int textWidth = fm.stringWidth(text);
	    int textHeight = fm.getAscent() - fm.getDescent();

	    int textX = x + (width - textWidth) / 2;
	    int textY = y + (height + textHeight) / 2;

	    g.drawString(text, textX, textY);
	}

	
	private void drawBorder(Graphics g) {
		g.setColor(Color.black);
	    g.drawRect(x, y, width, height);
		
	}

	private void drawBody(Graphics g) {
		if (mouseOver) {
			g.setColor(Color.gray);
		}
		else {
			g.setColor(Color.white);
		}
	    g.fillRect(x, y, width, height);
		
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void setMouseOver(boolean b) {
		mouseOver = b;
		
	}
	
}
