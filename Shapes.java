package com.mavenNov22.MavenNov25;

//The main abstract class
abstract class Shapes {
	protected Color color; // this is the bridge which connects abstract and implementor
	public Shapes(Color color)
	{
		this.color=color;
	}
	abstract void draw();

}

//Refined abstract class
class Circle extends Shapes{
	public Circle(Color color)
	{
		super(color);
	}
	public void draw()
	{
		System.out.println("Circle is drawn");
		color.applyColor();
	}
	
}


class square extends Shapes{
	public square(Color color)
	{
		super(color);
	}
	
	public void draw()
	{
		System.out.println("Square is drawn");
		color.applyColor();
	}
}
