package platformer.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

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
	private float xDir = 1f;
	private float yDir = 1f;
	private int frames = 0;
	private long lastCheck = 0;
	private Color color = new Color(150, 20, 90);
	private Random random;
	
	
	public GamePanel()
	{
		random = new Random();
		mouseInputs = new MouseInputs(this);
		setPanelSize();
		this.addKeyListener(new KeyboardInputs(this));
		this.addMouseListener(mouseInputs);
		this.addMouseMotionListener(mouseInputs);
		
	}
	
	
	
	private void setPanelSize() 
	{
		Dimension size = new Dimension(1280, 800);
		this.setMinimumSize(size);
		
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
		
		
		updateRectangle();
		g.setColor(color);
		g.fillRect((int) xDelta, (int) yDelta, 200, 50);
		
		
		
		
		
		
		
		
	}



	private void updateRectangle() 
	{
		xDelta += xDir;
		if (xDelta > 400 || xDelta < 0)
		{
			xDir *= -1;
			color = getRndColor();
		}
		
		yDelta += yDir;
		if (yDelta > 400 || yDelta < 0)
		{
			yDir *= -1;
			color = getRndColor();
		}
		
		
	}



	private Color getRndColor() 
	{
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);
		
		return new Color(r, g, b);
	}
	
}
