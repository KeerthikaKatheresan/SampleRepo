package com.mavenNov22.MavenNov25;

public class BridgePatternDemo {

	public static void main(String[] args) {
		//create obj for concrete classes
		Color red=new RedColor();
		Color blue=new BlueColor();
		
		//create obj for refined classes
		Shapes redCircle=new Circle(red);
		Shapes blueSquare=new square(blue);
		
		redCircle.draw();
		blueSquare.draw();
		
		

	}

}
