package com.bridgeit.dto;

import com.bridgeit.interfac.Shape;

public class Circle implements Shape{
	private Point center;

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("circle is drawn at center ("+center.getX()+","+center.getY()+")");
		
	}

}
