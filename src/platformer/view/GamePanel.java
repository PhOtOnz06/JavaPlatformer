package platformer.view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	private int xDelta = 100;
	private int yDelta = 100;
	private int xDir = 1;
	private int yDir = 1;
	private int frames = 0;
	private long lastCheck = 0;
	
	
	public GamePanel()
	{
		mouseInputs = new MouseInputs(this);
		this.addKeyListener(new KeyboardInputs(this));
		this.addMouseListener(mouseInputs);
		this.addMouseMotionListener(mouseInputs);
		
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
		g.fillRect(xDelta, yDelta, 200, 50);
		
		frames++;
		if (System.currentTimeMillis() - lastCheck >= 1000)
		{
			lastCheck = System.currentTimeMillis();
			System.out.println("FPS: " + frames);
			frames = 0;
		}
		
		
		repaint();
	}



	private void updateRectangle() 
	{
		xDelta += xDir;
		if (xDelta > 400 || xDelta < 0)
		{
			xDir *= -1;
		}
		
		yDelta += yDir;
		if (yDelta > 400 || yDelta < 0)
		{
			yDir *= -1;
		}
		
		
	}
	
}
