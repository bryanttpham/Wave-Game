package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

//update and render all of our objects
//loop through all our object and individually update and render them

public class Handler {

	LinkedList<gameObject> object = new LinkedList<gameObject>();
	
	public void tick()
	{
		for(int i=0; i< object.size(); i++)
		{
			//get method gets the object in the specific order added
			gameObject tempObject= object.get(i);
			
			tempObject.tick();
		}
		
	}
	public void render(Graphics g)
	{
		for( int i=0;i<object.size(); i++)
		{
			gameObject tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	
	public void addObject(gameObject object)
	{
		this.object.add(object);
	}
	
	public void removeObject(gameObject object)
	{
		this.object.remove(object);
	}
	
	
}
