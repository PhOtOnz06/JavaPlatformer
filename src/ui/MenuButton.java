package ui;

import java.awt.image.BufferedImage;

import gamestates.GameState;
import utilz.LoadSave;

public class MenuButton 
{
	private int xPos;
	private int yPos;
	private int rowIndex;
	private GameState state;
	private BufferedImage[] imgs;
	
	
	public MenuButton(int xPos, int yPos, int rowIndex, GameState state)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.rowIndex = rowIndex;
		this.state = state;
		loadimgs();
		
		
		
	}


	private void loadimgs() {
		imgs = new BufferedImage[3];
		BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.MENU_BUTTONS);
		
	}
	
	
	
	
}
