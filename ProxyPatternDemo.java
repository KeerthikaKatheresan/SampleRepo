package com.mavenNov22.MavenNov25;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image=new ProxyImage("photo.jpg");
		image.display(); // First call → "Loading photo.jpg" + "Displaying photo.jpg"
		 image.display();// Second call → Only "Displaying photo.jpg"
		

	}

}
