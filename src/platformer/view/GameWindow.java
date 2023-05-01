package platformer.view;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class GameWindow extends JFrame
{
	
	private JFrame gameFrame;
	
	
	public GameWindow(GamePanel gamePanel)
	{
		gameFrame = new JFrame();
		
		
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.add(gamePanel);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setResizable(false);
		gameFrame.pack();
		gameFrame.setVisible(true);
		gameFrame.addWindowFocusListener(new WindowFocusListener() 
				{

					@Override
					public void windowGainedFocus(WindowEvent e) {
						
						
					}

					@Override
					public void windowLostFocus(WindowEvent e) {
						gamePanel.getGame().windowFocusLost();					
					}
			
				});
		
	}
	
	
	
	
}
