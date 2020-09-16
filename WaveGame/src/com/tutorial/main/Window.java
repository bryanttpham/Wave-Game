package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

	/**
	 * 
	 */
	
	//Check what a serialVersionUID is
	private static final long serialVersionUID = -240840600533728354L;
	
	public Window(int width, int height, String title,Game game)
	{
		
		
		//Frame of our window .. 
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize((new Dimension(width,height)));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		//setDefaultCloseOperation makes the x button work
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//can we resize our window
		frame.setResizable(false);
		
		//window would start at top left if not set... setting to null will start frame in the middle
		frame.setLocationRelativeTo(null);
		
		//adding game class in to our frame
		frame.add(game);
		
		//set game to visible so we can see game
		frame.setVisible(true);
		
		//running start method
		game.start();
		
	}
}
