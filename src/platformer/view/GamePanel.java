package platformer.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

//test test hope this works
// another test idk why my repo isnt working
//Final test hoping ive got it right


public class GamePanel extends JPanel
{
	
	private MouseInputs mouseInputs;
	private float xDelta = 100;
	private float yDelta = 100;
	private int frames = 0;
	private long lastCheck = 0;
	private BufferedImage img;
	private BufferedImage subImg;

	
	
	public GamePanel()
	{
		
		mouseInputs = new MouseInputs(this);
		
		importImg();
		
		setPanelSize();
		this.addKeyListener(new KeyboardInputs(this));
		this.addMouseListener(mouseInputs);
		this.addMouseMotionListener(mouseInputs);
		
	}
	
	
	
	private void importImg()   
	{
		InputStream is = getClass().getResourceAsStream("/player_sprites.png");
		
		try 
		{
			img = ImageIO.read(is);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
			
		
		
		}



	private void setPanelSize() 
	{
		Dimension size = new Dimension(1280, 800);
		this.setMinimumSize(size);
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		
	}



	public void changeXDelta(int value)
	{
		this.xDelta += value;
		
	}
	
	public void changeYDelta(int value)
	{
		this.yDelta += value;
		
	}
	
	public void setRectPos(int x, int y)
	{
		this.xDelta = x;
		this.yDelta = y;
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		subImg = img.getSubimage(64*1, 8*40, 64, 40);
		g.drawImage(subImg, (int) xDelta, (int) yDelta, 128, 80, null);
		
		
		
		
		
		
	}







	
}
