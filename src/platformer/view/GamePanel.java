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
import platformer.controller.Game;

import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;

//test test hope this works
// another test idk why my repo isnt working
//Final test hoping ive got it right


public class GamePanel extends JPanel
{
	
	private MouseInputs mouseInputs;
	private Game game;
	
	public GamePanel(Game game)
	{
		mouseInputs = new MouseInputs(this);
		this.game = game;
		setPanelSize();
		this.addKeyListener(new KeyboardInputs(this));
		this.addMouseListener(mouseInputs);
		this.addMouseMotionListener(mouseInputs);
		
	}

	private void setPanelSize() 
	{
		Dimension size = new Dimension(1280, 800);
		this.setMinimumSize(size);
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		
	}
	
	public void updateGame()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		game.render(g);
	}
	
	public Game getGame()
	{
		return game;
	}
	
}
