package platformer.view;

import java.awt.Color;

import javax.swing.JFrame;

public class GameWindow extends JFrame
{
	
	private JFrame gameFrame;
	
	
	public GameWindow(GamePanel gamePanel)
	{
		gameFrame = new JFrame();
		
		gameFrame.setSize(400, 400);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.add(gamePanel);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setVisible(true);
		
		
	}
	
	
	
	
}
