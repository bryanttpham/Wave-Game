package com.tutorial.main;

import java.awt.Graphics;

//refer to as all the gameObjects
//enemy object and player object are both considered gameObject
//inheriting all of the functions that we put within our game object

public abstract class gameObject {

	//only classes the inherit gameObject can use int x and y
	protected int x;
	protected int y; 
	protected ID id;
	protected int velX,velY;
	
	public gameObject(int x, int y,ID id)
	{
		this.x=x;
		this.y=y;
		this.id=id;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	public void setX(int x)
	{
		this.velX=x;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setId(ID id)
	{
		this.id=id;
	}
	
	public ID getId()
	{
		return id;
	}
	
	public void setVelX(int velX)
	{
		this.velX=velX;
	}
	
	public int getVelX()
	{
		return velX;
	}
	
	public void setVelY(int velY)
	{
		this.velY=velY;
	}
	
	public int getVelY()
	{
		return velY;
	}
}
