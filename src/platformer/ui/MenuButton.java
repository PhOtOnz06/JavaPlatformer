package platformer.ui;

import static platformer.utilz.Constants.UI.Buttons.*;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import platformer.gamestates.GameState;
import platformer.utilz.LoadSave;


public class MenuButton 
{
	private int xPos;
	private int yPos;
	private int rowIndex;
	private int index;
	private int xOffsetCenter = B_WIDTH / 2;
	private boolean mouseOver;
	private boolean mousePressed;
	private Rectangle bounds;
	
	private GameState state;
	private BufferedImage[] imgs;
	
	
	public MenuButton(int xPos, int yPos, int rowIndex, GameState state)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.rowIndex = rowIndex;
		this.state = state;
		loadimgs();
		initBounds();
		
		
	}


	private void initBounds()
	{
		bounds = new Rectangle(xPos - xOffsetCenter, yPos, B_WIDTH, B_HEIGHT);
		
	}


	private void loadimgs() 
	{
		imgs = new BufferedImage[3];
		BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.MENU_BUTTONS);
		for (int i = 0; i < imgs.length; i++)
		{
			imgs[i] = temp.getSubimage(i * B_WIDTH_DEFAULT, rowIndex * B_HEIGHT_DEFAULT, B_WIDTH_DEFAULT, B_HEIGHT_DEFAULT);
		}
		
	}
	
	public void draw(Graphics g) 
	{
		g.drawImage(imgs[index], xPos - xOffsetCenter, yPos, B_WIDTH, B_HEIGHT, null);
	}
	
	public void update()
	{
		index = 0;
		if (mouseOver)
		{
			index = 1;
		}
		if (mousePressed)
		{
			index = 2;
		}
	}


	public boolean isMouseOver() 
	{
		return mouseOver;
	}


	public void setMouseOver(boolean mouseOver)
	{
		this.mouseOver = mouseOver;
	}


	public boolean isMousePressed() 
	{
		return mousePressed;
	}


	public void setMousePressed(boolean mousePressed) 
	{
		this.mousePressed = mousePressed;
	}
	
	public void applyGameState()
	{
		GameState.state = state;
	}
	
	public Rectangle getBounds() 
	{
		return bounds;
	}
	
	
	public void resetBools()
	{
		mouseOver = false;
		mousePressed = false;
	}


	
	
	
}