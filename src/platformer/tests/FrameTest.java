package platformer.tests;

/**
 * Project imports
 */
import platformer.view.*;
import platformer.controller.Controller;
/**
 * Reflection imports
 */
import java.lang.reflect.*;

import javax.swing.JFrame;

/**
 * Testing imports
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FrameTest
{
	private GameWindow testedFrame;

	@BeforeEach
	void setUp() throws Exception
	{
		this.testedFrame = new GameWindow(new GamePanel(null)); 
	}

	@AfterEach
	void tearDown() throws Exception
	{
		this.testedFrame = null;
	}

	@Test
	void testGameFrame()
	{
		assertTrue(testedFrame instanceof JFrame, "GameFrame needs to extend JFrame");
		Method [] methods = testedFrame.getClass().getDeclaredMethods();
//		assertTrue(methods.length == 1, "You need exactly 1 method in the PokeFrame");
//		assertTrue(testedFrame.getTitle().length() > 5, "Your title needs at least 6 letters");
//		assertTrue(!testedFrame.isResizable(), "Your PokeFrame should NOT be resizable!");
		//assertTrue(testedFrame.getTitle().toLowerCase().contains("poke"), "Your title needs to have poke in it");
//		assertTrue(testedFrame.getContentPane() instanceof GameWindow, "Your PokeFrame needs to have a PokePanel inside");
	}
}
