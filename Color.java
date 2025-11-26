package com.mavenNov22.MavenNov25;

//Implementor interface
public interface Color {

	void applyColor();
}

class RedColor implements Color{
	@Override
	public void applyColor() {
		System.out.println("Red color is applied");
	}
}

class BlueColor implements Color{
	@Override
	public void applyColor()
	{
		System.out.println("Blue color is applied");
	}
}
