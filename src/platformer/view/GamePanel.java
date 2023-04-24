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
	
	public GamePanel()
	{
		mouseInputs = new MouseInputs();
		this.addKeyListener(new KeyboardInputs());
		this.addMouseListener(mouseInputs);
		this.addMouseMotionListener(mouseInputs);
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.fillRect(100, 100, 200, 50);
		
		
		
		
		
	}
	
}
